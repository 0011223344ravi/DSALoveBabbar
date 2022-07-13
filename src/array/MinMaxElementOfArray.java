package array;

import java.util.Scanner;

public class MinMaxElementOfArray {



public static void main (String args []){

    Scanner sc = new Scanner(System.in);
    long n   =sc.nextLong();
    long arr[] = new long[Math.toIntExact(n)];
    for(int i =0 ;i<n; i++){
        arr[i] = sc.nextLong();

    }
    Compute compute = new Compute();
    pair p =   compute.getMinMax(arr, n);
    System.out.print(p);



}

}

class Compute
{
    public pair getMinMax(long a[], long n)
    {
         long min =a[0];
         long max =a[0];
         long temp =0;

         for(int i =1; i<n; i++){


            temp = a[i];

            if(temp>max){
               max =temp;
             }
             else if(temp <min) {
                min =temp;
             }

         }

       pair p = new pair(min, max);
       return p;
    }
}

class pair
{
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
