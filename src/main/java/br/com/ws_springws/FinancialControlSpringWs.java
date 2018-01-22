package br.com.ws_springws;

import java.util.Date;

import br.com.ws_core.FinancialControl;
import br.com.ws_core.IFinancialControl;
import br.com.ws_core.ResultsCalculation;

/**
 * 
 * */
public class FinancialControlSpringWs extends FinancialControl 
	implements IFinancialControl {

	@Override
	public ResultsCalculation getResultsCalculation(Date dtStart, Date dtEnd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double resultsCalculation1() {
		// TODO Auto-generated method stub
		return 0;
	}
}
