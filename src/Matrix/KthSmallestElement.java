package Matrix;

import java.util.ArrayList;
import java.util.Collections;

public class KthSmallestElement {

    public static int kthSmallest(int[][]mat,int N,int k)
    {
        ArrayList<Integer> al = new ArrayList<>();
        int i =0; int j =0;

        while(i<N && j< N){

            al.add(mat[i][j]);
            j++;
            if(j==N){
                i=i+1;
                j=0;
            }
        }
        Collections.sort(al);
        return al.get(k);

    }
    public static void main (String args []){

        int Arr[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        int n =4;
        int k =3;

        System.out.println(kthSmallest(Arr,n,k-1));

    }
}
