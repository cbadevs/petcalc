/**
 * 
 */
package petcalc;

import java.util.Random;


/**
 * @author inetmiguel
 *
 * first working class
 */
public class petcalc {
	
	private static final int ADD = 0;
	private static final int SUB = 1;
	private static final int MUL = 2;
	private static final int DIV = 3;
	
	private static final int EASY = 0;
	private static final int NORMAL = 1;
	private static final int HARD = 2;
	
	Random rndgen = new Random();

	private int x;
	private int y;
	private int z;
	private int shadow;
	private int level;
	private int operation;
	private int timer; //will use this one to count total challenge time
	
	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getOperation() {
		return operation;
	}


	public void setOperation(int operation) {
		this.operation = operation;
	}
	
	petcalc(){
		setLevel(0);
		setOperation(0);
	}
	
	petcalc(int level, int operation){
		setLevel(level);
		setOperation(operation);
	}
	
	/**
	 * For now all numbers generated are only positive, need to fix that!!
	 */
	private void genxy()	{
		switch(level)	{
		case EASY: 		x=rndgen.nextInt(10);
						y=rndgen.nextInt(10);
						break;
				
		case NORMAL:	x=rndgen.nextInt(100);
						y=rndgen.nextInt(10);
						break;
				
		case HARD:		x=rndgen.nextInt(100);
						y=rndgen.nextInt(100);
						break;
		}
	}
	
	private void genz()	{
		switch (operation)	{
			case ADD:	z=x+y;
						break;
						
			case SUB:	if (y>x) {
							int helper;
							helper=x;
							x=y;
							y=helper;
							}
						z=x-y;
						break;
						
			case MUL:	z=x*y;
						break;
						
			case DIV:	while (y==0) {
							genxy();
						}
						z=x/y;
						break;
		}
	}
		
	
		
		//** provide shadow and wait for answer? not an option, client will neeed challenge first
		
		//como hago para limitar los challenges a 10, le incumbe a esta clase o al cliente?
		// si le incumbe al cliente entonces el cliente no es una pantalla gui, sino un objeto intermedio
		
		//or first of all get answer, shadow was already provided when started, (constructed)

	
//	private int randInt(int min, int max) {
//
	    // NOTE: Usually this should be a field rather than a method
	    // variable so that it is not re-seeded every call.
//	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
//	    int randomNum = rand.nextInt((max - min) + 1) + min;

//	    return randomNum;
//	}
	
	
	private void genshadow(){
		this.shadow=rndgen.nextInt(3);
		
	}

	
	
	/**public static void main (String args[])
	{
		petcalc object;
		object = new petcalc();
		int array[];
		array= new int[4];
		array=object.game(1,1);
		System.out.print("**");
		System.out.print(array[0]);
		System.out.print("**");
		System.out.print(array[1]);
		System.out.print("**");
		System.out.print(array[2]);
		System.out.print("**");
		System.out.print(array[3]);
		System.out.print("**");
	}
	*/
}

