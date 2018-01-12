package aula04;

public class GerenciadorDeImpostoDeRenda 
{
	private double total;

	void adiciona( Tributavel t ) 
	{
		System.out.println( "Adiciona tibutável: " + t );
		this.total += t.calculaTributos();
	}
	
	public double getTotal() 
	{
		return this.total;
	}
}