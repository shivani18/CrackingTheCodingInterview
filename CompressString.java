import java.util.*;
public class CompressString {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		compress(str);
		
	}

	static void compress(String str)
	{
		int i=0,j=0,ctr='1';
		char arr[]= str.toCharArray();
		char arr_new[]= new char[str.length()];
		while(i<=str.length()-1)
		{
			if( i<= str.length()-2 && arr[i]==arr[i+1])
			{
				if(i==str.length()-2)
				{
					ctr++;
					arr_new[j]=arr[i];
					arr_new[j+1]= (char)ctr;
					break;
					
				}
				ctr++;
				i++;
			}
			
			
			
			else 
			{
				if(i==str.length()-1)
					ctr='1';
				arr_new[j]=arr[i];
				arr_new[j+1]= (char)ctr;
				ctr='1';
				j+=2;
				i++;
			}
			
			
		}
		
		System.out.println(arr_new);
	}
	
	
}
