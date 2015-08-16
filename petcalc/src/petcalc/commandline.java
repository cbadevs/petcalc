package petcalc;

import java.util.Scanner;

public class commandline {

	
	public static void main (String args[])	{
		petcalc calc;
		calc = new petcalc();
		int operator=4;
		Scanner reader = new Scanner(System.in);
		while (( operator > 0) && (operator > 3)) 
		{
			System.out.println("Please select the operation, press...");
			System.out.println("0 \t Addition");
			System.out.println("1 \t Substraction");
			System.out.println("2 \t Mutliplication");
			System.out.println("3 \t Division");
			operator=reader.nextInt();
			System.out.println("..");
			System.out.println(operator);
			System.out.println("..");
			switch (operator)	{
				case	0:	System.out.println("Addition selected");
							break;
				case	1:	System.out.println("Substraction selected");
							break;
				case	2:	System.out.println("Multiplication selected");
							break;
				case	3:	System.out.println("Division selected");
							break;
			
			}
		}
		
		calc.setOperation(operator);
		
		reader.close();
	
	} 
	
}

