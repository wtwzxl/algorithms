package wtw.hust.com;

import edu.princeton.cs.algs4.StdOut;

/** 
 *  this¡¡class implements Euclid  gcd(a,b) = gcd(b, a%b)
 * @author wangtw
 *
 */

public class Euclid 
{
	/**describe :calculate two integer numbers the greatest common divisor
	 *   
	 * @param a
	 * @param b
	 * @return
	 */
	
  public static int gcd(int a, int b)
  {
	  if(b == 0)
	  { 
		  return a;
	  }
	  else
	  {
		  return gcd(b,a%b);
	  }
  }
  
  public static int ex_gcd(int a,int b)
  {
	  int result = 0;
	  
	  return result;
	  
  }
  
  
  public static void main(String[] args) 
  {
	 StdOut.print(gcd(12,17));
  }
}
