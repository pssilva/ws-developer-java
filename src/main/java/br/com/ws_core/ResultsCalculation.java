/**
 * @author: Paulo Sérgio
 * @email:  pss1suporte@gmail.com
 */
package br.com.ws_core;

import java.util.Date;

/**
 * @name: ResultsCalculation - Apuração de Resultado
 * Classe projetada com base nas orientações contidas no Manual 
 * Como Elaborar Controles Financeiros: 6. APURACÃO DE RESULTADOS.
 * 
 * @see https://www.sebraemg.com.br/atendimento/bibliotecadigital/documento/Cartilha-Manual-ou-Livro/Como-elaborar-Controles-Financeiros
 * 
 * @concept: A apuração mensal de resultados é um instrumento de gestão econômica 
 * que possibilita ao empresário conhecer os resultados de seu negócio, no fim de 
 * determinado período, como por exemplo, no fim cada mês, de cada trimestre, de 
 * cada semestre ou de cada ano.
 * 
 * @concept: A apuração de resultados representa a diferença entre as vendas 
 * totais e os custos e despesas totais (do período que se pretende apurar).
 * 
 */

public class ResultsCalculation {

	private Date dtStart;
	private Date dtEnd;
	private double totalSales;
	private double totalCosts;
	private double totalExpenses;
	
	public ResultsCalculation() {}

	public ResultsCalculation(Date dtStart, Date dtEnd, 
							 double totalSales, double totalCosts, 
							 double totalExpenses) {
		this.dtStart = dtStart;
		this.dtEnd = dtEnd;
		this.totalSales = totalSales;
		this.totalCosts = totalCosts;
		this.totalExpenses = totalExpenses;
	}

	/** 
	 * A apuração de resultados representa a diferença entre as vendas 
	 * totais e os custos e despesas totais (do período que se pretende apurar).
	 * 
	 * @param: Date dtStart - Data início do perpíodo analisado para a apuração de resultado
	 * @param: Date dtEnd - Data final do perpíodo analisado para a apuração de resultado
	 * 
	 * @return: double resultCalculator - é a diferença entre 
	 * (total de Vendas - (total de Custos + total de Despesas))
	 */
	public double resultsCalculation(Date dtStart, Date dtEnd){
		double resultCalculator = 0.0;
		
		resultCalculator = (this.totalSales - (this.totalCosts + this.totalExpenses));
		
		return resultCalculator;
	}
	

	/** 
	 * A apuração de resultados representa a diferença entre as vendas 
	 * totais e os custos e despesas totais (do período que se pretende apurar).
	 * 
	 * @return: double resultCalculator - é a diferença entre 
	 * (total de Vendas - (total de Custos + total de Despesas))
	 * 
	 */
	public double resultsCalculation(){
		return (this.totalSales - (this.totalCosts + this.totalExpenses));
	}
	
	public void setTotal(Date dtStart, Date dtEnd) throws Exception{ 
		throw new Exception("Funcionalidade não implementada!");
	}
	
	public Date getDtStart() {
		return dtStart;
	}
	public void setDtStart(Date dtStart) {
		this.dtStart = dtStart;
	}
	public Date getDtEnd() {
		return dtEnd;
	}
	public void setDtEnd(Date dtEnd) {
		this.dtEnd = dtEnd;
	}
	public double getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(double totalSales) {
		this.totalSales = totalSales;
	}
	public double getTotalCosts() {
		return totalCosts;
	}
	public void setTotalCosts(double totalCosts) {
		this.totalCosts = totalCosts;
	}
	public double getTotalExpenses() {
		return totalExpenses;
	}
	public void setTotalExpenses(double totalExpenses) {
		this.totalExpenses = totalExpenses;
	}
	
}
