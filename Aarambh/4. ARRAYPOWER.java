import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
           int t=sc.nextInt(); //reading test-cases
            while(t-->0)
            {
                int n=sc.nextInt();  //reading n
                int a[]=new int[n];   //creating 1-d array of size n
                  for(int i=0;i<n;i++)
                  {
                      a[i]=sc.nextInt();    //reading elements in array
                  }
                Arrays.sort(a);   //sorts the array
                    long answer=(long)a[n-1]*a[n-2]*a[n-3];  //calculating power of array
                System.out.println(answer);
            }
    }
}
