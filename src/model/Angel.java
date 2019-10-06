package model;
/**
*Esta clase representa una Angel de atributos nombre, tipo, imagen, oracion, poder, vela y fecha de celebración.
*/
public class Angel
{	
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
	private String power;
	
	//Relaciones
	private Date date;
	private Candle candle;
	
	//Métodos
	//Constructor
	public Angel(String name, int type, String image, String prayer, Date date, String power, Candle candle)
	{	
		this.name = name;
		
		switch (type)
		{
			case 1:
			this.type = ARCANGEL;
			break;
			case 2:
			this.type = QUERUBIN;
			break;
			case 3:
			this.type = SERAFIN;
			break;
		}
		
		this.image = image;
		
		this.prayer = prayer;
		
		this.date =  date;
		
		this.power = power;
		
		this.candle =  candle;
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
		return this.prayer;
	}
	public Date getDate()
	{
		return date;
	}
	public String getPower()
	{
		return this.power;
	}
	public Candle getCandle()
	{
		return this.candle;
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
			break;
			case 2:
			this.type = QUERUBIN;
			break;
			case 3:
			this.type = SERAFIN;
			break;
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
	public void setDate(Date date)
	{
		this.date = date;
	}
	public void setPower(String power)
	{
		this.power = power;
	}
	public void setCandle(Candle candle)
	{
		this.candle = candle;
	}
	
	//Analizadores
	
	/**
	*<b>DES: </b> Este método concatena atributos de la clase Angel en una cadena junto con los atributos de el atributo Candle de la misma clase.<br>
	*<b>PRE: </b> Todos los atributos requeridos son cadenas de texto y están inicializados. (name, image, prayer, date, power, )<br>
	*@return  angelInformation Es una cadena de texto que contiene información de los atributos de la clase angel. angelInformation !=null, angelInformation!="".
	*/
	public String showAngelInformation()
	{
		String angelInformation;
		
		angelInformation = ("Name: " + name + "\nType: " + type +"\nPhoto: " + image +"\nPrayer: " + prayer + "\nCelebration Date: " + "\nMonth: " + date.getMonth() + "\nDay: " + date.getDay() +
		"\nPower: " + power + "\n\nCandle Information: " + candle.showCandleInformation());
		
		return angelInformation;
	}
}