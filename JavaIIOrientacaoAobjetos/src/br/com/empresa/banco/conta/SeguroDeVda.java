package br.com.empresa.banco.conta;

public class SeguroDeVda implements Tributavel 
{
	@Override
	public double calculaTributos() 
	{
		return 42.0;
	}
}