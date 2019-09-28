public class Date
{
	//Constantes
	//Constatnes de dominio del atributo month (mes)
	private final int JANUARY = "JANUARY";
	private final int FEBRUARY = "FEBRUARY";
	private final int MARCH = "MARCH";
	private final int APRIL = "APRIL";
	private final int MAY = "MAY";
	private final int JUNE = "JUNE";
	private final int JULY = "JULY";
	private final int AUGUST = "AUGUST";
	private final int SEPTEMBER = "SEPTEMBER";
	private final int OCTOBER = "OCTOBER";
	private final int NOVEMBER = "NOVEMBER";
	private final int DECEMBER = "DECEMBER";
	
	//Atributos
	private String month;
	private int day;
	
	//Métodos
	//Constructor
	public Date(int month, int day)
	{
		switch month
		{
			case 1:
			this.month = JANUARY;
			case 2:
			this.month = FEBRUARY;
			case 3:
			this.month = MARCH;
			case 4:
			this.month = APRIL;
			case 5:
			this.month = MAY;
			case 6:
			this.month = JUNE;
			case 7:
			this.month = JULY;
			case 8:
			this.month = AUGUST;
			case 9:
			this.month = SEPTEMBER;
			case 10:
			this.month = OCTOBER;
			case 11:
			this.month = NOVEMBER;
			case 12:
			this.month = DECEMBER;	
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
	public void setMonth(int month)
	{
		switch month
		{
			case 1:
			this.month = JANUARY;
			case 2:
			this.month = FEBRUARY;
			case 3:
			this.month = MARCH;
			case 4:
			this.month = APRIL;
			case 5:
			this.month = MAY;
			case 6:
			this.month = JUNE;
			case 7:
			this.month = JULY;
			case 8:
			this.month = AUGUST;
			case 9:
			this.month = SEPTEMBER;
			case 10:
			this.month = OCTOBER;
			case 11:
			this.month = NOVEMBER;
			case 12:
			this.month = DECEMBER;
		}
	}
	public void setDay(int day)
	{
		this.day = day;
	}
}