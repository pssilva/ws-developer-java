package br.com.ws_core;

import java.util.Date;

public interface IFinancialControl {

	ResultsCalculation getResultsCalculation();
	double resultsCalculation1();
	ResultsCalculation getResultsCalculation(Date dtStart, Date dtEnd); 
}
