package SkillBuilding;
import java.util.Scanner;
public class Digits {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int onesplace=0;
		int tensplace=0;
		// TODO Auto-generated method stub
		
		System.out.println("Please eneter a two digit number "); 
		 int Number = myObj.nextInt();
		 
		 tensplace = Number / 10;
		 System.out.println("tens place is" +tensplace );
		 
		 
		 onesplace= Number%10        ;
		 System.out.println("ones place is" +onesplace );
	}

}
