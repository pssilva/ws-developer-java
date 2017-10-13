package br.com.ws_core;

import java.util.Date;

public interface IFinancialControl {

	public ResultsCalculation getResultsCalculation();
	public ResultsCalculation getResultsCalculation(Date dtStart, Date dtEnd); 
}
