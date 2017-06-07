import java.util.*;
public class TestPallindrome {
 String string;
	
	public static void main(String args[])
	{
		int odd=0;
		Scanner sc= new Scanner(System.in);
		TestPallindrome tp= new TestPallindrome();
		System.out.println("Enter the string");
		tp.string=sc.next();
		if(tp.string.length()%2!=0)
		{
			odd++;
		}
		
		tp.testPallindrome(odd);
	System.out.println(Character.getNumericValue('z'));	

	}
	
	public void testPallindrome(int odd)
	{
		char array[]=string.toCharArray();
		char curr,mid; int j,midctr=0;
		for(int i=0;i<array.length && array[i]!='@';i++)
		{
			curr=array[i];
			for( j=i+1;j<array.length;j++)
			{
				if(array[j]==array[i])
				{
					array[j]='@';
					break;
				}

			}
			if(j==array.length) j--;
			if(array[j]!='@')
			{
			
				if(odd==1)
				{
					mid=array[i];
					midctr++;
					if(midctr>1)
					{
						System.out.println("Odd string is not a permutation of a pallindrome");
						return;
					}
				}
				else 
				{
					System.out.println("Even string is not a permutation of a pallindrome");
					return;
				}
				
			}
			
			
		}
		System.out.println("This string is a permutation of a pallindrome");
		
	}
	
}
