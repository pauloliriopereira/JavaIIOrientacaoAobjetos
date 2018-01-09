package aula03;

public class Funcionario 
{
	private int identificador;
	private String nome;
	private String departamento;
	private double salario;
	private Data data = new Data();
	private String rg;
	static private int sequencia;
	
	public Funcionario( String nome ) 
	{
		this.identificador = ++sequencia;
		this.nome = nome;
	}
	
	public Funcionario()
	{
		this.identificador = ++sequencia;
	}
	
	public int getIdentificador() 
	{
		return this.identificador;
	}
	
	public void recebeAlmento( double valor )
	{
		this.salario += valor; 
	}
	
	public double getGanhoAnual()
	{
		return this.salario * 12;
	}
	
	public void mostra() 
	{
		System.out.println( this.identificador );
		System.out.println( this.nome );
		System.out.println( this.departamento );
		System.out.println( this.salario );
		System.out.println( this.data.getFormatada() );
		System.out.println( this.rg );
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome( String nome ) 
	{
		this.nome = nome;
	}
	
	public String getDepartamento() 
	{
		return this.departamento;
	}
	
	public void setDepartamento( String departamento ) 
	{
		this.departamento = departamento;
	}
	
	public double getSalario() 
	{
		return this.salario;
	}
	
	public void setSalario( double salario ) 
	{
		this.salario = salario;
	}
	
	public Data getData() 
	{
		return this.data;
	}
	
	public void setData( Data data ) 
	{
		this.data = data;
	}
	
	public String getRg() 
	{
		return this.rg;
	}
	
	public void setRg( String rg ) 
	{
		this.rg = rg;
	}
	
	public double getBonificacao() 
	{
		return this.salario * 1.2;
	}
}