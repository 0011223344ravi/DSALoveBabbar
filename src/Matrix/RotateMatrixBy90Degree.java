package Matrix;

public class RotateMatrixBy90Degree {


    static int[][] rotateBy90(int arr[][], int n) {
        int arr1[][] = new int[n][n];

        for (int i = 0; i < arr[0].length; i++)
            for (int j = 0, k = arr[0].length - 1; j < k;
                 j++, k--) {
                int temp = arr[j][i];
                arr[j][i] = arr[k][i];
                arr[k][i] = temp;
            }

        for (int i = 0; i < arr.length; i++)
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
            }


        return arr;
    }

    public static void main(String args[]) {
        int arr1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = 3;
        int arr2[][] = new int[n][n];

        arr2 = rotateBy90(arr1, 3);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j > n; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
