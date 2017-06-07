import java.util.*;
public class Unique {
	

public static void main(String []args)
{	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String string= sc.next();
	string=string.toUpperCase();
	int val= string.charAt(0);
	System.out.println(val);
	if (isUnique(string))
	{
		System.out.println("String has unique characters");
	}
	else
		System.out.println("Negative");

}

public static boolean isUnique(String string)
{
	int i=0,j;
	while(i<string.length())
	{
		j=i+1;
		while(j<string.length())
		{
			
			if(string.charAt(i)==string.charAt(j))
			{
				return false;
			}
			j++;
		}
		i++;
		
	}
	return true;
}
	
}
