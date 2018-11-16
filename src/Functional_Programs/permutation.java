package mj;
import java.util.*;
public class permutation
{
	public static void main(String ars[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.next();
		//int len = str.length();
		int f = 1;
		int l= str.length()-1;
		Utility.StringPermute(str, f, l);
	}
} 