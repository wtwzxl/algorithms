package wtw.hust.cn;

import edu.princeton.cs.algs4.StdOut;

public class Main 
{
	  public static void main(String[] args)
	  {
		int[] data ={2,5,4,3,6,8,9,12};
		int[] dataSorted =SelectionSort.sort(data);
		for(int i = 0; i <data.length;i++)
	    {
			StdOut.print(data[i]+ " ");
	       
	    }
		StdOut.println("\n");
		for(int i = 0; i <dataSorted.length;i++)
	    {
			 StdOut.print(dataSorted[i]+ " ");
	       
	    }

	   //StdOut.println( gcd(105,24));
	  }
}
