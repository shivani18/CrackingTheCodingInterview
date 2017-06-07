import java.util.*;
public class CheckMoves {

	
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter orginal string");
		String string1=sc.next();
		System.out.println("Enter new string");
		String string2=sc.next();
	checkMoves(string1,string2);
		
		
		
	}
	
	public static void checkMoves(String string1,String string2)
	{
		int ctr=0,lastIndex=0,iterator;
		if(Math.abs(string1.length()-string2.length())>1)
		{
			System.out.println("False");
			return ;
		}
		
		if(string1.length()>string2.length())
		{
			if(isDelete(string1,string2))
			{
				System.out.println("True");
				return;
			}
		}
		else if(string1.length()==string2.length())
		{
			if(isReplace(string1,string2))
			{
				System.out.println("True");
				return;
			}
		}
		
		else 
		{
			if(isInsert(string1,string2))
			System.out.println("True");
			return;
		}
			
			
		System.out.println("False");
			return ;

	}
	
	public static boolean isDelete(String string1,String string2)
	{
		int ctr=0,j=0;
		for(int i=0;i<string2.length();i++)
		{
			if(string1.charAt(i)!=string2.charAt(j))
			{
				ctr++;
				if(ctr>1)
					return false;
				
			}
			
			else j++;
		}
		return true;
	}
	
	public static boolean isReplace(String string1,String string2)
	{
		int ctr=0;
		for(int i=0;i<string2.length();i++)
		{
			if(string1.charAt(i)!=string2.charAt(i))
			{
				ctr++;
				if(ctr>1)
					return false;
				
			}
		}
		return true;
	}
	
	public static boolean isInsert(String string1,String string2)
	{
		int ctr=0,j=0;
		for(int i=0;i<string1.length();i++)
		{
			if(string1.charAt(i)!=string2.charAt(j))
			{
				ctr++;
				if(ctr>1)
					return false;
				i--;
				
			}
			
			 j++;
		}
		return true;
	}
}
	
