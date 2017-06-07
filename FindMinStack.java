import java.util.*;


class StackMin extends Stack1
{
	public class StackMin1
	{
		int min;
		StackMin1 next;
	}
	StackMin1 top;
	
	void push(int data)
	{
		if(data<=min())
		{
		 StackMin1 node= new  StackMin1();
		 node.next=top;
		 top=node; 
		}
		 
		
		super.push(new StackNode (), data);
	}
	
	
	int min()
	{
		return peek();
	}
	
	int peek()
	{
		return top.min;
	}
	int pop()
	{
		int p=super.pop();
		if(p==top.min)
			top=top.next;
		return p;
	}
}
 class Stack1
{
	
	StackNode top;
	public class StackNode
{
	int data;
	StackNode next;
	
}
	void push(StackNode node, int data)
	{
		node.data=data;
		if(isEmpty())
		{
			
			top.next=null;
		}
		
		
		else
		{
			top.next=node;
		}
		top=node;
	}
	
	int pop()
	{
		int t=top.data;
		top=top.next;
		return t;
	}
	
	 boolean isEmpty()
	 {
		 if(top==null)
			 return true;
		 return false;
	 }

	
}



public class FindMinStack {


	public static void main(String args[])
	{
		
	}
	
	
}
