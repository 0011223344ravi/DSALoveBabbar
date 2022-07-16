package Matrix;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortTheMatrix {

    static int[][] sortedMatrix(int N, int Mat[][]) {
       {
            // code here
            int a[]=new int[N*N];
            int i=0,k=0;
            int j=0;
            while(i<N && j< N){
                a[k++]=Mat[i][j];
                j++;
                if(j==N){
                    i=i+1;
                    j=0;
                }
            }
            Arrays.sort(a);
            k=0;
            i=0;
            j=0;
            while(i<N && j< N){
                Mat[i][j]=a[k++];
                j++;
                if(j==N){
                    i=i+1;
                    j=0;
                }
            }
            return Mat;
        }
    }

    public static  void main (String args []){


        int N = 4 ;int M = 4;
        int Arr1[][] = new int [N][N];
        int Arr[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};

      System.out.println(sortedMatrix(N,Arr));

    }
}
