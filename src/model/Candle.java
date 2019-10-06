package model;
/**
*Esta clase representa una vela con color tamaño, esencia, e iluminancia.
*@author Benjamin Silva Salgado
*@version 1.0
*/
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
	*<b>DES: </b> Este método concatena los atributos de la clase Candle en una cadena.<br>
	*<b>PRE: </b> Todos los atributos (color,essence: cadenas de texto) y (size, iluminance: números reales) están inicialidos en la clase.<br>
	*@return  candleInformation Es una cadena de texto que contiene información de los atributos de la clase Candle. candleInformation !=null.
	*/
	public String showCandleInformation()
	{
		String candleInformation="";
		
		candleInformation = ("\nColor: " + color + "\nSize: " + size + "\nEssence: " + essence + "\nIlumenence: " + iluminance);
		
		return candleInformation;
	}
}