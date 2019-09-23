public class Candle.java
{
	//Atributos
	
	private String color;
	private String size;
	private String essence;
	private String ilumence;
	
	//Constructor
	public Candle(String color, int size, String essence, int iluminance)
	{
		this.color = color;
		this.size = ""+size+" cm";
		this.essence = essence;
		this.ilumence = ""+iluminance+" Lux";
	}
	
	//Modificadores
	
	//Getters
	public String GetColor()
	{
		return this.color;
	}
	
	public String GetSize()
	{
		return this.size;
	}
	
	public String GetEssence()
	{
		return this.essence;
	}
	
	public String GetIluminence()
	{
		return this.Iluminence;
	}
	
	
	//Setters
	public void SetColor(String color)
	{
		this.color = color;
	}
	
	public void SetSize(String size)
	{
		this.size = size;
	}
	
	public void setEssence(String essence)
	{
		this.essence = essence;
	}
	
	public void SetIluminence(String ilumence)
	{
		this.Iluminence = ilumence;
	}
}