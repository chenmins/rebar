package com.bedatadriven.rebar.less.rebind;

import com.google.common.css.compiler.ast.ErrorManager;
import com.google.common.css.compiler.ast.GssError;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.TreeLogger.Type;

class LoggerErrorManager implements ErrorManager {

	private final TreeLogger logger;
	private boolean hasErrors;

	LoggerErrorManager(TreeLogger logger) {
		this.logger = logger;
	}

	@Override
	public void generateReport() {
		// do nothing
	}

	@Override
	public boolean hasErrors() {
		return hasErrors;
	}

	@Override
	public void report(GssError error) {
		logger.log(Type.ERROR, error.getMessage());
		hasErrors = true;
	}

	@Override
	public void reportWarning(GssError warning) {
		logger.log(Type.WARN, warning.getMessage());
	}

	public void checkErrors() throws UnableToCompleteException {
		if (hasErrors) {
			throw new UnableToCompleteException();
		}
	}
}