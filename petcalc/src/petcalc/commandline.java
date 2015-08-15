package petcalc;

import java.util.Scanner;

public class commandline {

	private String input;
	
	
	
	public static void main (String args[])	{
		char operator=0;
		Scanner reader = new Scanner(System.in);
		while ((operator !='+') && (operator != '-' ) && (operator != '*' ) && (operator != '-')) 
		{
			System.out.println("Please select the operation");
			operator=reader.next().charAt(0);
			System.out.println(operator);
			
		}
		
		
	
	} 
	
}
