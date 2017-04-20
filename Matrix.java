package wtw.hust.com;

import edu.princeton.cs.algs4.StdOut;

public class Matrix
{
	
	public static void main(String[] arg)
	{
		double[][] a = {{1,2,3},{4,5,6}};
		double[][] b ={{1,4},{2,5},{3,6}};
		double[] vector ={1,2,3};
		double[] result ={};
		//result =mult(a,b);
		result = mult(a,vector);
		
		for(int i= 0; i < result.length; i++)
		{
			
				StdOut.print(result[i]+ "  ") ;
		
			StdOut.println(" ");
		}
	}
	
	/**describe:vector_x * vector_y
	 *  
	 * @param x
	 * @param y
	 * @return
	 */
 public  static double dot(double[] x,double[] y)
 {
	 if(x.length != y.length)
	 {
		 throw new IllegalArgumentException(" x.length should equal y.length");
	 }
	 double result = 0;
	 for(int i=0; i < x.length; i++)
	 {	 
		 result += x[i]* y[i];
	 }
	 return result;
 }
 
 /**
  *  describe: matrix_a * matrix_b  
  * @param a
  * @param b 
  * @return
  *     mcolumns_a should equal mrow_b
  * 
  */
 public static double[][] mult(double[][] matrix_a, double[][] matrix_b)
 {
	if(matrix_a[0].length != matrix_b.length)
	{
		throw  new IllegalArgumentException("a.columm doesn't equal b.row");
	}
	// result[m][n] = A[m][p] * B[p][n]
	 double[][] result = new double[matrix_a.length][matrix_b[0].length];
	for(int i= 0; i < matrix_a.length; i++) //a.length =  row 
	{
		
		for(int j =0; j <matrix_b[0].length; j++)
		{
			result[i][j] = calculateSingleResult(matrix_a,matrix_b,i,j);
		}
	}
	 return result;
 }
 
 /** describe: calculate a single matrix_a row * matrix_b column
  * 
  * @param matrix_a
  * @param matrix_b
  * @param matrix_a's row 
  * @param matrix_b's column
  * @return
  */
 private static double calculateSingleResult(double[][] matrix_a,double[][] matrix_b,int row,int column) 
 {
	 double result = 0;
	  for(int k = 0; k < matrix_a[0].length;k++)
	  {
		  result += matrix_a[row][k]*matrix_b[k][column];
	  }
	  return result;
 }
 
 /** describe: implement matrix_a transpose 
  * 
  * @param matrix_a
  * @return
  */
 public static double[][] transpose(double[][] matrix_a)
 {
	 
	 double[][] result = new double[matrix_a[0].length][matrix_a.length] ;
	 
	 for(int i =0 ; i < matrix_a.length;i++)
	 {
		 for(int j=0; j < matrix_a[0].length ;j++ )
		 {
			 result[j][i] = matrix_a[i][j];
		 }
	 }
	 return result;
 }
 
 /**  describe : matrix_a * vector b,prerequisite matrix_a[0].length should equal vector's column
  * 
  * @param a
  * @param x
  * @return
  */
 public static double[] mult(double[][] matrix_a, double[] x)
 {
	 double[] result = new double[matrix_a.length] ;
	 for(int i = 0 ; i< matrix_a.length; i++ )
	 {
		 for(int j = 0; j < matrix_a.length; j++)
		 {
			 result[i] += matrix_a[i][j]*x[j];
		 } 
	 }
		 
		return result;
 }
 
 public static double[] mult(double[]y, double[][] a)
 {
	 double[] result = {};
	  return result;
 }
 
}
