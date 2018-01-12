package aula04;

public class TestaGerenciadorDeImpostoDeRenda 
{
	public static void main( String[] args )
	{
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVda sv = new SeguroDeVda();
		gerenciador.adiciona( sv );
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita( 1000 );
		gerenciador.adiciona( cc );
		
		System.out.println( gerenciador.getTotal() );
	}
}