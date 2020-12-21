import java.util.Random;
import java.util.*;

public class HIorLow {
	public static  void main(String args[]) {
		Random rand = new Random(); //Generates a random number.
		int upperbound = 21; //Sets an upperbound so the random numbers are generated from 0-20. i.e upperbound -1.
		
		//Setting the number to less than upperbound.
		
		int int_random = rand.nextInt(upperbound);
		Scanner myObj = new Scanner(System.in); //input command
		System.out.println("Enter a number in between 1 to 20");
		//Loop executed till the requirements are met. So user input will be required on each iteration.
		while(true) {
		int userin = myObj.nextInt();
		//The statements for the output and conditions.
		if(int_random == userin) {
			System.out.println("You are too good at this game!!");
			return;
			
		}
		else if (int_random > userin){
			System.out.println("Try a higher number");
			
			
		}
		else if (int_random < userin){
			System.out.println("Try a smaller number");
			
		
		}
	}
	}
}
