package array;

import java.util.*;

public class LongestConsecutiveSubsequence {



    static int findLongestConseqSubseq(int arr[], int N)
    {
        int longestConsequetiveCount =1;
   if(arr.length==1)
       return 1;
     //Set s = new HashSet();
     ArrayList<Integer> al = new ArrayList();



      Arrays.sort(arr);


        int a = arr[0];
        for(int i =1; i<N;  i++){


            if(arr[i]-a==1){
                longestConsequetiveCount++;
                a =arr[i];
            }
            else if(arr[i]-a==0){
               continue;
            }
            else {
                a=arr[i];
                al.add(longestConsequetiveCount);
                longestConsequetiveCount =1;

            }
            al.add(longestConsequetiveCount);
        }

        Collections.sort(al);
        int count =0;
        if(al.size()>1) {
            count = al.get(al.size() - 1);
        }
        else {
            count = al.get(0);
        }

         return count;


    }

    public static void main(String args[]){
  int arr  [] = {8 ,8 ,9, 9, 3,4};
  int N =6;
       System.out.println(findLongestConseqSubseq(arr,N));

    }
}
