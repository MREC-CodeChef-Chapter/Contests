import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner s=new Scanner(System.in);
        int t,n;
        t=s.nextInt();
        while(t-->0)
        {
            n=s.nextInt();
            int A[]=new int[n];
            int B[]=new int[n];
            int C[]=new int[n];
            for(int i=0;i<n;i++)
            A[i]=s.nextInt();
            for(int i=0;i<n;i++)
            B[i]=s.nextInt();
            for(int i=0;i<n;i++)
            {
                if(A[i]>=B[i])
                C[i]=A[i]*10+B[i];
                else
                C[i]=B[i]*10+A[i];
            }
            for(int i=0;i<n;i++)
            System.out.print(C[i]+" ");
            System.out.println(" ");
        }
    }
}
