import java.util.Random;
import java.util.Scanner;
public class RandomNum {

	public static void main(String[] args) 
											{
		
		Scanner Scan = new Scanner (System.in); //Ready for Input
		
		int Numb, Max, Min; //declaration 
		System.out.print("Please enter a two digit number!: "); //Ask for first part
		Numb= Scan.nextInt (); //Record first part
		
		Min = Numb/10;
		Max = (Numb%10);
		
		Random rn = new Random();
		int range = Max - Min + 1;
		int randomNum =  rn.nextInt(range) + Min;
	
		System.out.println("A random number between the integers you entered is:" + randomNum);
		
	
		Scan.close();
		
		
		

	}

}
