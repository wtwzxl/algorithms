package wtw.hust.cn;

import java.util.Stack;

import edu.princeton.cs.algs4.StdOut;

public class LRU<T>
{
	
	private static int Max =5;
	
	private Stack<T>  mstack;
	
	public LRU()
	{
		mstack = new Stack<T>();
	}
	
	public void enStack(T a)
	{
		if(mstack.size() <Max)
		{
			if(isUsed(a)!= -1)
				mstack.remove(isUsed(a));
				mstack.push(a);
		}
		else if(mstack .size() == Max)
		{
			mstack.remove(0);
			mstack.push(a);
		}
		/**
		 * 用于测试
		 */
		for(int i = 0; i < mstack.size();i++)
		{
			StdOut.print(mstack.get(i)+ " ");
		}
		StdOut.println();

	}
	
	/**
	 * 
	 * @param a
	 * @return -1 表示stack没有该对象，有则返回在stack中的index
	 */
	public int isUsed(T a)
	{
		int index = -1;
		if(mstack.contains(a))
		{
			index = mstack.indexOf(a);
		}
		return index;
	}
	
	public static void main(String[] args) 
	{
		LRU<Integer> mlru = new LRU<Integer>();
		int[] a = {2,4,3,5,2,1,7,0,3,2};
		
		for(int i = 0; i < a.length;i++)
		{
			mlru.enStack(a[i]);
		}
	}
	
	

}
