import java.util.*;
public class Pallindrome {
	
	public static void main (String args[]) {
		
		Scanner sc=new Scanner(System.in);
		Node header=null,iterator=new Node(), newnode=null;
		int c=1,i=1;
		String ans="y";
		
		
		
		while(ans.equals("y"))
		{
			System.out.println("Enter element to insert");
			
			newnode = new Node();
			
			if(i==1)//for first node
				{
				header=newnode;//header points to 1st node
				header.prev=null;
				}
			else
				newnode.prev=iterator;
				
			i++;
			newnode.data=sc.nextInt();
			newnode.next=null;
			
			iterator.next=newnode;
			iterator=iterator.next;
			
			System.out.println("Continue?");
			ans=sc.next();

		}
		
		if(checkPallindrome(header,newnode))
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}

	
	
	public static boolean checkPallindrome(Node header, Node tail)
	{
	
		while (header!=tail)
		{
			if(header.data!=tail.data)
				return false;
			
			header=header.next;
			tail=tail.prev;
		}
		return true;
	}
}
