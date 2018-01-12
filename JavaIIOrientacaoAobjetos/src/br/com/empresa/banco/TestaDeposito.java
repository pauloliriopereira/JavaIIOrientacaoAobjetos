package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaDeposito 
{
	public static void main( String[] args ) 
	{
		Conta cp = new ContaCorrente();
		try 
		{
			cp.deposita( -100 );
		} 
		catch( Exception e ) 
		{
			System.out.println( e.getMessage() );
		}
	}
}