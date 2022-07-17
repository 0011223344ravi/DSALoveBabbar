package SearchingAndSorting;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {


    static int majorityElement(int a[], int size)
    {
         int result =0;
         HashMap<Integer, Integer> hm = new HashMap<>();
         for(int i =0; i<size; i++) {
             if (hm.containsKey(a[i])) {
                 hm.put(a[i], hm.get(a[i]) + 1);

             } else {
                 hm.put(a[i], 1);
             }
         }
           for (Map.Entry<Integer, Integer > entry :hm.entrySet()){

               if(entry.getValue()>size/2) {
                   result = entry.getKey();
               }
               else{
                   result=-1;
               }
           }

         return result;

    }
     public static void main(String args []){

 int n =2;
 int a[] = {3,3};
 int x = majorityElement(a,n);
 System.out.println(x);

     }
}
