package mj;



import java.io.*;
import java.util.*;

public class twoDarray {
	
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter n rows");
			int n = sc.nextInt();
			System.out.println("enter m cols");
			int m = sc.nextInt();
			int a[][]= new int[n][m];
			Utility.twoDarray(n,m,a);
		}
}