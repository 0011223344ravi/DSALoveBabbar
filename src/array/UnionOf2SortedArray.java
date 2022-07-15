package array;

import java.util.*;

public class UnionOf2SortedArray {

    public static void main (String args []){

      Scanner sc = new Scanner(System.in);

        Integer n  =sc.nextInt();
        Integer m = sc.nextInt();
        Integer arr1[]  = new Integer [n];
        Integer arr2 []  = new Integer [m];
        Integer[] combinedArrays = new Integer[n+m];
        for (int i =0;  i<n ;i++){
            arr1[i]= sc.nextInt();
           // arr2[i]  = sc.nextInt();
        }

        for (int i =0;  i<m ;i++){

            arr2[i]  = sc.nextInt();
        }

      ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i =0; i<n; i++){

          al.add(arr1[i]);
        }

        for (int i =0; i<m; i++){

           al.add(arr2[i]);
        }
   //System.out.println(al);
         Set<Integer> ts = new TreeSet<Integer>(al);
        System.out.println( ts.size());

        System.out.println(ts);
    }
}
