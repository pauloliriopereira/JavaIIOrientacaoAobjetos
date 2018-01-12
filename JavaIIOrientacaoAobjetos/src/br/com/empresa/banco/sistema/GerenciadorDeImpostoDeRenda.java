package br.com.empresa.banco.sistema;

import br.com.empresa.banco.conta.Tributavel;

public class GerenciadorDeImpostoDeRenda 
{
	private double total;

	public void adiciona( Tributavel t ) 
	{
		System.out.println( "Adiciona tibutável: " + t );
		this.total += t.calculaTributos();
	}
	
	public double getTotal() 
	{
		return this.total;
	}
}