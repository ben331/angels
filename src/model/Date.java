package model;
/**
*Esta clase representa una fecha con més y día.
*/
public class Date
{
	//Constantes
	//Constatnes de dominio del atributo month (mes)
	private final String JANUARY = "JANUARY";
	private final String FEBRUARY = "FEBRUARY";
	private final String MARCH = "MARCH";
	private final String APRIL = "APRIL";
	private final String MAY = "MAY";
	private final String JUNE = "JUNE";
	private final String JULY = "JULY";
	private final String AUGUST = "AUGUST";
	private final String SEPTEMBER = "SEPTEMBER";
	private final String OCTOBER = "OCTOBER";
	private final String NOVEMBER = "NOVEMBER";
	private final String DECEMBER = "DECEMBER";
	
	//Atributos
	private String month;
	private int day;
	
	//Métodos
	//Constructor
	public Date(String month, int day)
	{
		this.month = month;
		this.day = day;
	}
	
	//Modificadores
	//Getters
	public String getMonth()
	{
		return this.month;
	}
	public int getDay()
	{
		return this.day;
	}
	//Setters
	public void setMonth(String month)
	{
		this.month=month;
	}
	public void setDay(int day)
	{
		this.day = day;
	}
}