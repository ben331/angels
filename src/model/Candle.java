package model;
public class Candle
{
	//Atributos
	
	private String color;
	private double size;
	private String essence;
	private double iluminance;
	
	//Constructor
	public Candle(String color, double size, String essence, double iluminance)
	{
		this.color = color;
		this.size = size;
		this.essence = essence;
		this.iluminance = iluminance;
	}
	
	
	//Modificadores
	
	//getters
	public String getColor()
	{
		return color;
	}
	
	public double getSize()
	{
		return size;
	}
	
	public String getEssence()
	{
		return essence;
	}
	
	public double getIluminance()
	{
		return iluminance;
	}
	
	
	//setters
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setSize(double size)
	{
		this.size = size;
	}
	
	public void setEssence(String essence)
	{
		this.essence = essence;
	}
	
	public void setIluminance(double ilumence)
	{
		this.iluminance = iluminance;
	}
	
	//Analizadores
	/**
	*<b>DES: </b> Este método concatena atributos de la clase Candle en una cadena.<br>
	*<b>PRE: </b> Todos los atributos requeridos son cadenas de texto y están inicializados en la clase. (color, size, essence, ilumence)<br>
	*@return  candleInformation Es una cadena de texto que contiene información de los atributos de la clase Candle. candleInformation !=null.
	*/
	public String showCandleInformation()
	{
		String candleInformation;
		
		candleInformation = ("\nColor: " + color + "\nSize: " + size + "\nEssence: " + essence + "\nIlumenence: " + iluminance);
		
		return candleInformation;
	}
	
	//Validaciones
	/**
	*<b>DES: </b> Este método determina si un número ingresado es positivo.<br>
	*<b>PRE: </b> El dato ingresado es un número real.<br>
	*@param num Es un número real. num!=null
	*@return validation Es un valor lógico; falso cuando expresa que el dato ingresado es negativo y verdadero cuando el número ingresado es positivo. validation !=null
	*/
	public boolean validatePositiveValue(double num)
	{
		boolean validation = false;
		if (num>=0)
		{
		validation = true;
		}
		return validation;
	}
}