package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArray {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

       while(t!=0){

            int n = sc.nextInt();
            int arr [] = new int [n];
            for(int j  =0; j<n ; j++){

            arr[j] = sc.nextInt();
            }
            t--;

            for(int j  =n-1; j>=0 ; j--){
                System.out.print(arr[j] +" ") ;

            }

        }


    }
}
