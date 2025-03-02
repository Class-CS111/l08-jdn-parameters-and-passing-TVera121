// PARTNER NAME: Tony vera
// PARTNER NAME: N/A
// CS111 SECTION #: 3033 Spring 2025
// DATE:
import org.checkerframework.checker.units.qual.A;

public class Main 
{
    public static void main(String[] args) 
	{

	    /*Start of Lab 03 Code used to validate results calling getJulianDate methods
		// DECLARATION SECTION 
		// int day, month, year; 
		//This Variables no longer neeed to be declared in main, as they are declared in the getJulianDate method

		// INITIALIZATION SECTION
		//int todayDay =2, todayMonth = 2, todayYear =2020; //Kathrine Johnson uses 2/2/202 for Today's Date
		//int birthdayDay = 26, birthdayMonth = 8, birthdayYear = 1918 ; //Kathrine Johnson's Birthday is 2/26/1918
		//int daysAlive, approximateAge;
		
		// INPUT SECTION
		//N/A

		//int todayJDN = Main.getJulianDate(todayDay, todayMonth, todayYear); 
		//int birthdayJDN = Main.getJulianDate(birthdayDay, birthdayMonth, birthdayYear); 

		//daysAlive = todayJDN - birthdayJDN;
		//approximateAge = daysAlive/365;
		
		// OUTPUT SECTION 

		// Lab 03 Expected Console Results 
		//Julian Day Number for today's date, 2/2/2020, is 2458882
		//Julian Day Number for birthday, 8/26/1918, is 2421832
		//The difference in days is 37050, which makes you approximately 101 years old!

		// Display Results of Using method getJulianDate 
		System.out.println("\n" + "Julian Day Number for today's date, " + todayMonth + "/" + todayDay + "/" + todayYear + ", is " + todayJDN);
		System.out.println("Expected Given Result 2458882"); // Display given result to console
		System.out.println("\n" + "Julian Day Number for birhtday, " + birthdayMonth + "/" + birthdayDay + "/" + birthdayYear + ", is " + birthdayJDN);
		System.out.println("Expected Given Result 2421832"); //Display given result to console
		System.out.println("\n" + "The difference in days is " + daysAlive + " which makes you approximately " + approximateAge +" years old!");
		System.out.println("Expected Given Results 37050 and 101");
		end of validation code from Lab 03*/
		


		/***** INITIALIZATION SECTION *****/
		int birthdayDay = 26, birthdayMonth = 8, birthdayYear = 1918 ; //Kathrine Johnson's Birthday is 2/26/1918

		/***** CONSOLE DISPLAY OUTPUT SECTION *****/
		//No need to initialize Julian Date variable for each case since method can be invoked directly in printf statement
		System.out.printf("Kathrine's Julian Day Number is: %d!%n",Main.getJulianDate(birthdayDay, birthdayMonth, birthdayYear));

		/***** INPUT SECTION *****/
		//Prompt user enter Birthday Day/Month/Year
		int yourBDay = UtilityBelt.readInt("Enter your day of birth: ", 1, 31);
        int yourBMonth = UtilityBelt.readInt("Enter your month of birth: ", 1, 12);
        int yourBYear = UtilityBelt.readInt("Enter your year of birth: ", 1905, 2025);


		/***** CONSOLE DISPLAY OUTPUT SECTION *****/
		//No need to initialize Julian Date variable for each case since method can be invoked directly in printf statement
		System.out.printf("Your Birthday Julian Day Number is: %d!%n",Main.getJulianDate(yourBDay, yourBMonth, yourBYear));
    }

    public static int getJulianDate(int day, int month, int year) 
	//Method that returns Interger Julian Date Number given the DD/MM/YYYY integer parameters
    {
		/***** DECLARATION SECTION *****/
        int y, m, a; //Variables used to calculate the Julian Date Number
		int JDN; //Variable Julian Date Number to be returned

		/***** CALCULATION & PROCESSING SECTION *****/
		a = (14 - month) / 12; //Formula to calculate 'a';
		//for the months of January and February 'a' will be 1 and 0 for the months of March through December
		m = month + 12*a -3; //Formula to calculate 'm'
		y = year + 4800 -a; //Formula to calculate 'y'
		JDN = (day + (153*m + 2)/5 + 365*y + y/4 - y/100 + y/400 -32045); //Formula to calculate Julian Date Number 
        return JDN;
    }

}