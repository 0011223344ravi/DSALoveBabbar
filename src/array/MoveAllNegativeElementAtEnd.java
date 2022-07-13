package array;

import java.util.Scanner;

public class MoveAllNegativeElementAtEnd {

    public static void segregateElements(int arr[], int n)
    {
        int [] result = new int [n];
        int index =0;
        for(int i =0;  i<n  ;i++){

            if(arr[i]>0){
                result[index++] =arr[i];
            }
        }

        for(int i =0;  i<n  ;i++){

            if(arr[i]<0){
                result[index++] =arr[i];
            }
        }

        int i  =0;
        for(Integer element :result){
            arr[i++] =  element;

        }

       /* for (int k  =0; k <n;k++){
            System.out.println(arr[k]);

        }*/
    }

     public static void main (String args []){

         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int [] arr = new int[n];
         for (int i  =0; i<n ;i++){

             arr[i] = sc.nextInt();
         }
         segregateElements (arr , n);

     }
}
