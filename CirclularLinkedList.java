import java.util.*;

public class CirclularLinkedList {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		Node header=new Node();
		System.out.println("Enter the number of nodes");
		n=sc.nextInt();	
		header=insertInCircularLinkedList(n);
		System.out.println("Enterted");
	
		header=findHeader(header);
		System.out.println("Header is "+header.data);	
	
	}
	
	static Node insertInCircularLinkedList(int n)
	{
		Scanner sc=new Scanner(System.in);
		Node newnode=new Node(), header=null;
		Node iterator=null;
		System.out.println("Enter "+n+" elements");
		for (int i=0;i<n;i++)
		{
			newnode.data=sc.nextInt();
			
			if(i==0)
			{
				header=newnode;
				iterator=header;
			}
			
			else
			{
				iterator.next=newnode;
				iterator=iterator.next;
			}
		
		}
		
		
		return header;
	}
	
	static Node findHeader(Node header)
	{
		System.out.println(header.data);
		HashSet<Integer> hashSet=new HashSet<>();
		Node iterator=header;
		while(iterator!=null)
		{
			if(!(hashSet.add(iterator.data)))
			{		
				System.out.println("Already exists"+iterator.data);
				break;}
			System.out.println(iterator.data);
			iterator=iterator.next;
			
		}
		System.out.println(hashSet);
		return iterator;
	}
	
}
