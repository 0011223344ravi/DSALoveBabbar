package SearchingAndSorting;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class ValueEqualToIndex {
    public static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i =0; i<arr.length; i++){
            if(arr[i]==i+1)
            {
                al.add(arr[i]);

            }

        }

        return al ;
    }
    public static void main (String args []){

        ArrayList<Integer> al= new ArrayList<>();
        int arr[] ={2,4,5,3};
        int  n =4;
       al = valueEqualToIndex(arr,n);

       System.out.println(al);

    }
}
