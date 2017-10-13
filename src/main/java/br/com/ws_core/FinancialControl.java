/**
 * @author: Paulo Sérgio
 * @email:  pss1suporte@gmail.com
 */
package br.com.ws_core;

/**
 * Classe projetada com base nas orientações contidas no Manual 
 * Como Elaborar Controles Financeiros.
 */
public abstract class FinancialControl { 
	
	private ResultsCalculation resultsCalculation;

	public ResultsCalculation getResultsCalculation() {
		return resultsCalculation;
	}

	public void setResultsCalculation(ResultsCalculation resultsCalculation) {
		this.resultsCalculation = resultsCalculation;
	}
	
}
