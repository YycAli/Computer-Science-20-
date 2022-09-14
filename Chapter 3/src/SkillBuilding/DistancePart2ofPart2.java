package SkillBuilding;
import java.util.Scanner;

	

	
	      
public class DistancePart2ofPart2 {
	public static void main(String[] args) {
		double First;//First segment 
		double second;//second segment
		double third;//third segment
	      Scanner myObj = new Scanner(System.in);
	      System.out.println("Please eneter the distance in the first segment");
	      First=myObj.nextDouble();
	      System.out.println("Please eneter the distance in the second segment");
	      second=myObj.nextDouble();
	      System.out.println("Please eneter the distance in the third segment");
	      third=myObj.nextDouble();
	      System.out.println(First+second+third);
	}       
}