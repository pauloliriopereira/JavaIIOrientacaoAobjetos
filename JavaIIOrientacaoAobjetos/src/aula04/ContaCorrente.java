package aula04;

public class ContaCorrente extends Conta
{
	@Override
	public void atualiza( double taxa ) 
	{
		this.saldo += taxa * 2;
	}
}