package ui;
import java.util.Scanner;
import model.Legion;
import model.Date;
import model.Angel;
import model.Candle;
public class Main
{
	//Número de angeles
	public static final int ANGLES_LENGTH=7;
	public static void main(String[]args)
	{
		//Variables
		int option;
		boolean validation;
		String text="";
		int index;
		int integer;
		double realNumber;
		Scanner reader = new Scanner(System.in);
		
		Angel[] arcangels = new Angel[ANGLES_LENGTH];
		Legion maximaSuperior = new Legion(arcangels, "Maxima Superior");
		
		inIt();
		
		System.out.println("Welcome to the Legion Maxima Suoperior");
		do
		{
			System.out.println("\n\n1.Add an archangel. \n2.Remove an archangel. \n3.Show and Count angels entered. \n4.Search archangel by his name." +
			"\n5.Search archangel by his power. \n6.Show celebrations in the month. \n7.Show all celebrations \n8.Exit");
			System.out.print("Select a funtion:  ");
			option = reader.nextInt();
			switch (option)
			{
				case 1:
				if(maximaSuperior.hasSpace()==true)
				{
					index=maximaSuperior.findIndexNull();
					do
					{
						System.out.print("\nRemember: the name of every angel has to be different and it has to end with the syllable 'el' .\nType the name of the angel: ");
						text=reader.next();
					}while(maximaSuperior.validateAngelName(text)==false);
					
					do
					{
						System.out.print("\nRemember: the power of every angel has to be different.\n\n 1.Protection.\n2.Health.\n3.Justice.\n4.Loyalty.\n5.Other. \n\nType the power of the angel: ");
						option = reader.nextInt();
					}while(maximaSuperior.validateAngelPower(option)==false);
					
					maximaSuperior.getAngel(index).setName(text);
					
					maximaSuperior.getAngel(index).setType(1);
					
					System.out.print("\nEnter the image of the angle: ");
					text = reader.next();
					maximaSuperior.getAngel(index).setImage(text);
					
					System.out.print("\nType the prayer of the angle: ");
					text = reader.next();
					maximaSuperior.getAngel(index).setPrayer(text);
					
					System.out.print("\nInformation about his candle.");
					System.out.print("\nType the angel's candle color: ");
					text = reader.next();
					maximaSuperior.getAngel(index).getCandle().setColor(text);
					
					System.out.print("\nType the angel's candle size (cm): ");
					realNumber = reader.nextDouble();
					maximaSuperior.getAngel(index).getCandle().setSize(realNumber);
					
					System.out.print("\nType the angel's candle essence: ");
					text = reader.next();
					maximaSuperior.getAngel(index).getCandle().setEssence(text);
					
					System.out.print("\nType the angel's candle iluminance (cd): ");
					realNumber = reader.nextDouble();
					maximaSuperior.getAngel(index).getCandle().setIluminance(realNumber);
					
					System.out.print("\nCelebration date of the angel");
					do
					{
						System.out.print("\nDay: ");
						integer = reader.nextInt();
					}while(maximaSuperior.validateDay(integer)==false);
					maximaSuperior.getAngel(index).getDate().setDay(integer);
					
					do
					{
						System.out.print("\n\n1.Jaunary.\n2.February.\n3.March.\n4.April.\n5.May.\n6.June.\n7.July.\n8.August.\n9.September.\n10.October.\n.11November.\n12.December.\nMonth: ");
						integer = reader.nextInt();
					}while(maximaSuperior.validateMonth(integer)==false);
					maximaSuperior.getAngel(index).getDate().setDay(integer);
				}
				else
				{
					System.out.println("The legion is full. Remember that you only can add 7 angels. If you want add another, you can remove some angel.");
				}
				break;
				
				case 2:
				System.out.println("Remove an Angel.");
				System.out.print("\nType the name of the angel to remove: ");
				text = reader.next();
				maximaSuperior.getAngel(maximaSuperior.getIndexAngelFromName(text)).reestoreAngel();
				break;
				
				case 3:
				System.out.println("Angels entered: " + maximaSuperior.countAngels()+ "\n"+maximaSuperior.showAngelsNamesEntered());
				break;
				
				case 4:
				System.out.print("\nType the name of the angel: ");
				text=reader.next();
				System.out.println("Information of angel: \n"+maximaSuperior.getAngelInformationFromName(text));
				break;
				
				case 5:
				System.out.print("\nType the power of the angel: ");
				integer=reader.nextInt();
				System.out.println("Information of angel: \n"+maximaSuperior.getAngelInformationFromPower(integer));
				break;
				
				case 6:
				System.out.print("\nType a month to see celebrations: ");
				System.out.print("\n\n1.Jaunary.\n2.February.\n3.March.\n4.April.\n5.May.\n6.June.\n7.July.\n8.August.\n9.September.\n10.October.\n.11November.\n12.December.\nMonth: ");
				System.out.println("month number: ");
				integer=reader.nextInt();
				System.out.println("Celebrations of month "+text+":\n"+maximaSuperior.showCelebrations(integer));
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
	}
}