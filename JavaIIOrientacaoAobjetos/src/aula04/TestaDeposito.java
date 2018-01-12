package aula04;

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