package model;
import java.util.Scanner;
public class Legion
{
	//Constantes
	
	//Atributos
	private Angel[] maximaSuperior;
	private name;
	
	
	//Métodos
	//Constructor
	public Legion(Angel archangel1, Angel archangel2, Angel archangel3, Angel archangel4, Angel archangel5, Angel archangel6, Angel archangel7)
	{
		name = "Máxima Superior";
		maximaSuperior = {archangel1, archangel2, archangel3, archangel4, archangel5, archangel6, archangel7}
	}
	
	//Modificadores
	//Getters
	
	public String getName()
	{
		return name;
	}
	
	public Angel getArchangel(int index)
	{
		return maximaSuperior[index];
	}
	
	//setters
	public void setArchangel(int index, Angel newArchangel)
	{
		maximaSuperior[index] = newArchangel;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	//Analizadores (Requerimientos Funcionales)
	
	/**
	*<b>DES: </b> Este método cuenta cuantos arcangeles se han "ingresado" (modificado), basandose si el nombre de el ángel está vacío.<br>
	*<b>PRE: </b> La clase tiene inicializado el arreglo de angel(maximaSuperior)<br>
	*@return enteredAngel Es la cantidad de ángeles ingresados por el usuario. enteredAngel!=null, enteredAngel mayor o igual a 0
	*/
	public int countAngels()
	{
		int enteredAngel=0;
		for(int i=0;  (i <= maximaSuperior.length - 1); i++)
		{
			if( maximaSuperior[index].getName().equals("")==false)
			{
				++enteredAngel;
			}
		}
		
		return enteredAngel;
	}
	
	/**
	*<b>DES: </b> Este método busca un objeto angel del arreglo maximaSuperior con base en el nombre de un angel y extrae su informacion en una cadena<br>
	*<b>PRE: </b> El arreglo maximaSuperior debe estar inicializado.<br>
	*@param _name Es el nombre de un angel que se va a buscar. _name!=null _name!=""
	*@return angelInformation Es una cadena de texto que contiene la informacion del angel ingresado, si el angel no se encuentra no habrá informacion. angelInformation!=null, angelInformation!=""
	*/
	public String getAngelInformationFromName(String _name)
	{
		String angelInformation="Angel not found";
		for(int i=0; i<=maximaSuperior.length-1;i++)
		{
			if(maximaSuperior[i].getName().equals(_name))
			{
				angelInformation = maximaSuperior[i].ShowAngelInformation();
			}
		}
		return angelInformation;
	}
	
	

	/**
	*<b>DES: </b> Este método busca un objeto angel del arreglo maximaSuperior con base en el poder de un angel y extrae su informacion en una cadena<br>
	*<b>PRE: </b> El arreglo maximaSuperior debe estar inicializado.<br>
	*@param power Es un entero que representa el poder de un angel que se va a buscar. _name!=null power==1,2,3,4,5 o 6.
	*@return angelInformation Es una cadena de texto que contiene la informacion del angel ingresado, si el angel no se encuentra no habrá informacion. angelInformation!=null, angelInformation!=""
	*/
	public String getAngelInformationFromPower(int power)
	{
		String angelInformation="Angel not found";
		
		String _power;
		Scanner reader = new Scanner(System.in);
		switch (power)
		{
			case 1:
			_power = PROTECTION;
			case 2:
			_power = HEALTH;
			case 3:
			_power = JUSTICE;
			case 4:
			_power = LOYALTY;
			case 5:
			System.out.print("Type the power of this angel: ");
			_power = reader.nextLine();
		}
		for(int i=0; i<=maximaSuperior.length-1;i++)
		{
			if(maximaSuperior[i].getPower().equals(_power))
			{
				angelInformation = maximaSuperior[i].ShowAngelInformation();
			}
		}
		return angelInformation;
	}
	
	/**
	*<b>DES: </b> Este método concatena las fechas de celebracion que hay en un mes determinado con su respectivo angel en una sola cadena de texto.<br>
	*<b>PRE: </b> Todos los angeles deben tener inicializado su nomnre y su fecha de celebración (name, celebrationDate)<br>
	*@param month Es un número que representa un mes del año. month mayor o igual a 1 y menor o igual a 12. month !=null.
	*@return  celebrations Es una cadena de texto que contiene el nombre, la fecha de celebracion el color y esencia de su vela, de los angeles que hay en un més específico. celebrations!=null
	*/
	public String ShowCelebrations(int month)
	{
		String celebrations="";
		String _month;
		switch month
		{
			case 1:
			_month = "JANUARY";
			case 2:
			_month = "FEBRUARY";
			case 3:
			_month = "MARCH";
			case 4:
			_month = "APRIL";
			case 5:
			_month = "MAY";
			case 6:
			_month = "JUNE";
			case 7:
			_month = "JULY";
			case 8:
			_month = "AUGUST";
			case 9:
			_month = "SEPTEMBER";
			case 10:
			_month = "OCTOBER";
			case 11:
			_month = "NOVEMBER";
			case 12:
			_month = "DECEMBER";		
		}
		
		for(int i =0; i<=maximaSuperior.length-1;i++)
		{
			if(maximaSuperior[i].getCelebrationDate().getMonth().equals(_month))
			{
				celebrations = (celebrations + "\n\n\n Angel " + maximaSuperior[i].getName + 
				": \nCelebration Date: " + 
				maximaSuperior[i].getCelebrationDate().getMonth + " " + maximaSuperior[i].getCelebrationDate().getDay() +
				"\n Candle Color: " + maximaSuperior[i].getAngelCandle().getColor() + 
				"\n Candle Essence: " + maximaSuperior[i].getAngelCandle().getEssence());
			}
		}
		
		return celebrations;
	}
	
	/**
	*<b>DES: </b> Este método concatena las fechas de celebracion que hay en un mes determinado con su respectivo angel en una sola cadena de texto.<br>
	*<b>PRE: </b> Todos los angeles deben tener inicializado su nomnre y su fecha de celebración (name, celebrationDate)<br>
	*@param month Es un número que representa un mes del año. month mayor o igual a 1 y menor o igual a 12. month !=null.
	*@return  celebrations Es una cadena de texto que contiene el nombre, la fecha de celebracion el color y esencia de su vela, de los angeles que hay en un més específico. celebrations!=null
	*/
	public String ShowAllCelebrations()
	{
		String celebrations="";	
		for(int i =0; i<=maximaSuperior.length-1;i++)
		{
			celebrations = (celebrations + "\n\n\n Angel " + maximaSuperior[i].getName + 
			": \nCelebration Date: " + 
			maximaSuperior[i].getCelebrationDate().getMonth + " " + maximaSuperior[i].getCelebrationDate().getDay());
		}
		
		return celebrations;
	}
	//Validaciones (Requerimientos no funcionales)
	
	/**
	*<b>DES: </b> Este método determina si un entero es o no un día del més.<br>
	*<b>PRE: </b> El dato ingresado es un número entero<br>
	*<b>POST: </b> La validación es un dato de valor falso o verdadero.<br>
	*@param day Es un número entero. day!=null
	*@return  validation Es un valor lógico que expresa false cuando el entero no es un día del més, y verdadero cuando sí lo es. validation !=null.
	*/
	public boolean validateDateDay(int day)
	{
		boolean validation = false;
		
		if (day<=31 || day>=1)
		{
			validation = true
		}
	}
	
	
	/**
	*<b>DES: </b> Este método determina si un nombre termina o no en la silaba "el" además de no estar asignado en el nombre de otro angel.<br>
	*<b>PRE: </b> El dato ingresado es una cadena de texto<br>
	*<b>POST: </b> La validación es un dato de valor falso o verdadero.<br>
	*@param name es el nombre de un ángel. name!=null name!=""
	*@return  validation Es un valor lógico que expresa verdadero cuando el nombre termina en "el" y el nombre no esta repetido, y falso cuando no termina en el o cuando esta repetido. validation !=null.
	*/
	public boolean validateAngelName(String name)
	{
		boolean validation = false;
		boolean validation1 = false;
		boolean validation2 = true;
		
		String twoLastChar = "";
		
		twoLastChar = "" + name.charAt(name.length()-2) + name.charAt(name.length()-1);
		if (twoLastChar.equals("el"))
		{
			validation1 = true;
		}
		
		for(int i=1; i<= maximaSuperior.length-1;i++)
		{
			if(maximaSuperior[1].getName().equals(name))
			{
				validation2 = false;
			}
		}
		
		validation = validation1 && validation2;
		
		return validation;
	}
	
	
	/**
	*<b>DES: </b> Este método determina si un poder está asignado en el poder de otro angel.<br>
	*<b>PRE: </b> El dato ingresado es un entero que representa el poder de un angel<br>
	*<b>POST: </b> La validación es un dato lógico de valor falso o verdadero.<br>
	*@param name es el nombre de un ángel. name!=null name!=""
	*@return  validation Es un valor lógico que expresa verdadero cuando el poder no esta repetido, y falso si lo esta. validation !=null.
	*/
	public boolean validateAngelPower(int power)
	{
		boolean validation = true;
		
		String _power;
		Scanner reader = new Scanner(System.in);
		switch (power)
		{
			case 1:
			_power = PROTECTION;
			case 2:
			_power = HEALTH;
			case 3:
			_power = JUSTICE;
			case 4:
			_power = LOYALTY;
			case 5:
			System.out.print("Type the power of this angel: ");
			_power = reader.nextLine();
		}
		for(int i=1; i<= maximaSuperior.length-1;i++)
		{
			if(maximaSuperior[1].getPower().equals(_power))
			{
				validation2 = false;
			}
		}
		
		return validation;
	}
	
}