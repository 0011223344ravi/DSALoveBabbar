package SearchingAndSorting;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindMissingAndRepeating {
   public static   int[] findTwoElement(int arr[], int n) {
       //int[] arr = { 4, 3, 6, 2, 1, 1 };
  ArrayList<Integer> al  = new ArrayList<>();
       Map<Integer,Boolean> numberMap
               = new HashMap<>();

       int max = arr.length;

       for (Integer i : arr) {

           if (numberMap.get(i) == null) {
               numberMap.put(i, true);
           }
           else {
               System.out.println("Repeating = " + i);
               al.add(i);
           }
       }
       for (int i = 1; i <= max; i++) {
           if (numberMap.get(i) == null) {
               System.out.println("Missing = " + i);
               al.add(i);
           }
       }
         System.out.println(al);
         int a[] = new int [2];
          a[0] = al.get(0);
          a[1]=al.get(1);
          return a;
     }
     public static void main (String args []){
          int n =2;
        int arr [] = {2,2};
          int arr1 [] = new int [2];
          arr1=findTwoElement(arr,n);
          for(int i =0; i<2 ; i++){
            // System.out.println(arr1[i]);
          }


     }
}
