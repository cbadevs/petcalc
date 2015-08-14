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

	private int x;
	private int y;
	private int z;
	private int shadow;
	
	private static final int SUMA = 0;
	private static final int RESTA = 1;
	private static final int MULTI = 2;
	private static final int DIVI = 3;
	
	Random rndgen = new Random();
	
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
	
	private void genxy (int bound) {
		this.x=rndgen.nextInt(bound);
		this.y=rndgen.nextInt(bound);
	}
	
	private void genshadow(){
		this.shadow=rndgen.nextInt(3);
		
	}

	/**
	 * 
	*/
	public int[] game (int level, int operador){
	
		//add operator control, bust be 0-3
		//add level control, for now must be 1 or 2
		genshadow();
		switch (level) {
			case 1:	genxy(10);
					break;
			case 2:	genxy(100);
					break;
		}
		
		switch (operador)	{
			case SUMA:	z=x+y;
						break;
			case RESTA:	z=x-y;
						break;
			case MULTI:	z=x*y;
						break;
			case DIVI:	z=x%y;
						break;
		}
		
		int[] data;
		data = new int[4];
		
		data[0]=this.x;
		data[1]=this.y;
		data[2]=this.z;
		data[3]=this.shadow;
		return data;
		}

	public static void main (String args[])
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
	
}

