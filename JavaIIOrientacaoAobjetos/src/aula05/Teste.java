package aula05;

public class Teste 
{
	public static void main( String[] args ) 
	{
		AreaCalculavel a = new Retangulo( 3, 2 );
		System.out.println( a.calculaArea() );
		
		a = new Circulo( 2 );
		System.out.println( a.calculaArea() );
	}
}