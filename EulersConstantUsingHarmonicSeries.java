 /**
 * CS 301: Numerical Methods
 * Professor: A. Khakpour
 *
 * Computer Exercise: 1.3 #7
 *
 * @author - Eric Schenck
 * last modified: September 30, 2017
 *   
 */

public class EulersConstantUsingHarmonicSeries {
	public static void main(String[] args){
		
		float x = (float)1.0;
		float s = (float)1.0;
		float ans; 		// using to store s - log(n) 
								
		for(int i = 1; i<=5000 ; ++i){
			
			x += 1.0;			// operations		
			s += (1.0/x);
			
			if(i%100 == 0){		// used to print values every 100 iterations
				
				ans = (float) (s - Math.log(i));	// final calculations
						
				System.out.println("n = " + i);		// formatted printing
				System.out.printf("s-logn = %.12f \n", ans);
				
			}
		}
	}
}
