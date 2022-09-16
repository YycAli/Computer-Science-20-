package Mastery;
import java.util.Scanner;
public class Change {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);	
		double quarters=.25;
		double dimes;
		double Nickels;
		double pennies;
		System.out.println("Please eneter any number thats less then a dollar");
		double Change1 = myObj.nextDouble();
	    double quarters1=Change1/quarters;
	    System.out.println("Quarters="+(Math.floor(quarters1/100)));
	}

}
