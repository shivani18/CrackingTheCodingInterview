import java.util.*;
public class ReplaceSpaces {

	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String string=sc.next();
		char[] array=string.toCharArray();
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.println("In for loop");
			if(Character.isWhitespace(array[i]))
			{
				System.out.println("space found");
				shiftby2(array,i);
				array[i]='%';
				array[i+1]='2';
				array[i+2]='0';
				System.out.println("array length is"+array.length);
			}
		}
		//System.out.println(array);
	}
	
	public static void shiftby2(char [] array,int i)
	{
		System.out.println("inside shift");
		for(int j=array.length+1;j>=(i+3);j--)
		{
			array[j]=array[j-2];
		}
		System.out.println(array);
		
	}
	
	}
