package array;

import java.util.Arrays;
import java.util.Scanner;

//here we are calculating kth min.
public class KthMinAndMax {
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        Arrays.sort(arr);
        k = arr[k];
        return k ;
    }

public static void main (String args []){
    Scanner sc = new Scanner(System.in);
    int  n   =sc.nextInt();
    int  arr[] = new int [n];
    int  k   =sc.nextInt();

    for(int i =0 ;i<n; i++){
        arr[i] = sc.nextInt();

    }
    int temp =kthSmallest(arr,0,k-1,k);
    System.out.println(temp);

}

}
