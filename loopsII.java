import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            String s = "";
            int sum = (a + b);
            s=s+sum;
            for(int x=1;x<n;x++){
                int sum1=b*((int)Math.pow(2,x));
                sum = sum + sum1 ;
                s=s+" "+sum;
            }
            System.out.println(s);
        }
        in.close();
    }
}
