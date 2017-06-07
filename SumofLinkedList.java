import java.util.*;
public class SumofLinkedList {

	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a, b;
		Node header1=null,header2=null;
		System.out.println("Enter the two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		
		
		header1=insertInLL( header1,a);
		header2=insertInLL( header2,b);
		System.out.println("returned with value of header 1 and 2 "+header1.data+" "+header2.data);
		
		print(header1);
		print(header2);
		
		header2=sumOfLL(header1,header2);
		print(header2);
	
		}
		
		
		
	public static void print(Node header)
	{
		Node iterator=header;
		while(iterator!=null)
		{
		System.out.print(iterator.data+ " -> ");
		iterator=iterator.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	public static Node insertInLL(Node header,int a)
	
	{
		Node iterator=header;
		int acount=0;

		while(a!=0)
		{
		
		Node newnode=new Node();
		newnode.data=a%10;
		acount++;
		newnode.next=null;
		a/=10;
		if(acount==1)
			{
			header=newnode;
			iterator=newnode;
			}
		else
		
		{
			iterator.next=newnode;
			iterator=iterator.next;
		}
		
		
		
		}
		
	
		return header;
	}
	
	
	public static Node sumOfLL(Node header1,Node header2)
	{
		Node iterator1=header1;
		Node iterator2=header2;
		while(iterator1!=null || iterator2!=null)
		{
			if(iterator1!=null && iterator2!=null)
			{
					iterator2.data=iterator2.data+iterator1.data;
				
			}
			
			else if(iterator2==null && iterator1!=null)
				iterator2.data=iterator1.data;
				
			else if(iterator1==null && iterator2!=null)
				 iterator2.data=iterator2.data;
			 
			if(iterator2.data > 9)
				{
				if(iterator2.next==null)
				{
					Node newnode=new Node();
					iterator2.next=newnode;
				}
				iterator2.next.data++;
				
				iterator2.data=iterator2.data%10;
				}
			
			iterator1=iterator1.next;
			iterator2=iterator2.next;
		
	
		}
		return header2;
	}
	
}
