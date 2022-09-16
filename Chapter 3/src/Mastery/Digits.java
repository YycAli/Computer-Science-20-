package Mastery;
import java.util.Scanner;
public class Digits {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
    
        System.out.println("Please eneter a 3 digit number");
        int Number = myObj.nextInt();
        int hundreds=Number/100;
        System.out.println("The hundereds digit number is:"+Number/100);
        System.out.println("The tens digit number is:"+ (Number/10)%10);
        System.out.println("The ones digit number is:"+Number%10);
        
	}

}
