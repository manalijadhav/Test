package mj;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

//ASSIGNMENT 1
//User Input and Replace String Template “Hello <<UserName>>, How are you?” 
//I/P -> Take User Name as Input. Ensure UserName has min 3 char
//Logic -> Replace <<UserName>> with the proper name
//O/P -> Print the String with User Name 
//************************************************************************
public class Utility 
{
public static void username(String username)
{
	String Template = "Hello"  +username+ ",How are you";
    String str2= " Propername";
    if(username.length()<3)
    {
        System.out.println("Ensure UserName has min 3 char");
    }
   else{
   
   String str3 = Template.replaceAll(username , str2);
   System.out.println(str3);
}
}



//**********************************************************************************
//ASSIGNMENT 2
//Flip Coin and print percentage of Heads and Tails
//I/P -> The number of times to Flip Coin. Ensure it is positive integer.
//Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
//O/P -> Percentage of Head vs Tails

public static void coin(int flips)
{
	int heads=0;
	int tails=0;
	double a[]= new double[flips];
	if(flips<0)
{
    System.out.println("Ensure it is positive integer");
}
	else
{
  
		for(int i=0; i<flips;i++)
   {
       a[i]= Math.random();
       
   }
		for(int i=0; i<flips;i++)
   {
       System.out.println(a[i]);
       
   }
		for(int i=0; i<flips;i++)
   {
			if(a[i]<0.5)
   {
       System.out.println("tails");
       tails++;
   }
			else
   {
       System.out.println("heads");
       heads++;
   }
   }
}
System.out.println("count of tails is " +tails);
System.out.println("count of heads is " +heads);
float pertails = (float)(tails*100)/flips;
float perheads = (float)(heads*100)/flips;
System.out.println(pertails);
System.out.println(perheads);
}
//**********************************************************************
//ASSIGNMENT-3
//Leap Year
//I/P -> Year, ensure it is a 4 digit number.
//Logic -> Determine if it is a Leap Year.
//O/P -> Print the year is a Leap Year or not.
//Leap Year
//I/P -> Year, ensure it is a 4 digit number.
//Logic -> Determine if it is a Leap Year.
//O/P -> Print the year is a Leap Year or not.
public static void leapyear(int year)
{
if(year<4)
{
    System.out.println("ivalid entry");
}
else
{
    if(year%4==0 || year%100==0 || year%400==0)
{
    System.out.println("leap year");
}
else
{
    System.out.println("not a leap year");
}
}
}
//*******************************************************************************
//ASSIGNMENT 4
//Power of 2 
//Desc -> This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
//I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
//Logic -> repeat until i equals N.
//O/P -> Print the year is a Leap Year or not.
//*******************************************************************************
public static void tableof2(int N) {
	if(N>=31)
    {
        System.out.println("invalid input");
    }
    else
    {
        
        for(int i=0; i<=N;i++)
        {
            System.out.println(2+"^" +i+ ": "+ (i*2));
        }
    }
	
}

//********************************************************************************
//ASSIGNMENT NO-5
//Harmonic Number 
//Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N (http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
//I/P -> The Harmonic Value N. Ensure N != 0
//Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
//O/P -> Print the Nth Harmonic Value.
//********************************************************************************
	public static void harmonics(int N) {
			float sum=0;
		    if(N<=0)
		    {
		        System.out.println("Ensure N should not be zero");
		    }
		    else
		    {
		 for (int i = 1; i <= N; i++)
		{
		    
		    sum=sum+(float)1/i;
		 }
		System.out.println("sum is" +sum);
		    }
			
		}
//***********************************************************************************
//ASSIGNMENT 6
//Factors
//Desc -> Computes the prime factorization of N using brute force.
//I/P -> Number to find the prime factors
//Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
//O/P -> Print the prime factors of number N.
//***********************************************************************************
	public static void primefactors(int n)
	{
	ArrayList<Integer>fact=new ArrayList<Integer>();
     for(int i=2;2<=n;i++)
     {
  	   while(n%i==0)
  	   {
  		   fact.add(i);
  		   n=n/i;
  	   }
     }
     System.out.println("prime factors are");
     for(Integer k:fact)
     {
  	   System.out.println(""+k);
     }
	}
//******************************************************************************
//ASSIGNMENT-7
//Gambler
//Desc->Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of times he/she wins and the number of bets he/she makes. Run the experiment N times, averages the results, and prints them out.
//I/P -> $Stake, $Goal and Number of times
//Logic -> Play till the gambler is broke or has won
//O/P -> Print Number of Wins and Percentage of Win and Loss.
//******************************************************************************
	public static void gammbler(int stake, int goal, int trials)
	{
		int loss=0;
		int wins=0;

		for (int t = 0; t < trials; t++) 
		{
			int cash = stake;
			while (cash > 0 && cash <goal) 
			{
	           
	           if (Math.random() < 0.5)
	           cash++;     
	           else                     
	           cash--;     
	            
	         }
			if (cash == goal)
	        {
	          wins++;
	        }
	        else
	        {	
	        	loss++;
	        }
	       }
		
		System.out.println(wins + " wins of " + trials);
		double won= (100.0*wins)/ trials;
		
		System.out.println("Percent of games won = "+won);
		System.out.println(loss);
		System.out.println(loss+"loss of" +trials );
		double lose =(100.0*loss)/trials;
		System.out.println("Percent of games lose = "+lose);
		}

//****************************************************************************
//ASSIGNMENT 8
//Coupon Numbers
//Desc -> Given N distinct Coupon Numbers, how many random numbers do you need to generate distinct coupon number? This program simulates this random process.
//I/P -> N Distinct Coupon Number
//Logic -> repeatedly choose a random number and check whether it's a new one.
//O/P -> total random number needed to have all distinct numbers.
//Functions => Write Class Static Functions to generate random number and to process distinct coupons
//****************************************************************************
	
	
	private static int getCoupon(int n)
	{
		 
	    double random = Math.random()*n; 
	    System.out.println("random number is " +random);
		return (int) random;
	 }
    
