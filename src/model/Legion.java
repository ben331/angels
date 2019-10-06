/**
*Este paquete contiene el modelo de una legion de arcacangeles.
*@author Benjamin Silva Salgado
*@version 1.0
*/
package model;
/**
*Esta clase controladora modela una legion arcangeles.
*La clase necesita de la clase Angel Candle y Date para funcionar correctamente.
*/
public class Legion
{	
	//Atributos
	private Angel[] angels = new Angel[7];
	private String name;
	
	
	//Métodos
	//Constructor
	public Legion(String name)
	{
		this.name = name;
	}
	
	//Modificadores
	//Getters
	
	public String getName()
	{
		return name;
	}
	
	//setters
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	
	//Métodos
	//Analizadores (Requerimientos Funcionales)
	
	/**
	*<b>DES: </b> Este método asigna un ángel en una posición del arreglo angels<br>
	*<b>PRE: </b> El arreglo angels debe estar declarado. El angel ingresado debe estar inicializado<br>
	*<b>POST: </b> El angel ingresado estará asignado en la posición ingresada en el arreglo angels.<br>
	*@param angel Es un objeto angel. angel!=null
	*@param position Es un entero que representa la posición donde se agregará el angel en el arreglo angels. positionmayor o igual a y menor o igual a 6
	*/
	public void addAngel(Angel angel, int position)
	{
		this.angels[position] = angel;
	}
	
	/**
	*<b>DES: </b> Este método asigna la referencia null en una posición del arreglo angels que corresponde al nombre ingresado<br>
	*<b>PRE: </b> El arreglo angels debe estar declarado. El angel debe estar en el arreglo(Se puede verificar con el método existAngel())<br>
	*<b>POST: </b> El angel del arreglo angels con el nombre ingresado tomará el valor null.<br>
	*@param name Es una cadena de texto que representa el nombre de un angel que ya está en el arreglo angels. name!=null, name termina en "el"
	*/
	public void deleteAngel(String name)
	{
		for(int i=0; i<=angels.length-1;i++)
		{
			if(angels[i]!=null)
			{
				if(angels[i].getName().equals(name))
				{
					angels[i]=null;
				}
			}
		}
	}
	/**
	*<b>DES: </b> Este método cuenta cuantos arcangeles se han "ingresado" (modificado), basandose si son o no nulos.<br>
	*<b>PRE: </b> La clase tiene declarado el arreglo de angel(angels)<br>
	*@return enteredAngel Es un número entero que representa el número de ángeles ingresados por el usuario. enteredAngel!=null, enteredAngel mayor o igual a 0
	*/
	public int countAngels()
	{
		int enteredAngel=0;
		for(int i=0;  (i <= angels.length - 1); i++)
		{
			if(angels[i]!=null)
			{
				++enteredAngel;
			}
		}
		
		return enteredAngel;
	}
	
	/**
	*<b>DES: </b> Este método busca un objeto angel del arreglo angels con base en el nombre ingresado y extrae su informacion en una cadena<br>
	*<b>PRE: </b> El arreglo angels debe estar declarado.<br>
	*@param _name Es el nombre de un angel que se va a buscar. _name!=null _name!=""
	*@return angelInformation Es una cadena de texto que contiene la informacion del angel ingresado, si el angel no se encuentra se retorna "Angel no encontrado". angelInformation!=null, angelInformation!=""
	*/
	public String getAngelInformationFromName(String _name)
	{
		String angelInformation="Angel not found";
		for(int i=0; i<=angels.length-1;i++)
		{
			if(angels[i]!=null)
			{
				if(angels[i].getName().equals(_name))
				{
					angelInformation = angels[i].showAngelInformation();
				}
			}
		}
		return angelInformation;
	}
	
	

