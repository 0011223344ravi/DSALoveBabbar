package BitManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NoRepeatingElements {


    public static int[] singleNumber(int[] nums)
    {
         HashMap<Integer, Integer> hm = new HashMap<>();
       ArrayList<Integer> al = new ArrayList<>();

         for(int i =0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1);
            }
            else {
                hm.put(nums[i], 1);
            }

         }
         for(Map.Entry<Integer, Integer> entry :hm.entrySet()){
             int i =0;
             if(entry.getValue()==1){


                 al.add(entry.getKey());

             }
             i++;
         }

        int num [] =new int [al.size()];
         for(int i =0; i< num.length; i++){
             num [i] = al.get(i);
         }
        Arrays.sort(num);
         return num;
    }
    public static void main (String args []){
      int   arr[] = {1 ,2 ,3 ,2 ,1 ,4};
        int arr1 []= new int [arr.length];
        arr1 = singleNumber(arr);
        for(int i =0; i<arr1.length;i++) {
            System.out.println(arr1[i]);
        }
    }
}
