package com.javatechnology;

import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.diagnostics.FailureAnalyzer;

public class CustomFailureAnalyzer implements FailureAnalyzer{

	@Override
	public FailureAnalysis analyze(Throwable failure) {
		return new FailureAnalysis("custom Failure Message", failure.getMessage(), failure);
	}

}
