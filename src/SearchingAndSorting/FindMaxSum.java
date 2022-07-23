package SearchingAndSorting;

import java.util.ArrayList;

public class FindMaxSum {

    public static int FindMaxSum(int arr[], int n)
    {

          ArrayList<Integer> alEven = new ArrayList();
        ArrayList<Integer> alOdd = new ArrayList();
   int count =0;
        if(n<0){
            return 0;
        }


            if(n==0){
           return arr[0];
         }

        // if(arr)
       // int maxSum =0;
        int evenSum =0;
        int oddSum =0;

        for(int i =0; i<n; i=i+2){
            alEven.add(arr[i]);

   count ++;
        }

        for(int i =1; i<n; i=i+2){
            alOdd.add(arr[i]);
count ++;
        }

        //System.out.println(count);
        evenSum= alEven.stream().reduce(0,(a,b)->a+b);
        oddSum = alOdd.stream().reduce(0,(a,b)->a+b);
        if(oddSum>evenSum)
        return oddSum;
        else
            return evenSum;


    }
    public static void main (String args []){
  int arr [] = {10,2,3};int n= 3;
        int res =FindMaxSum(arr,n);
        System.out.println(res);


    }
}