    public static int collect(int n) {
        boolean[] isCollected = new boolean[n];  
        int count = 0;                           
        int distinct  = 0;                       
   
        while (distinct < n) {
            int value = getCoupon(n);           
            count++;                            
            if (!isCollected[value]) {           
                distinct++;
                isCollected[value] = true;
            }
        }
        return count;
    }
//*****************************************************************************
//ASSIGNMENT NO 9
//2D Array
//Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from standard input and printing them out to standard output.
//I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
//Logic -> create 2 dimensional array in memory to read in M rows and N cols 
//O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with OutputStreamWriter to print the output to the screen.
//******************************************************************************
public static void twoDarray(int n, int m, int a[][])
{
	
	PrintWriter pw = new PrintWriter(System.out, true); 
	Scanner sc = new Scanner(System.in);
	 pw.println("enter the elements");
	 for(int i=0;i<n;i++)
	 {
	     for(int j=0;j<m;j++)
	     {
	         a[i][j]= sc.nextInt();
	     }
	 }
	 
	 
	 for(int i=0;i<n;i++)
	 {
	     for(int j=0;j<m;j++)
	     {
	        pw.println("the elements are"+a[i][j]);
	       
	     }
	 }
	 
	 
	 pw.println("enter the elements");
	 for(int i=0;i<n;i++)
	 {
	     for(int j=0;j<m;j++)
	     {
	         a[i][j]= sc.nextInt();
	     }
	 }
	 
	 
	 for(int i=0;i<n;i++)
	 {
	     for(int j=0;j<m;j++)
	     {
	        pw.println("the elements are"+a[i][j]);
	       
	     }
	 }
}

//************************************************************************************
//ASSIGNMENT 10
//Sum of three Integer adds to ZERO
//Desc -> A program with cubic running time. Read in N integers and counts the   number of triples that sum to exactly 0.
//I/P -> N number of integer, and N integer input array
//Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
//O/P -> One Output is number of distinct triplets as well as the second output is to print the distinct triplets.
//***********************************************************************************
public static void sumof3int(int N)
{
Scanner sc = new Scanner(System.in);
int a[]= new int[N];
int count=0;
System.out.println("enter the elements of array");
for(int i=0;i<N;i++)
{
	a[i]=sc.nextInt();
	
}
for(int i=0;i<N-2;i++)
{
	for(int j=i+1;j<N-1;j++)
	{
		for(int k=j+1;k<N;k++)
		{
			if(a[i]+a[j]+a[k]==0)
			{
				System.out.println(a[i]+" "+a[j]+" "+a[k]+" ");	
				count++;
			}
			
		}
	}
	
}
if(count==0)
{
	System.out.println("no triplets present ");
}
System.out.println("number of triplets present  " +count);
}
//***********************************************************************************
//ASSIGNMENT 11
//Write a program Distance.java that takes two integer command-line arguments x and y
//prints the Euclidean distance from the point (x, y) to the origin (0, 0).
//The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
//***********************************************************************************
protected static void distance(int x, int y)
{
	double a= Math.pow(x, 2);
	double b=Math.pow(y, 2);
	
	double add = a+b;
	double result = Math.sqrt(add);
	System.out.println(" Calculated Euclidean distance is "+result);
	
}
//********************************************************************************
//ASSIGNMENT 12
//Write static functions to return all permutation of a String using iterative method and Recursion method.
//Check if the arrays returned by two string functions are equal.

protected static void StringPermute(String str, int f, int l)
{
	//int l = str.length()-1;
//	System.out.println("check");
	if(f==l)
		System.out.println(str);
	else
	{	
		for(int i=f; i<=l;i++)
		{
			str = swap(str,f,i);
			StringPermute(str,f+1,l);
			str= swap(str,f,i);
		}
	}
}
private static String swap(String a,int i,int j)
{
	char temp;
	char[] charArray = a.toCharArray();
	temp=charArray[i];
	charArray[i]=charArray[j];
	charArray[j]=temp;
	return String.valueOf(charArray);
}

//**********************************************************************
//ASSIGNMENT 13
//Simulate Stopwatch Program
//Desc -> Write a Stopwatch Program for measuring the time that elapses between the start and end clicks
//I/P -> Start the Stopwatch and End the Stopwatch
//Logic -> Measure the elapsed time between start and end
//O/P -> Print the elapsed time.
//***************************************************************************

public static void stopwatch(long start, long stop, long elapsed_time)
{
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Press 1 to start");
	start = sc.nextLong();
	
		if(start==1)
		{
			start= System.currentTimeMillis();
			System.out.println("start time is: "+start);
		}
		System.out.println("\n Press 2 to stop");
		stop = sc.nextLong();
		if(stop==2)
		{
			stop= System.currentTimeMillis();
			System.out.println("\n stop time is: "+stop);
		}
		elapsed_time = (stop-start);
		System.out.println("time difference is: "+elapsed_time);
		double elapsed_time_= (elapsed_time*60)/1000;
		System.out.println("time difference in seconds is: " +elapsed_time_);
}

//******************************************************************************
//ASSIGNMENT 14
//Cross Game or Tic-Tac-Toe Game 
//Desc -> Write a Program to play a Cross Game or Tic-Tac-Toe Game. Player 1 is the Computer and the Player 2 is the user. Player 1 take Random Cell that is the Column and Row. 
//I/P -> Take User Input for the Cell i.e. Col and Row to Mark the ‘X’
//Logic -> The User or the Computer can only take the unoccupied cell. The Game is played till either wins or till draw...
//O/P -> Print the Col and the Cell after every step.
//*******************************************************************************





















//***********************************************************************************
//ASSIGNMENT 15
//Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
//Since the equation is x*x, hence there are 2 roots.
//The 2 roots of the equation can be found using a formula.
//***********************************************************************************
public static void quadraticeq(double a, double b, double c)
{
	double delta = ((Math.pow(b, 2)) - (4 * a * c));
	System.out.println("value of delta is: " +delta);
	
	if(delta>0)
	{
	double r1 = (-b + Math.sqrt(delta)) / (2 * a);
	double r2 = (-b - Math.sqrt(delta)) / (2 * a);
	
	System.out.println("Roots of quadratic equations are: "+r1+" "+r2);
	
}
	else if(delta==0)
	{
		System.out.println("Roots are real and equal");
      double r1 = (-b + Math.sqrt(delta))/(2*a);
        System.out.println("Root: "+r1);
	}

	else
	{
		System.out.println(" Roots are imaginary");
	}
}

//********************************************************************************
//ASSIGNMENT 16
//Write a program WindChill.java that takes two double command-line arguments t and v.
//prints the wind chill. Use Math.pow(a, b) to compute ab. 
//********************************************************************************

public static void windchill(int t, int v)
{
	double a = (t *1.8)+ 32;
	double b = (18*v)/5;
	
	System.out.println("enter value of t and v ");
	//if(t>50 && 120 < v <3)
	
	double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
	System.out.println("Effective temperature is "+w);
}














































































}






