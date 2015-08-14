/**
 * 
 */
package petcalc;

import java.util.Random;


/**
 * @author inetmiguel
 *
 */
public class petcalc {

	int x;
	int y;
	int z;
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
	
	private void gen_x (int bound) {
		this.x=rndgen.nextInt(bound);
	}
	
	private void gen_y (int bound) {
		this.y=rndgen.nextInt(bound);
	}

}
