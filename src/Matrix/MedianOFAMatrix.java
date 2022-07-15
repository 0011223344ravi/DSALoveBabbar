package Matrix;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Collections;

public class MedianOFAMatrix {
    static int median(int matrix[][], int r, int c) {
       int median =0;

       ArrayList<Integer> al = new ArrayList<>();
       for (int i =0; i<r ; i++){

           for(int j =0; j<c; j++){

              al.add(matrix[i][j]) ;
           }
       }
        Collections.sort(al);
       int n =al.size();
       System.out.println("n"+n);
       if(n%2==0){
           median=((al.get(n/2)+al.get(n/2-1))/2);
           System.out.println("Median in even count"+median);
       }
       else {
          // System.out.println("n/2" +n/2);
           median= al.get((n/2));
           System.out.println("Median in odd count"+median);
       }
       return median;
    }
    public static void main (String args []){
      int   R = 3; int  C = 3;
       int [][] M = {{1, 3, 5}, {2, 6, 9},{3, 6, 9}};

        System.out.println(median(M,R,C));
    }
}
