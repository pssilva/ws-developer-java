package br.com.springws.service;

import org.springframework.stereotype.Service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Service
public class FinancialControlImp implements IFinancialControl{
	

    private static final Log logger = LogFactory.getLog(FinancialControlImp.class);
    
	@Override
	public double resultsCalculation() {
		// TODO Auto-generated method stub
		return 0;
	}

}