	/**
	*<b>DES: </b> Este método busca un objeto angel del arreglo angels con base en el poder ingresado y extrae su informacion en una cadena<br>
	*<b>PRE: </b> El arreglo angels debe estar declarado.<br>
	*@param power Es una cadena que representa el poder de un angel que se va a buscar. _name!=null
	*@return angelInformation Es una cadena de texto que contiene la informacion del angel ingresado, si el angel no se encuentra se retorna "Angel no encontrado". angelInformation!=null, angelInformation!=""
	*/
	public String getAngelInformationFromPower(String power)
	{
		String angelInformation="Angel not found";
		
		for(int i=0; i<=angels.length-1;i++)
		{
			if(angels[i]!=null)
			{
				if(angels[i].getPower().equals(power))
				{
					angelInformation = angels[i].showAngelInformation();
				}
			}
		}
		return angelInformation;
	}
	
	/**
	*<b>DES: </b> Este método concatena las fechas de celebracion que hay en un mes determinado con su respectivo angel en una sola cadena de texto.<br>
	*<b>PRE: </b> El arreglo angels como atributo de la clase debe estar declarado. El dato ingresado debe ser una cadena de texto<br>
	*@param month Es una cadena que representa un mes del año. month!=null
	*@return  celebrations Es una cadena de texto que contiene el nombre, la fecha de celebracion el color y esencia de su vela, de los angeles que hay en un més específico. Si no hay celebraciones en ese mes se retorna un vacio. celebrations!=null
	*/
	public String showCelebrations(String month)
	{
		String celebrations="";		
		for(int i =0; i<=angels.length-1;i++)
		{
			if(angels[i]!=null)
			{
				if(angels[i].getDate().getMonth().equals(month))
				{
					celebrations = (celebrations + "\n\n\n Angel " + angels[i].getName() + 
					": \nCelebration Date: " + 
					angels[i].getDate().getMonth() + " " + angels[i].getDate().getDay() +
					"\n Candle Color: " + angels[i].getCandle().getColor() + 
					"\n Candle Essence: " + angels[i].getCandle().getEssence()); 
				}
			}
		}
		return celebrations;
	}
	
	/**
	*<b>DES: </b> Este método concatena las fechas de celebracion que hay en un mes determinado con su respectivo angel en una sola cadena de texto.<br>
	*<b>PRE: </b> El arreglo angels como atributo de la clase debe estar declarado<br>
	*<b>POST: </b> El valor retornado es una cadena de texto.<br>
	*@return  celebrations Es una cadena de texto que contiene el nombre, la fecha de celebracion el color y esencia de su vela, de los angeles que hay en un més específico. celebrations!=null
	*/
	public String showAllCelebrations()
	{
		String celebrations="";	
		for(int i =0; i<=angels.length-1;i++)
		{
			if(angels[i]!=null)
			{
				celebrations = (celebrations + "\n\n\n Angel " + angels[i].getName() + 
				":\nCelebration Date: " + 
				angels[i].getDate().getMonth() + " " + angels[i].getDate().getDay());
			}
		}
		
		return celebrations;
	}
	
