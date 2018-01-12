package aula05;

public class Circulo implements AreaCalculavel 
{
	private double raio;
	
	public Circulo( double raio ) 
	{
		this.raio = raio;
	}
	
	@Override
	public double calculaArea() 
	{
		return Math.pow( this.raio, 2 ) * Math.PI;
	}
}