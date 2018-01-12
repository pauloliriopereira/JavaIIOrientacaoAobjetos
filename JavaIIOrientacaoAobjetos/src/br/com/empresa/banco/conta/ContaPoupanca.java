package br.com.empresa.banco.conta;

public class ContaPoupanca extends Conta 
{
	@Override
	public void atualiza( double taxa ) 
	{
		this.saldo += taxa * 3;
	}
	
	@Override
	public void deposita( double deposito ) 
	{
		this.saldo += deposito - 0.10;
	}
}