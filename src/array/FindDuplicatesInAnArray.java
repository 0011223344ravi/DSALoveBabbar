package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInAnArray {



    public static ArrayList<Integer> duplicates(int arr[], int n) {
         ArrayList<Integer>  al = new ArrayList<>();
         int index =0;
         HashMap<Integer, Integer> hm = new HashMap<>();
        // int i =0;
         for (int i =0; i<n ;i++){

             if(hm.containsKey(i) ){
                 hm.put( i,hm.get(i)+1);
             }
             else{

                 hm.put(i,  1);
             }
             //i++;
         }

         for(Map.Entry<Integer, Integer> entry :hm.entrySet()){
             if(entry.getValue()>1){
                 al.add(entry.getKey());
             }
             else {
                index =-1;
             }

         }
         return al;
    }
    public static void main (String args []){
  int n =5;
  int arr  [] = {1,2,1,2,3};
        ArrayList<Integer>  al = new ArrayList<>();
        al =duplicates(arr,n);
        System.out.println(al);

    }
}
