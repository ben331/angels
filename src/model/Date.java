public class Date
{
	//Constantes
	//Constatnes de dominio del atributo month (mes)
	private final int JANUARY = 1;
	private final int FEBRUARY = 2;
	private final int MARCH = 3;
	private final int APRIL = 4;
	private final int MAY = 5;
	private final int JUNE = 6;
	private final int JULY = 7;
	private final int AUGUST = 8;
	private final int SEPTEMBER = 9;
	private final int OCTOBER = 10;
	private final int NOVEMBER = 11;
	private final int DECEMBER = 12;
	
	//Atributos
	private String month;
	private String day;
	
	//Métodos
	//Constructor
	public Date(int month, int day)
	{
		switch month
		{
			case JANUARY:
			this.month = "January";
			case FEBRUARY:
			this.month = "February";
			case MARCH:
			this.month = "March";
			case APRIL:
			this.month = "April";
			case JUNE:
			this.month = "June";
			case JULY:
			this.month = "July";
			case AUGUST:
			this.month = "August";
			case SEPTEMBER:
			this.month = "September";
			case OCTOBER:
			this.month = "October";
			case NOVEMBER:
			this.month = "November";
			case DECEMBER:
			this.month = "December";	
		}
		this.month = month;
		this.day = day;
	}
	
	//Modificadores
	//Getters
	public String GetMonth()
	{
		return this.month;
	}
	public String GetDay()
	{
		return this.day;
	}
	public void SetMonth(int month)
	{
		switch month
		{
			case JANUARY:
			this.month = "January";
			case FEBRUARY:
			this.month = "February";
			case MARCH:
			this.month = "March";
			case APRIL:
			this.month = "April";
			case JUNE:
			this.month = "June";
			case JULY:
			this.month = "July";
			case AUGUST:
			this.month = "August";
			case SEPTEMBER:
			this.month = "September";
			case OCTOBER:
			this.month = "October";
			case NOVEMBER:
			this.month = "November";
			case DECEMBER:
			this.month = "December";	
		}
	}
	public void SetDay(int day)
	{
		this.day = day;
	}
}