/**
*Este paquete contiene la interfaz de usuario del programa legion de arcacangeles.
*@author Benjamin Silva Salgado
*@version 1.0
*/
package ui;
import java.util.Scanner;
import model.Legion;
import model.Date;
import model.Angel;
import model.Candle;
/**
*Esta clase Main contiene la interfaz de un programa que modela una legion de arcangeles.
*@author Benjamin Silva Salgado
*@version 1.0
*/
public class Main
{
	//Constantes de dominio del atributo power (poder)
	public static final String PROTECTION = "PROTECTION";
	public static final String HEALTH = "HEALTH";
	public static final String ABUNDANCE = "ABUNDANCE";
	public static final String JUSTICE = "JUSTICE";
	public static final String LOYALTY = "LOYALTY";
	
	//Constatnes de dominio del atributo month (mes)
	private static final String JANUARY = "JANUARY";
	private static final String FEBRUARY = "FEBRUARY";
	private static final String MARCH = "MARCH";
	private static final String APRIL = "APRIL";
	private static final String MAY = "MAY";
	private static final String JUNE = "JUNE";
	private static final String JULY = "JULY";
	private static final String AUGUST = "AUGUST";
	private static final String SEPTEMBER = "SEPTEMBER";
	private static final String OCTOBER = "OCTOBER";
	private static final String NOVEMBER = "NOVEMBER";
	private static final String DECEMBER = "DECEMBER";

	private static Scanner reader = new Scanner(System.in);
	
