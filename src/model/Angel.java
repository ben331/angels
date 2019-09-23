import java.util.Scanner;
public class Angel
{
	Scanner reader = new Scanner(System.in);
	
	//Constantes
	//Constantes de dominio del atributo type (tipo)
	private final String ARCÁNGEL = "Arcángel";
	private final String QUERUBÍN = "Querubín";
	private final String SERAFÍN = "Serafín";
	
	//Constantes de dominio del atributo power (poder)
	public final String PROTECTION = "Protection";
	public final String HEALTH = "Health";
	public final String ABUNDANCE = "Abundance";
	public final String JUSTICE = "Justice";
	public final String LOYALTY = "Loyalty";
	
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
	public Angel(String name, int type, String image, String prayer, 
	String month, String day, int power, String color, String size, 
	String, String essence, String iluminance)
	{	
		this.name = name;
		switch type
		{
			case 1:
			this.type = arcángel;
			case 2:
			this.type = querubín;
			case 3;
			this.type = serafín;
		}
		this.image = image;
		this.prayer = prayer;
		this.celebrationDate =  new Date(month, day);
		switch power
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
		this.angelCandle =  new Candle(color, size, essence, iluminance);
	}
	
	//Modificadores
	
	//Getters
	public String GetName()
	{
		return this.name;
	}
	public String GetType()
	{
		return this.type;
	}
	public String GetImage()
	{
		return this.image;
	}
	public String GetPrayer()
	{
		return this.Prayer;
	}
	public String GetCelebrationDate()
	{
		String date;
		date = this.celebrationDate.GetMonth() + " " + this.celebrationDate.GetDay()
		return date;
	}
	public String GetPower()
	{
		return this.power;
	}
	
	//Setters
	public void SetName(String name)
	{
		this.name = name;
	}
	public void SetType(int type)
	{
		switch type
		{
			case 1:
			this.type = arcángel;
			case 2:
			this.type = querubín;
			case 3;
			this.type = serafín;
		}
	}
	public void SetImage(String image)
	{
		this.image = image;
	}
	public void SetPrayer(String prayer)
	{
		this.prayer = prayer;
	}
	public void SetCelebrationDate(String month, int day)
	{
		this.celebrationDate.SetMonth(month);
		this.celebrationDate.SetDay(day);
	}
	public void SetPower(int power)
	{
		switch power
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
	
	
	//Analizadores
	
	public String ShowAngelInformation()
	{
		String angelInformation;
		
		angelInformation = ("Name: " + GetName() + "\nPhoto: " + 
		GetImage() + "\nPrayer: " + GetPrayer() + "\nCelebration Date: " + GetCelebrationDate +
		"\nPower: " + GetPower);
		
		return angelInformation;
	}
}