	/**
	*<b>DES: </b> Este método concatena los nombres de los angeles que esten en el arreglo en ese momento. y los enumera en una cadena de texto<br>
	*<b>PRE: </b> El arreglo angels como atributo de la clase debe estar declarado<br>
	*@return  names Es una cadena de texto que contiene los nombres de los ángeles no nulos del arreglo angels. names!=null
	*/
	public String showAngelsNamesEntered()
	{
		String names="";
		int j=1;
		for(int i=0;  (i <= angels.length - 1); i++)
		{
			if( angels[i]!=null)
			{
				names =names+"\n"+(j)+"."+angels[i].getName()+"   ("+i+")";
				j++;
			}
		}
		return names;
	}
	
	
	//Validaciones (Requerimientos no funcionales)
	/**
	*<b>DES: </b> Este método determina si un nombre termina o no en la silaba "el" y no está asignado en el nombre de otro angel.<br>
	*<b>PRE: </b> El dato ingresado es una cadena de texto<br>
	*<b>POST: </b> La validación es un dato de valor lógico.<br>
	*@param name es el nombre de un ángel. name!=null
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
		
		validation2 = !(existAngel(name));
		
		validation = validation1 && validation2;
		
		return validation;
	}
	
	/**
	*<b>DES: </b> Este método determina si un poder está asignado en el poder de otro angel.<br>
	*<b>PRE: </b> El dato ingresado es un entero que representa el poder de un angel<br>
	*<b>POST: </b> La validación es un dato lógico de valor falso o verdadero.<br>
	*@param power Es el poder de un ángel. name!=null name!=""
	*@return  validation Es un valor lógico que expresa verdadero cuando el poder no esta repetido, y falso si lo esta. validation !=null.
	*/
	public boolean validateAngelPower(String power)
	{
		boolean validation = true;
		for(int i=1; i<= angels.length-1;i++)
		{
			if(angels[i]!=null)
			{
				if(angels[i].getPower().equals(power))
				{
					validation = false;
				}
			}
		}
	
		return validation;
	}
	
	
	/**
	*<b>DES: </b> Este método determina si un entero es o no un día del més.<br>
	*<b>PRE: </b> El dato ingresado es un número entero<br>
	*<b>POST: </b> La validación es un dato de valor falso o verdadero.<br>
	*@param day Es un número entero. day!=null
	*@return  validation Es un valor lógico que expresa false cuando el entero no es un día del més, y verdadero cuando sí lo es. validation !=null.
	*/
	public boolean validateDay(int day)
	{
		boolean validation=false;
		if(day>=1 && day<=31)
		{
			validation=true;
		}
		return validation;
	}
	
	/**
	*<b>DES: </b> Este método determina si un entero representa o no un més del año.<br>
	*<b>PRE: </b> El dato ingresado es un número entero<br>
	*<b>POST: </b> La validación es un dato de valor lógico.<br>
	*@param month Es un número entero. day!=null
	*@return  validation Es un valor lógico que expresa false cuando el entero no es un més del año, y verdadero cuando sí lo representa. validation !=null.
	*/
	public boolean validateMonth(int month)
	{
		boolean validation=false;
		{
			if(month>=1 && month<=12)
			{
				validation = true;
			}
		}
		return validation;
	}
	
	//Métodos Facilitadores
	
	/**
	*<b>DES: </b> Este método determina si hay alguna posición nula en el atributo angels.<br>
	*<b>PRE: </b> El atributo angels está declarado<br>
	*<b>POST: </b> La validación es un dato de valor falso o verdadero.<br>
	*@return  validation Es un valor lógico que expresa true cuando hay al menos una posición nula en el arreglo y false cuando todas las posiciones está inicializadas. validation !=null.
	*/
	public boolean hasSpace()
	{
		boolean validation=true;
		if (7==countAngels())
		{
			validation = false;
		}
		return validation;
	}
	
	/**
	*<b>DES: </b> Este método determina la posición que referencia null en el arreglo angels.<br>
	*<b>PRE: </b> El atributo angels debe estar declarado<br>
	*<b>POST: </b> se entrega un número entero.<br>
	*@return indexSpace Es el indice de una posición nula del arreglo angels. indexSpace!=null.
	*/
	public int findIndexNull()
	{
		int indexSpace=-1;
		for(int i=0; i<=angels.length-1 && indexSpace==-1;i++)
		{
			if(angels[i]==null)
			{
				indexSpace=i;
			}
		}
		return indexSpace;
	}
	
	/**
	*<b>DES: </b> Este método determina si hay una angel en el arreglo angels con el nombre ingresado.<br>
	*<b>PRE: </b> El arreglo angels debe estar declarado<br>
	*<b>POST: </b> La validacion es un dato de valor lógico.<br>
	*@param name Es un nombre de un angel. name!=null
	*@return validation Es un dato lógico que tomara el valor falso cuando no exista un angel con el nombre ingresado en angels, y true cuando si exista. validation!=null
	*/
	public boolean existAngel(String name)
	{
		boolean validation=false;
		for(int i=0; i<=angels.length-1;i++)
		{
			if(angels[i]!=null)
			{
				if(angels[i].getName().equals(name))
				{
					validation=true;
				}
			}
		}
		return validation;
	}
}