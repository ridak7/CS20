/**
 * Digit
 * @author Ali Al-sebbah
 *CompSci 20
 *Feb 16 2022
 */
import java.util.Scanner;
public class ReviewDidgits {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner (System.in);
		
		int Numb, Ten, One;
		System.out.print("Please enter your two digit number: ");
		Numb = Scan.nextInt ();
		
		Ten = Numb/10;
		System.out.println("Your tens place digit is: "+ Ten);
		
		One = (Numb%10);
		System.out.println("Your ones place digit is: "+ One);
		
		
		
		Scan.close();
		
		

	}

}

/*
ScreenDump
Please enter your two digit number: 95
Your tens place digit is: 9
Your ones place digit is: 5
*/