package array;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateOnePositionClockWise {
    public  static void rotate(int arr[], int n)
    {
        int temp =arr[n-1];
        int  arr1 [] = new int  [n];
        arr1[0] = temp;
        for (int i =1; i<n ;i++){

            arr1[i] =arr[i-1];
        }

        for (int i =0; i<n ;i++){

            arr[i] =arr1[i];
        }

        for(Integer i :arr){

            System.out.println(i);
        }
    }

    public static void main (String args []){
  int arr [] = {1,2,3,4,5};
  int n =5;
  rotate(arr,n);
    }
}
