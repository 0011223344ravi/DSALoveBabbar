package array;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MaxSubArraySum {


   static long maxSubArraySum(int arr [] , int n ){

       HashMap <Integer, Long>  hm = new HashMap<>();

       long sum =0;
       int temp =0;
       for(int  i =0; i<n ; i++){

           sum = sum +arr[i];
           hm.put(i,sum);
       }

         System.out.println(hm);
       long sumValue =0;
       //Set<Map.Entry<Integer, Long>> entry = hm.entrySet() ;
       for (Map.Entry<Integer, Long> entry :hm.entrySet()){

           if(sumValue<entry.getValue()){

               sumValue = entry.getValue();
           }

       }

       return sumValue;
   }


    static long maxSubArraySumWithoutHashMap(int arr [] , int n ){

      // long newArr[] = new long [n];
        //4 2 -3 1 6
       long sum =0;
       long max =Integer.MIN_VALUE;
       for (int i =0; i<n ; i++){
           sum = sum +arr[i];
          // newArr[i]=sum ;
           if(max <sum )
              max =sum ;
           if(sum <0)
               sum =0;


       }


return max;
    }
   public static void main (String args []){

 int arr  [] ={-1 ,-2, -3, -4  ,44};
 int n =5;

      //System.out.println( maxSubArraySum(arr,n));
       System.out.println(  maxSubArraySumWithoutHashMap(arr,n));
   }
}
