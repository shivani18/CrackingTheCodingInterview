import java.util.*;

 class Node
{
	int data;
	Node next;
	Node prev;
}
public class RemDupLinkedList {
public static void main(String args[]) {
	
Scanner sc=new Scanner(System.in);
int arr[]={5,6,7,5,5,12,13,13,11,4,4,4,7,7,4,7,5,11};

Vector<Node> vector= new Vector<>();
for (int i=0;i<arr.length;i++)
{
	Node newnode=new Node();
	vector.add(newnode);
	newnode.data=arr[i];
	if(i==0)
	{
		newnode.prev=null;
	}
	else if(i==arr.length-1) //last node
	{
		newnode.next=null;		//assigning null to current node since it is last
		newnode.prev=vector.elementAt(i-1);	
		vector.elementAt(i-1).next=newnode;
	}
	else
	{
		newnode.prev=vector.elementAt(i-1);
		vector.elementAt(i-1).next=newnode;
	}
	
}
int a[]=new int[vector.size()];
for(int i=0;i<vector.size();i++){
	System.err.println(vector.elementAt(i).data);
}
int arr_counter=0;
for(int i=0;i<vector.size();i++)
{
	//check if data in current vector node is already present in array
	if(doesExistInBuffer(vector.elementAt(i).data,a)==true)//exists i.e. not unique Hence Delete the node
	{
		if(i==vector.size()-1) //check if repeated element is last
		{
			vector.elementAt(i-1).next=null;
			vector.remove(i--);
			break;
		}
		
		vector.elementAt(i-1).next=vector.elementAt(i).next;
		vector.elementAt(i+1).prev=vector.elementAt(i-1);
		
		vector.remove(i--);
	}else{
		a[arr_counter++]=vector.elementAt(i).data;
	}
	
}
System.out.println("***");
for(int i=0;i<vector.size();i++){
	System.err.println(vector.elementAt(i).data);
	
}

}

private static boolean doesExistInBuffer(int data,int[] a) {
	// TODO Auto-generated method stub
	System.out.println("checking for"+data);
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==data)
			{
			System.out.println(true);
			return true;
			}
		
	}
	System.out.println(false);
	return false;
}
}