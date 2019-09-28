package model;
import java.util.Scanner;
public class Angel
{
	Scanner reader = new Scanner(System.in);
	
	//Constantes
	//Constantes de dominio del atributo type (tipo)
	private final String ARCANGEL = "ARCANGEL";
	private final String QUERUBIN = "QUERUBIN";
	private final String SERAFIN = "SERAFIN";
	
	//Constantes de dominio del atributo power (poder)
	public final String PROTECTION = "PROTECTION";
	public final String HEALTH = "HEALTH";
	public final String ABUNDANCE = "ABUNDANCE";
	public final String JUSTICE = "JUSTICE";
	public final String LOYALTY = "LOYALTY";

	
	//Atributos
	private String name;
	private String type;
	private String image;
	private String prayer;
	private Date celebrationDate;
	private String power;
	private Candle angelCandle;
	
	//Métodos
	//Constructor
	public Angel(String name, int type, String image, String prayer, Date celebrationDate, int power, Candle angelCandle)
	{	
		this.name = name;
		
		switch (type)
		{
			case 1:
			this.type = ARCANGEL;
			case 2:
			this.type = QUERUBIN;
			case 3:
			this.type = SERAFIN;
		}
		
		this.image = image;
		
		this.prayer = prayer;
		
		this.celebrationDate =  celebrationDate;
		
		switch (power)
		{
			case 1:
			this.power = PROTECTION;
			case 2:
			this.power = HEALTH;
			case 3:
			this.power = ABUNDANCE;
			case 4:
			this.power = JUSTICE;
			case 5:
			this.power = LOYALTY;
			case 6:
			System.out.print("Type the power of this angel: ");
			this.power = reader.nextLine();
		}
		this.angelCandle =  angelCandle;
	}
	
	//Modificadores
	
	//getters
	public String getName()
	{
		return this.name;
	}
	public String getType()
	{
		return this.type;
	}
	public String getImage()
	{
		return this.image;
	}
	public String getPrayer()
	{
		return this.Prayer;
	}
	public Date getCelebrationDate()
	{
		return celebrationDate;
	}
	public String getPower()
	{
		return this.power;
	}
	public Candle getAngelCandle()
	{
		return this.angelCandle;
	}
	
	//setters
	public void setName(String name)
	{
		this.name = name;
	}
	public void setType(int type)
	{
		switch (type)
		{
			case 1:
			this.type = ARCANGEL;
			case 2:
			this.type = QUERUBIN;
			case 3:
			this.type = SERAFIN;
		}
	}
	public void setImage(String image)
	{
		this.image = image;
	}
	public void setPrayer(String prayer)
	{
		this.prayer = prayer;
	}
	public void setCelebrationDate(Date celebrationDate)
	{
		this.celebrationDate = celebrationDate;
	}
	public void setPower(int power)
	{
		switch (power)
		{
			case 1:
			this.power = PROTECTION;
			case 2:
			this.power = HEALTH;
			case 3:
			this.power = JUSTICE;
			case 4:
			this.power = LOYALTY;
			case 5:
			System.out.print("Type the power of this angel: ");
			this.power = reader.nextLine();
		}
	}
	public void setAngelCandle(Candle angelCandle)
	{
		this.angelCandle = angelCandle;
	}
	
	//Analizadores
	
	/**
	*<b>DES: </b> Este método concatena atributos de la clase Angel en una cadena junto con los atributos de el atributo Candle de la misma clase.<br>
	*<b>PRE: </b> Todos los atributos requeridos son cadenas de texto y están inicializados. (name, image, prayer, celebrationDate, power, )<br>
	*@return  angelInformation Es una cadena de texto que contiene información de los atributos de la clase angel. angelInformation !=null, angelInformation!="".
	*/
	public String ShowAngelInformation()
	{
		String angelInformation;
		
		angelInformation = ("Name: " + getName() + "\nPhoto: " + 
		getImage() + "\nPrayer: " + getPrayer() + "\nCelebration Date: " + getCelebrationDate +
		"\nPower: " + getPower + "\n\nCandle Information: " + angelCandle.ShowCandleInformation());s
		
		return angelInformation;
	}
}