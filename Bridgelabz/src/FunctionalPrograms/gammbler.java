package mj;
import java.util.*;
import java.util.Random;
public class gammbler
{
     public static void main (String[] args)
    {
     Scanner sc = new Scanner(System.in);
     
     System.out.print("enter player's stake");
     int stake= sc.nextInt();
     
     System.out.print("enter player's goal");
     int goal= sc.nextInt();
     
     System.out.print("enter player's trials");
     int trials= sc.nextInt();
     
    Utility.gammbler(stake,goal,trials);
}
}
