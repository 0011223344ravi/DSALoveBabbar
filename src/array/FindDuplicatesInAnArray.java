package array;

import java.util.*;

public class FindDuplicatesInAnArray {



    public static ArrayList<Integer> duplicates(int arr[], int n) {
         ArrayList<Integer>  al = new ArrayList<>();
         int index =0;
         HashMap<Integer, Integer> hm = new HashMap<>();
        // int i =0;
         for (Integer i :arr){

             if(hm.containsKey(i)){
                 hm.put(i,hm.get(i)+1);
             }
             else{

                 hm.put(i,  1);
             }

         }

         for(Map.Entry<Integer, Integer> entry :hm.entrySet()){
             if(entry.getValue()>1){
                 al.add(entry.getKey());
                 Collections.sort(al);
             }
             else {
                index =-1;
             }

         }
         if(al.size()==0)
             al.add(-1);
         else Collections.sort(al);
         return al;
    }
    public static void main (String args []){
  int n =5;
  int arr  [] = {1,2,3,4,5};
        ArrayList<Integer>  al = new ArrayList<>();
        al =duplicates(arr,n);

        ArrayList<Integer>  al1 = new ArrayList<>();
        //al1 =duplicates1(arr,n);
        System.out.println(al);
        System.out.println(al1);

    }
}
