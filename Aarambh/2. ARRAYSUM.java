import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();    //reading n
            int a[]=new int[n];  //creating array of size n 
            int sum=0;
          for(int i=0;i<n;i++)
          {
              a[i]=sc.nextInt();   //reading elements in array
              sum=sum+a[i];   //performing summation
          }
        System.out.println(sum);
    }
}
