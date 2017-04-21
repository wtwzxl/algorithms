package wtw.hust.cn;

public class SelectionSort 
{
  public static int[] sort(int[] data)
  {
	  if(data == null) 
	  {
		  throw new IllegalArgumentException("");
	  }
	  int[] result = new int[data.length];
	  System.arraycopy(data, 0, result, 0, data.length);
	  for(int i = 0; i< data.length;i++)
	  {
		  for(int j= i+1; j<data.length; j++ )
		  {
			  if(result[i]> result[j])
			  {
				  int temp = result[i];
				  result[i] = result[j];
				  result[j] = temp;
			  }
		  }
	  }
	  return result;
  }
}
