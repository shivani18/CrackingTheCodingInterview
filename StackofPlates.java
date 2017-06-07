import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;


class SetofStacks
{
	static int sizeofStack;
	 
	public SetofStacks(int size) {
		// TODO Auto-generated constructor stub
		sizeofStack=size;
	}
	ArrayList<Stack> stacks = new ArrayList<Stack>();
	void push(int k)
	{
		Stack last= getLastStack();
		if(last !=null && ! isFull(last))
		{
			last.push(k);
		}
		else if (last==null)
		{
			last=new Stack<Integer>();
			last.push(k);
			stacks.add(last);
			
				
		}
		else if(isFull(last))
		{
			Stack newlast= new Stack<>();
			newlast.push(k);
			stacks.add(newlast);
		}
	}
	static boolean isFull(Stack stack)
	{
		return  stack.size()== sizeofStack;
	}
	
	Stack getLastStack()
	{
		
		if (stacks.size()==0)
				return null;
		else
			return stacks.get(stacks.size()-1);
		
	}
	
	int pop() throws EmptyStackException
	{
		if (stacks.size()==0)
			throw new EmptyStackException();
		else
		{
			System.out.println("After pop");
			int k= (int)stacks.get(stacks.size()-1).pop();
			if (getLastStack().size()==0)
				stacks.remove(getLastStack());
			return k;
		}
	}
	
	void popAt(int n)
	{
		stacks.get(n-1).pop();
		if (getLastStack().size()==0)
			stacks.remove(getLastStack());
	}
	
	void display()
	{
		int i;
		int j=0;
		System.out.println("Size of array list"+ stacks.size());
		while(j<stacks.size())
		{
			
			System.out.print(stacks.get(j));
			System.out.println();
			j++;
		}
	}
	
	
}
public class StackofPlates 
{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		SetofStacks set= new SetofStacks(5);
		for(int i=0;i<17;i++)
		set.push(i+1);
		set.display();
		int i;
		i=set.pop();
		set.display();
		System.out.println("Enter the substack to be popped");
		int n=sc.nextInt();
		set.popAt(n);
		set.display();
		
	}
	
	
	
}
