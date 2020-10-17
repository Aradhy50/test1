import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Sol 
{
    static void miniMaxSum(int[] arr) 
    {
        int l= arr.length;
        int min=arr[0],max=0,sum=0;
        for(int i=0;i<l;i++)
        {
            int d=arr[i];
            sum =sum+d;
            if(d>max)
            max=d;
            else if(min>d)
            min=d;
        }
        System.out.println((sum-max)+" "+(sum-min));
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) 
        {
            arr[i] = scanner.nextInt();
        }
        miniMaxSum(arr);
        scanner.close();
    }
}
