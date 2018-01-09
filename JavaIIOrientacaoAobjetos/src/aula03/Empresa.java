package aula03;

public class Empresa 
{
	private String nome;
	private String cnpj;
	private Funcionario[] empregados;
	private int livre = 0;
	
	public Empresa( int tamanho ) 
	{
		this.empregados = new Funcionario[ tamanho ];
	}
	
	public void adiciona( Funcionario f ) 
	{
		this.empregados[ this.livre ] = f;
		this.livre++;
	}
	
	public void mostraEmpregados() 
	{
		for( int i = 0; i < this.livre; i++ ) 
		{
			System.out.println( "Funcionário na posição: " + empregados[ i ] );
			System.out.println( "R$ " + empregados[ i ].getSalario() );
		}
	}
	
	public void mostraTodasAsInformacoes() 
	{
		for( int i = 0; i < this.livre; i++ ) 
		{
			System.out.println( "Funcionário na posição: " + empregados[ i ] );
			empregados[ i ].mostra();
		}
	}
	
	boolean contem( Funcionario f ) 
	{
        for( int i = 0; i < this.livre; i++ ) 
        {
            if( f == this.empregados[ i ] ) 
            {
                return true;
            }
        }
        return false;
    }
	
	public String getNome() 
	{
		return this.nome;
	}
	
	public void setNome( String nome ) 
	{
		this.nome = nome;
	}
	
	public String getCnpj() 
	{
		return this.cnpj;
	}
	
	public void setCnpj( String cnpj ) 
	{
		this.cnpj = cnpj;
	}
	
	public Funcionario getFuncionario( int posicao ) 
	{
	        return this.empregados[ posicao ];
	}
	
	public void setFuncionario( Funcionario empregado, int posicao ) 
	{
		this.empregados[ posicao ] = empregado;
	}
}