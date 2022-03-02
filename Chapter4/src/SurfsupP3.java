/**
 * SurfsUpP3
 * @author Ali Al-sebbah
 *CompSci 20
 *Feb 22 2022
 */
import java.util.Scanner;
public class SurfsupP3
						{

	public static void main(String[] args)
											{
		
		Scanner Scan = new Scanner (System.in); //Ready for input
		
		int Wave; //declaration
		System.out.print("Please enter the height of the wave!: "); //Ask for first part
		Wave = Scan.nextInt ();// Record first part
			
		if (Wave>6){
			
			System.out.println("What a great day for surfing!!!"); //Higher than 6
			
		}
		else if (Wave>=3 && 5>=Wave) {
			
			System.out.println("Go body boarding instead!"); //Between 5 and 3
			
			Scan.close();
		}
		
		else {
			System.out.println("Whoa! What kind of surf is that?!"); //Anything 2 or lower
			
		}
		Scan.close(); //End input
	}
}//End of class

/*
Please enter the height of the wave!: 
20
What a great day for surfing!!!

Please enter the height of the wave!: 
5
Go body boarding instead!

Please enter the height of the wave!: 2
Whoa! What kind of surf is that?!

*/

