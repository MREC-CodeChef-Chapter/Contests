import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
          Scanner sc=new Scanner(System.in);
           int t=sc.nextInt();
               while(t-->0)
               {
                   int A=sc.nextInt();   //reading A
                   int B=sc.nextInt();   //reading B
                   int X=sc.nextInt();    //reading X
                   
                      int number_of_days=(B-A)/X;    //represents the days ur taking to pay ur tution fee
                    System.out.println(number_of_days);
               }
    }
}
