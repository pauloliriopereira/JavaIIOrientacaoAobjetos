package aula04;

public abstract class Conta 
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
	
	public abstract void atualiza( double taxa );
}