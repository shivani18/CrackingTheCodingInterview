import java.util.*;


public class DeleteMiddleNode {
	
	
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
						header=newnode;//header points to 1st node
					
					i++;
					newnode.data=sc.nextInt();
					newnode.next=null;
					iterator.next=newnode;
					iterator=iterator.next;
					
					System.out.println("Continue?");
					ans=sc.next();
	
				}
			iterator=header;
			while (iterator!=null)
			{
				
				System.out.println(iterator.data);
				iterator=iterator.next;
				
			}
				
			System.out.println();
			System.out.println("Enter element to delete");
			i =sc.nextInt();
			iterator=header;
			while(iterator.next!=null)
			{
				if (iterator.next.data==i)
				{
					iterator.next=iterator.next.next;
				
				}
					
				
				else
					iterator=iterator.next;
			}
				
			
			iterator=header;
			while (iterator!=null)
			{
				
				System.out.println(iterator.data);
				iterator=iterator.next;
			}
			
		}
		
	}
	
	
	


