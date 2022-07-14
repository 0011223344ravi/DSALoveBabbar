package array;

import java.util.*;

public class MergeTwoSortedArrayWithoutUsingaExtraSpace {

    public void merge(int arr1[], int arr2[], int n, int m) {
      ArrayList<Integer> s = new ArrayList<Integer>();

         for(Integer i1:arr1){

          s.add(i1);
         }
        for(Integer i2:arr2){

            s.add(i2);
        }
        Collections.sort(s);
        for(int  i  =0; i<s.size(); i++){
             if(i<arr1.length){
                 arr1[i]= s.get(i);
             }else{
                 arr2[i]= s.get(i);
             }
        }


    }

    public static void main (String args []){


    }
}