	private static Legion maximaSuperior = new Legion("Maxima Superior");
	
	
	public static void main(String[]args)
	{
		//Variables
		int option;
		boolean validation;
		int index;
		
		String varName="";
		String varType="";
		String varImage="";
		String varPrayer="";
		String varPower="";
		
		String varColor="";
		String varEssence="";
		double varSize;
		double varIluminance;
		
		int varDay=0;
		String varMonth="";
		
		Candle varCandle;
		Date varDate;
		Angel varAngel;
		
		
		
		inIt();
		
		System.out.println("Welcome to the Legion Maxima Superior");
		do
		{
			System.out.println("\n\n1.Add an archangel. \n2.Remove an archangel. \n3.Show and Count angels entered. \n4.Search archangel by his name." +
			"\n5.Search archangel by his power. \n6.Show celebrations in the month. \n7.Show all celebrations \n8.Exit");
			System.out.print("Select a funtion:  ");
			option = reader.nextInt();
			reader.nextLine();
			switch (option)
			{
				case 1:
				if(maximaSuperior.hasSpace()==true)
				{
					index=maximaSuperior.findIndexNull();
					do
					{
						System.out.print("\nRemember: the name of every angel has to be different and it has to end with the syllable 'el' .\nType the name of the angel: ");
						varName=reader.nextLine();
					}while(maximaSuperior.validateAngelName(varName)==false);
					
					do
					{
						System.out.print("\nRemember: the power of every angel has to be different.\n\n1.Protection.\n2.Health.\n3.Abundance\n4.Justice.\n5.Loyalty.\n6.Other. \nSelect an option: ");
						option= reader.nextInt();
						reader.nextLine();
						switch (option)
						{
							case 1:
							varPower = PROTECTION;
							break;
							case 2:
							varPower = HEALTH;
							break;
							case 3:
							varPower = ABUNDANCE;
							break;
							case 4:
							varPower = JUSTICE;
							break;
							case 5:
							varPower = LOYALTY;
							break;
							case 6:
							System.out.print("Type the power of this angel: ");
							varPower = reader.nextLine();
							break;
						}
					}while(maximaSuperior.validateAngelPower(varPower)==false);
					
					System.out.print("\nEnter the image of the angel: ");
					varImage = reader.next();
					reader.nextLine();
					
					System.out.print("\nType the prayer of the angel: ");
					varPrayer = reader.nextLine();
					
					System.out.print("\nInformation about his candle.");
					System.out.print("\nType the angel's candle color: ");
					varColor = reader.nextLine();
					
					System.out.print("\nType the angel's candle size (cm): ");
					varSize = reader.nextDouble();
					reader.nextLine();
					
					System.out.print("\nType the angel's candle essence: ");
					varEssence = reader.nextLine();
					
					System.out.print("\nType the angel's candle iluminance (cd): ");
					varIluminance = reader.nextDouble();
					reader.nextLine();
					
					System.out.print("\nCelebration date of the angel");
					do
					{
						System.out.print("\nDay: ");
						varDay = reader.nextInt();
						reader.nextLine();
					}while(maximaSuperior.validateDay(varDay)==false);
					
					do
					{
						System.out.print("\n\n1.Jaunary.\n2.February.\n3.March.\n4.April.\n5.May.\n6.June.\n7.July.\n8.August.\n9.September.\n10.October.\n11.November.\n12.December.\nMonth: ");
						option = reader.nextInt();
						reader.nextLine();
					}while(maximaSuperior.validateMonth(option)==false);
					switch (option)
					{
						case 1:
						varMonth = JANUARY;
						break;
						case 2:
						varMonth = FEBRUARY;
						break;
						case 3:
						varMonth = MARCH;
						break;
						case 4:
						varMonth = APRIL;
						break;
						case 5:
						varMonth = MAY;
						break;
						case 6:
						varMonth = JUNE;
						break;
						case 7:
						varMonth = JULY;
						break;
						case 8:
						varMonth = AUGUST;
						break;
						case 9:
						varMonth = SEPTEMBER;
						break;
						case 10:
						varMonth = OCTOBER;
						break;
						case 11:
						varMonth = NOVEMBER;
						break;
						case 12:
						varMonth = DECEMBER;
						break;
					}
					option=0;
					
					varDate = new Date(varMonth, varDay);
					varCandle = new Candle(varColor, varSize, varEssence, varIluminance);
					varAngel = new Angel(varName, 1, varImage, varPrayer, varDate, varPower, varCandle);
					
					maximaSuperior.addAngel(varAngel, index);
				}
				else
				{
					System.out.println("The legion is full. Remember that you only can add 7 angels. If you want add another, you can remove some angel.");
				}
				break;
				
				
				
				
				
				
				
				case 2:
				System.out.println("Remove an Angel.");
				
				System.out.print("\nType the name of the angel to remove: ");
				varName = reader.nextLine();
				if(maximaSuperior.existAngel(varName)==true)
				{
					maximaSuperior.deleteAngel(varName);
					System.out.println("The angel "+varName+ " has been deleted");
				}
				else
				{
					System.out.println("This angels doesn't exist");
				}
				break;
				
				
				
				
				
				
				
				case 3:
				System.out.println("\n\nAngels entered: " + maximaSuperior.countAngels()+ "\n"+maximaSuperior.showAngelsNamesEntered());
				break;
				
				
				
				
				
				
				
				case 4:
				System.out.print("\nType the name of the angel: ");
				varName=reader.nextLine();
				System.out.println("\n\nInformation of angel "+varName+ ":\n"+maximaSuperior.getAngelInformationFromName(varName));
				break;
				
				
				
				
				
				
				
				case 5:
				System.out.print("\n\n1.Protection.\n2.Health.\n3.Abundance\n4.Justice.\n5.Loyalty.\n6.Other. \npower: ");
				option=reader.nextInt();
				reader.nextLine();
				switch (option)
				{
					case 1:
					varPower = PROTECTION;
					break;
					case 2:
					varPower = HEALTH;
					break;
					case 3:
					varPower = ABUNDANCE;
					break;
					case 4:
					varPower = JUSTICE;
					break;
					case 5:
					varPower = LOYALTY;
					break;
					case 6:
					System.out.print("Type the power of this angel: ");
					varPower = reader.nextLine();
					break;
				}
				System.out.println("\n\nInformation of angel: \n"+maximaSuperior.getAngelInformationFromPower(varPower));
				break;
				
				
				
				
				
				
				
				case 6:
				System.out.print("\nType a month to see celebrations: ");
				System.out.print("\n\n1.Jaunary.\n2.February.\n3.March.\n4.April.\n5.May.\n6.June.\n7.July.\n8.August.\n9.September.\n10.October.\n11.November.\n12.December.\nMonth: ");
				System.out.println("month number: ");
				option=reader.nextInt();
				reader.nextLine();
				switch (option)
				{
					case 1:
					varMonth = JANUARY;
					break;
					case 2:
					varMonth = FEBRUARY;
					break;
					case 3:
					varMonth = MARCH;
					break;
					case 4:
					varMonth = APRIL;
					break;
					case 5:
					varMonth = MAY;
					break;
					case 6:
					varMonth = JUNE;
					break;
					case 7:
					varMonth = JULY;
					break;
					case 8:
					varMonth = AUGUST;
					break;
					case 9:
					varMonth = SEPTEMBER;
					break;
					case 10:
					varMonth = OCTOBER;
					break;
					case 11:
					varMonth = NOVEMBER;
					break;
					case 12:
					varMonth = DECEMBER;
					break;
				}
				option=0;
				System.out.println("Celebrations of month "+varMonth+":\n"+maximaSuperior.showCelebrations(varMonth));
				break;
				
				
				
				
				
				
				case 7:
				System.out.println("All celebrations"+ maximaSuperior.showAllCelebrations());
				break;
				
				case 8:
				break;

				default:
				System.out.println("Invalided Option");
				break;
			}
		}while(option!=8);
	}
	
	
	public static void inIt()
	{
		Date varDate;
		Candle varCandle;
		Angel varAngel;
		
		varDate = new Date(SEPTEMBER, 29);
		varCandle = new Candle("Azul",30,"Incienso de Vainilla",325);
		varAngel = new Angel("Miguel", 1,"C:/Users/desktop/miguel.png", "San Miguel Arcángel, defiéndenos en la batalla. Sé nuestro amparo contra la perversidad y las acechanzas del demonio. Que Dios le reprima, es nuestra humilde súplica; y tú, Príncipe de la Milicia Celestial, con la fuerza que Dios te ha dado, arroja al infierno a Satanás y a los demás espíritus malignos que vagan por el mundo para la perdición de las almas. Amén.",
								varDate, JUSTICE, varCandle);
		maximaSuperior.addAngel(varAngel,0);
		
		varDate = new Date(MARCH, 18);
		varCandle = new Candle("Blanco",28,"Incienso de Vainilla",350);
		varAngel = new Angel("Gabriel", 1,"C:/Users/desktop/gabriel.png", "Oh glorioso Arcángel San Gabriel, llamado fortaleza de Dios, príncipe excelentísimo entre los espíritus angélicos, embajador del Altísimo, que mereciste ser escogido para anunciar a la Santísima Virgen la Encarnación de divino Verbo en sus purísimas entrañas: yo te suplico tengas a bien rogar a Dios por mí, miserable pecador, para que conociendo y adorando este inefable misterio, logre gozar el fruto de la divina redención en la gloria celestial. Amén.",
								varDate, PROTECTION, varCandle);
		maximaSuperior.addAngel(varAngel,1);
	}
}