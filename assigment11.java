import java.util.*;
public class BST {
class Node{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data=data;
		left=right=null;
	}
}
	Node root;
	BST()
	{
		root=null;
	}
	void insert(int data)
	{
		root=insert(root,data);
	}
	Node insert(Node root,int data)
	{
		if(root==null)
		{
			root= new Node(data); 
			return root;
		}
		 
		 if (data < root.data) 
		 {
	            root.right = insert(root.right, data); 
		 }
	        else if (data > root.data) 
	        {
	            root.left = insert(root.left, data); 
	        }
			
			return root;
		
	}
	public void inorder()  { 
	       inorderRec(root); 
	    } 
	public void inorderRec(Node root)
	{
		if(root != null)
		{
		inorderRec(root.left);
		System.out.println(root.data);
		inorderRec(root.right);
		}
		
	}  
	void postord()
	{
		post(root);
	}
	public void post(Node root)
	{
		if(root != null)
		{
			post(root.left);
			post(root.right);
		System.out.println(root.data);
		
		}
	}
	public void preord()
	{
		pre(root);
	}
	public void pre(Node root)
	{
		if(root != null)
		{
			
			System.out.println(root.data);
			pre(root.left);
			pre(root.right);
		}
	}
	public static void main(String args[])
	{
		BST b= new BT();
		b.insert(2);
		b.insert(3);
		b.insert(1);
		b.insert(5);
		b.inorder();
		b.postord();
	    b.preord();
	}
}