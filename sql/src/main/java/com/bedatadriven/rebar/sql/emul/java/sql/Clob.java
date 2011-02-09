/*
 * Copyright 2009-2010 BeDataDriven (alex@bedatadriven.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package java.sql;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public interface Clob {
  long length() throws SQLException;
  String getSubString(long pos, int length) throws SQLException;
  Reader getCharacterStream() throws SQLException;
  InputStream getAsciiStream() throws SQLException;
  long position(String searchstr, long start) throws SQLException;
  long position(Clob searchstr, long start) throws SQLException;
  int setString(long pos, String str) throws SQLException;
  int setString(long pos, String str, int offset, int len) throws SQLException;
  OutputStream setAsciiStream(long pos) throws SQLException;
  Writer setCharacterStream(long pos) throws SQLException;
  void truncate(long len) throws SQLException;
  void free() throws SQLException;
  Reader getCharacterStream(long pos, long length) throws SQLException;

}
