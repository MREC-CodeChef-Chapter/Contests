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
            int max=0,sum=0;
            n=s.nextInt();
            int A[]=new int[n];
            int B[]=new int[n];
            for(int i=0;i<n;i++)
            {
                A[i]=s.nextInt();
                if(max<=A[i])
                max=A[i];
            }
            for(int i=0;i<n;i++)
            {
                B[i]=s.nextInt();
                sum=sum+B[i];
            }
            if(max>=sum)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}
