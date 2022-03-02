/**
 * SurfsUpP2
 * @author Ali Al-sebbah
 *CompSci 20
 *Feb 22 2022
 */


import java.util.Scanner;
public class SurfsupP2
						{
	
  public static void main(String[] args)	
  
  										{
		
		Scanner Scan = new Scanner (System.in); //Ready for input
		
		int Wave; //declaration
		System.out.println("Please enter the height of the wave!: "); //Ask for first part
		Wave = Scan.nextInt (); //Record first part
		
		if (Wave>6)
		{
			
			System.out.println("What a great day for surfing!!!"); //Higher than 6
			
		}
		
		else 
		{
			System.out.println("Go body boarding instead!"); //Lower than 6
			
			Scan.close(); //End input 
		}
	
	
}
}// End class

/*
Please enter the height of the wave!: 
20
What a great day for surfing!!!

Please enter the height of the wave!: 
5
Go body boarding instead!
*/

