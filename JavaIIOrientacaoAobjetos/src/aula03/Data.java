package aula03;

public class Data 
{
	private int dia;
	private int mes;
	private int ano;
	
	public Data() {}
	
	public Data( int dia, int mes, int ano ) 
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		if( !validaData() ) 
		{
			System.out.println( "Data Inválida" );
		}
	}
	
	public String getFormatada() 
	{
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

	public int getDia() 
	{
		return dia;
	}

	public void setDia( int dia ) 
	{
		this.dia = dia;
	}

	public int getMes() 
	{
		return mes;
	}

	public void setMes( int mes ) 
	{
		this.mes = mes;
	}

	public int getAno() 
	{
		return ano;
	}

	public void setAno( int ano ) 
	{
		this.ano = ano;
	}
	
	private boolean validaData() 
	{
		boolean valor = false;
		switch ( this.mes ) 
		{
			case 2: if( this.dia >= 1 && this.dia <= 28 + anoBissexto() ) 
					{
						valor = true;
					} 
					break;
			case 4:
			case 6:
			case 9:
			case 11: if( this.dia >= 1 && this.dia <= 30 ) 
					 {
						valor = true;
					 }
					 break;
			default: if( this.mes < 1 || this.mes > 12 ) 
					 {
				 		break;
					 } 
					 else if( this.dia >= 1 && this.dia <= 31 )
					 {
						 valor = true;
					 }
					 break;
		}
		return valor;
	}
	
	private int anoBissexto()
	{
		if( ( this.ano % 4 == 0 ) && ( this.ano % 100 != 0 ) || ( this.ano % 400 == 0 ) )
		{
			return 1;
		}
		return 0;
	}
}