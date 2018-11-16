package mj;
import java.util.*;
public class coupon 
{
	
		
	    private static void main(String[] args)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Coupon numbers");
		int n = sc.nextInt();
	    int count =Utility.collect(n);
		System.out.println("count is "+count);
		
		}

		
} 