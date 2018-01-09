package aula02;

public class ContaPoupanca extends Conta 
{
	@Override
	public void atualiza( double taxa ) 
	{
		super.atualiza( taxa * 3 );
	}
	
	@Override
	public void deposita( double deposito ) 
	{
		this.saldo += deposito - 0.10;
	}
}