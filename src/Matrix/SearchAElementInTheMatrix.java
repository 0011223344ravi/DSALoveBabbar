package Matrix;

import java.util.Scanner;

public class SearchAElementInTheMatrix {

    static boolean search(int matrix[][], int n, int m, int x) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == x) {
                    return true;
                }
                }

            }
        return false;


    }

    public static void main (String args []){
int matrix[][] = {{ 3, 30, 38},
        {36, 43, 60},
        {40, 51, 69}};
int n = 3;int m = 3;int  x = 62;
      System.out.println(search(matrix,n,m,x));
    }
}
