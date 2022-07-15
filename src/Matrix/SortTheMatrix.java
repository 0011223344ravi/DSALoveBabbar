package Matrix;

import java.util.Arrays;
import java.util.Comparator;

public class SortTheMatrix {
    public static  void Sort2DArrayBasedOnColumnNumber (int[][] array, final int columnNumber){
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] first, int[] second) {
                if(first[columnNumber-1] > second[columnNumber-1]) return 1;
                else return -1;
            }
        });
    }


    public static  void main (String args []){


        int N = 4 ;int M = 4;
        int Arr1[][] = new int [N][N];
        int Arr[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};

        Sort2DArrayBasedOnColumnNumber(Arr,N);
        for (int i =0; i<N; i++ ){
            for (int j =0; j<M; j++)
            {
            Arr1[i][j]=Arr[i][j];

            }

        }

        for (int i =0; i<N; i++ ){
            for (int j =0; j<M; j++)
            {
                System.out.print(Arr1[i][j] +" ");

            }
           System.out.println();
        }

    }
}
