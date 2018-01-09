package aula02;

public class Conta 
{
	protected double saldo;
	
	public double getSaldo() 
	{
		return this.saldo;
	}
	
	public void deposita( double deposito ) 
	{
		this.saldo += deposito;
	}
	
	public void saca( double valor ) 
	{
		if( valor <= this.saldo ) 
		{
			this.saldo -= valor;
		}
		else 
		{
			System.out.println( "Saldo induficiente" );
		}
	}
	
	public void atualiza( double taxa ) 
	{
		this.saldo += this.saldo * taxa;
	}
}