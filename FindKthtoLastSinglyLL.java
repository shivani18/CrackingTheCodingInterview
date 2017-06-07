import java.*;
import java.util.Scanner;
import java.util.Vector;

class Node1
{
	int data;
	Node1 prev;
	Node1 next;
}
public class FindKthtoLastSinglyLL {
 
	
	/*public static void GetktoLast(int k, Vector<Node1> vector)
	{
		for(int i=k-1;i<vector.size();i++)
		{
			System.out.println(vector.elementAt(i).data);
		}
	}*/
	
	//function to enter into Double List at ith position
	public static Node1 insert(int i,int data,Node1 header){
		Node1 newnode=new Node1();
		newnode.data=data;
		Node1 counter=header;
		if(i==0)	
		{
			//insert at beginning of LL
			header=newnode;
			System.out.println(header.data);
			newnode.next=null;
			return header; //if we dont return header, the changes are made in local header, don't get updated
		}else{
			//insert in between at ith position
			for(int j=0;j<i-1;j++){
				counter=counter.next;
			}
			counter.next=newnode;
			newnode.next=null;
			newnode.prev=counter;
		}
		return header;
	}
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int arr[]={10,9,8,7};
		Node1 header=new Node1();
		header.next=null;
		header.prev=null;
		
		for (int i=0;i<arr.length;i++)
		{
			header=insert(i,arr[i],header);
		}
		Node1 lastnode=new Node1();
		//printing Double LL
		Node1 iterate=header;
		while(iterate!=null){
			System.err.println(iterate.data);
			
			if(iterate.next!=null)
				iterate=iterate.next;
			else{
				lastnode=iterate;
				iterate=iterate.next;
			}
		}
		System.out.println("enter k");
		int k=sc.nextInt();
		iterate=lastnode; //iterate points to last 
		for(int i=0;i<k-1;i++){
			iterate=iterate.prev;
		}
		System.err.println(iterate.data);
	}
	
	
	
	
	
}
