import java.util.*;




public class Partition {
	
	
	
	public static void main(String args[])
	{
		
		
		Scanner sc= new Scanner(System.in);
		int i=1;
		String ans="y";
		Node header= new Node(),iterator=new Node(),  newnode;
		
		iterator=header;//iterator will point to start of node
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
		System.out.println("Enter element to partition");

		i=sc.nextInt();
		iterator=header;
		sort(i,header);
	}
	
	
	public static void sort(int i, Node header)
	{
		int precount=1,postcount=1, elemcount=1;
		Node iterator= header,pre=null,post=null, element;
		
		while(iterator.data!=i)
			iterator=iterator.next;
		element=iterator;
		iterator=header;
		
		while(iterator!=null)
		{
			if(iterator.data==i && elemcount==1)
			{
				elemcount++;
			}
			else if(iterator.data>=i && elemcount!=1)
			{
				
				if(postcount==1)
				{
					post=iterator;
					post.prev=element;
					postcount++;
				}
				else
				{
					iterator.prev=post;
					post=iterator;
				}
					
					
			}
			else if(iterator.data<i)
			{
				
				if(precount==1)
				{
					pre=iterator;
					element.prev=pre;
					precount++;
				}
				else
				{
					pre.prev=iterator;
					pre=iterator;
					pre.prev=null;
	
				}
			}
			iterator=iterator.next;
		}
		post.next=null;
		iterator=element.prev;
		while(iterator!=null)
		{
			System.out.print(iterator.data+ " ");
			iterator=iterator.prev;
		}
		iterator=post;
		System.out.print(element.data+ " ");
		while(iterator!=element)
		{
			System.out.print(iterator.data+ " ");
			iterator=iterator.prev;
		}
		
	}

}
