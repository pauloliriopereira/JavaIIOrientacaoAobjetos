package aula04;

public class ValorInvalidoException extends RuntimeException 
{	
	public ValorInvalidoException( double valor ) 
	{
		super( "Valor invalido: " + valor );
	}
	
	public ValorInvalidoException() {}
}