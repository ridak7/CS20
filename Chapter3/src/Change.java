/**
 * Change Calc
 * @author Ali Al-sebbah
 *CompSci 20
 *Feb 16 2022
 */
/*

Program: ????.java          Last Date of this Revision: September 30, 2019

Purpose: An application that uses nested for loops to output a table that diplays number in 
 multiples of ten.

Author: Your Name, 
School: CHHS
Course: Computer Programming ??
 

*/
import java.util.Scanner;
public class Change {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner (System.in);
		
	
		int amount,quarters,dimes,nickels,pennies;
		System.out.print("Please enter a value equal or lower than 1.00 in cents: ");
		amount = Scan.nextInt ();
		

		
		 quarters = amount / 25;
		 amount = amount % 25;
		 dimes = amount / 10;
		 amount = amount % 10;
	     nickels = amount / 5;
		 amount = amount % 5;
		 pennies = amount;
		 
		    System.out.println("The number of quarters is: "+ quarters);
		    System.out.println("The number of Dimes is: "+ dimes);
		    System.out.println("The number of Nickels is: "+ nickels);
		    System.out.println("The number of Pennies is: "+ pennies);
		    
		    Scan.close();

	}

}


/* ScreenDump
Please enter a value equal or lower than 1.00 in cents: 90
The number of quarters is: 3
The number of Dimes is: 1
The number of Nickels is: 1
The number of Pennies is: 0
*/
