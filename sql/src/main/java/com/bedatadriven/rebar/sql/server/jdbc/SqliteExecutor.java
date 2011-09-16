package com.bedatadriven.rebar.sql.server.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.bedatadriven.rebar.time.calendar.LocalDate;

public class SqliteExecutor extends JdbcExecutor {

	private String connectionUrl;

	public SqliteExecutor(String connectionUrl) {
	  this.connectionUrl = connectionUrl;
  }
	
	@Override
  protected Connection openConnection() throws ClassNotFoundException, SQLException {
	  Class.forName("org.sqlite.JDBC");
    return DriverManager.getConnection(connectionUrl);
  }

	@Override
  protected boolean doBeginTransaction() throws SQLException {
		try {
			Statement stmt = conn.createStatement();
		  stmt.execute("BEGIN EXCLUSIVE TRANSACTION");
		  stmt.close();
		  
		  return true;
	    
    } catch(SQLException e) {
    	if(e.getMessage().contains("[SQLITE_BUSY]")) {
    		return false; // database is locked; attempt will be rescheduled
    	} else {
    		throw e; // some other fatal error
    	}
    }
  }

	@Override
  protected void doCommit() throws SQLException {
		 Statement stmt = conn.createStatement();
		 stmt.execute("END TRANSACTION");
		 stmt.close();
  }

	@Override
  protected void setParam(PreparedStatement stmt, Object[] params, int i)
      throws SQLException {
	  if(params[i] instanceof java.util.Date) {
	  	stmt.setDouble(i+1, ((java.util.Date)params[i]).getTime());
	  } else if(params[i] instanceof LocalDate) {
	  	stmt.setString(i+1, ((LocalDate)params[i]).toString());
	  } else {
	  	stmt.setObject(i+1, params[i]);
	  }
  }

	@Override
  public void rollback() throws Exception {
		 Statement stmt = conn.createStatement();
		 stmt.execute("ROLLBACK TRANSACTION");
		 stmt.close();
  }
	
	
}
