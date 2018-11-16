package mj;
import java.util.*;
class primenumbers
{
    void primenumbers(int n) 
    {
boolean arr[] = new boolean[n]; 
for(int i=0;i<n;i++) 
    arr[i] = true; 
  
for(int p = 2; p*p <n; p++) 
{ 
   
    if(arr[p] == true) 
    { 
       
        for(int i = p*2; i < n; i += p) 
            arr[i] = false; 
    } 
} 
  
for(int i = 2; i<n; i++) 
{ 
    if(arr[i] == true) 
    System.out.print(i + " "); 
}
}
public static void main(String args[]) 
{ 
    Scanner sc= new Scanner(System.in);
    System.out.print("enter the value of n  "); 
    int n= sc.nextInt(); 
    
    System.out.println("all prime numbers from " + n+ "are as follow"); 
    primenumbers nm = new primenumbers(); 
    nm.primenumbers(n); 
} 
} 