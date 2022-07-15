package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {


     public static int[][] overlappedInterval(int[][] Intervals)
     {
          Arrays.sort(Intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));

          List<int[]> res = new ArrayList<>();
          int[] current_interval = Intervals[0];

        /*  for(int i =0; i<current_interval.length;i++){
               System.out.println(current_interval[i]);
          }*/
          res.add(current_interval);

          System.out.println(res);

          for(int[] interval: Intervals){
               int current_begin = current_interval[0];
               int current_end = current_interval[1];
               System.out.println("current_begin" +current_begin);
               System.out.println("current_end" +current_end);

               int next_begin = interval[0];
               int next_end = interval[1];

               System.out.println("next_begin" +next_begin);
               System.out.println("next_end" +next_end);

               if(next_begin <= current_end){
                    current_interval[1] = Math.max(current_end, next_end);
               }
               else{
                    current_interval = interval;
                    res.add(current_interval);
               }
          }
          return res.toArray(new int[res.size()][]);
     }

     public static void main (String args []){


     }
}
