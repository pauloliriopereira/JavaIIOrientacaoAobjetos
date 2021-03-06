package aula04;

public class TestaContas 
{
	public static void main( String[] args ) 
	{
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		cc.deposita( 1000 );
		cp.deposita( 1000 );
		
		AtualizadorDeContas adc = new AtualizadorDeContas( 0.01 );
		
		adc.roda( cc );
		adc.roda( cp );
		
		System.out.printf( "O saldo �: %.2f\n", adc.getSaldoTotal() );
	}
}