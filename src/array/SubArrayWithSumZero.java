package array;

import java.util.ArrayList;
import java.util.HashSet;

public class SubArrayWithSumZero {


    static boolean findsum(int arr[],int n)
    {//4,2, -3,1, 6
        //HashSet<Integer> map = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum = sum + arr[i];
            if(sum==0 || arr[i] == 0 || al.contains(sum))  {
                return true;
            }
            al.add(sum);
        }
        return false;
    }


    public static void main (String args []){

       int arr  [] ={4,4,2,-3,1, 6};
       int n = 6;
       System.out.println( findsum(arr,n));
    }
}
