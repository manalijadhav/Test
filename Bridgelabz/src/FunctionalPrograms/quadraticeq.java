package mj;
import java.util.*;
public class quadraticeq {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a: ");
		double a = sc.nextDouble();
		
		System.out.println("enter value of b: ");
		double b = sc.nextDouble();
		
		System.out.println("enter value of c: ");
		double c = sc.nextDouble();
		Utility.quadraticeq(a, b, c);
		
}
}
