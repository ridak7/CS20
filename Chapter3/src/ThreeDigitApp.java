/**
 * Three Didgit App,  
 * @author Ali Al-sebbah
 *CompSci 20
 *Feb 16 2022
 */
import java.util.Scanner;

public class ThreeDigitApp {

	public static void main(String[] args) {
		
Scanner Scan = new Scanner (System.in);
		
		int Numb, Ten, One,Hund;
		System.out.print("Please enter your three digit number: ");
		Numb = Scan.nextInt ();
		
		Hund = Numb/100;
		System.out.println("Your hundreds place digit is: "+ Hund);
				
		
		Ten = (Numb/10)%10;
		System.out.println("Your tens place digit is: "+ Ten);
		
		One = (Numb%10);
		System.out.println("Your ones place digit is: "+ One);
		
		
		
		Scan.close();  You don't need this statement for new versions of Java

	}

}

/* ScreenDump
Please enter your three digit number: 861
Your hundreds place digit is: 8
Your tens place digit is: 6
Your ones place digit is: 1
*/
