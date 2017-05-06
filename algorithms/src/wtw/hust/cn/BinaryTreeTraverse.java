package wtw.hust.cn;

import java.util.Stack;
import edu.princeton.cs.algs4.StdOut;

/**
 * 
 * @author wangtw
 *                                    A
 *                                   /  \
 *                                  /	 \
 *       						   B      C
 *                               /  	 /	\
 *                              /       /    F
 *       					   D        E    /\
 *       								\   H  I
 *                                       G
 *       
 * @param <T>
 */
public class BinaryTreeTraverse<T>
{
	private Node root;
	private Stack<Node> mstack;
	
	public  Node  getRoot()
	{
		return root;
	}
	
	/**
	 *   二叉树  非递归先序遍历 （通过栈来实现的）
	 * @param root
	 */
	public void preTraverseWithoutRecusive(Node root)
	{
		if(root == null)
		{
			StdOut.println("root is null");
		}
		else
		{
			Node temp = root;
			while(temp !=null || !mstack.empty())
			{
				while(temp!= null)
				{	StdOut.println(temp.getData());
					mstack.push(temp);
					temp = temp.getLeft();
				}
				if(!mstack.empty())
				{
					temp = mstack.pop();
					temp = temp.getRight();
				}
			}
			
		}
	}
	
	class Node
	{
		
		private T data;
		private Node left;
		private Node right;
		
		public Node getLeft()
		{
			return left;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}
		
	}

}
