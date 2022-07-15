package array;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class IntersectionOfTwoArray {

   public static  ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        //Union
        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i =0; i<n1; i++){

            al.add(A[i]);
        }

        for (int i =0; i<n2; i++){

            al.add(B[i]);
        }
        // System.out.println("al"+al);
        Set<Integer> ts = new TreeSet<Integer>(al);
        //System.out.println("ts"+ts);
        Integer [] arr = new Integer [ts.size()];
        arr =ts.toArray(arr);
   /*for(int  i =0; i<arr.length;i++){

       System.out.println("arr[i] :-"+arr[i]);
   }
*/

        //intersection


       // Set s = new TreeSet();
        ArrayList<Integer> al1 = new ArrayList<>();

        Arrays.sort(arr);
        Arrays.sort(C);
        int k = 0;
        int l = 0;

        while (k < arr.length && l < n3) {

            if (arr[k] < C[l]) {
                k++;
            } else if (arr[k] < C[l]) {

                l++;
            } else  {
               // System.out.println("C[i]" +C[k]);
                al1.add(arr[k]);
                k++;
                l++;
            }



        }

    //System.out.println("al1"+al1);
        return al1;

    }


    public static void main(String args []){
  int A[] ={1,2,3,4};
  int B [] ={4,5,6,1};
  int C[] ={4,7,8,9};
  int D [] = {1,2,3,4,5,6};

  int n =4; int m =4; int k =4 ; int d =6;

        System.out.println(commonElements(A,B,C,n,m,k));

        //intersection(D,C,k,d);



    }


    public static void union (int arr1[], int arr2[] , int n , int m ){
        //ArrayList<Integer> al1 = new ArrayList<Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i =0; i<n; i++){

            al.add(arr1[i]);
        }

        for (int i =0; i<m; i++){

            al.add(arr2[i]);
        }
        //System.out.println(al);
        Set<Integer> ts = new TreeSet<Integer>(al);
        Integer []  arr = (Integer[]) ts.toArray();




    }
    public static void intersection( int A[], int B[], int n1, int n2) {
       ArrayList<Integer> al = new ArrayList<>();

        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        int j = 0;

        while (i < n1 && j < n2) {

            if (A[i] < B[j]) {
                i++;
            } else if (B[j] < A[i]) {

                j++;
            } else if (A[i] == B[j]) {
                al.add(A[i]);
                i++;
                j++;
            }



        }

        System.out.println(al);
    }


}
