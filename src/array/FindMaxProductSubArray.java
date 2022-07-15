package array;

public class FindMaxProductSubArray {

   static  long maxProduct(int[] arr, int n) {
         long maxProduct = Long.MIN_VALUE;
         long product =1;
         for(int i =0; i<n ;i++){
            // product=1;
             for(int j =i;j<n;j++) {
                 product = product * arr[j];
                 if (maxProduct < product)
                     maxProduct = product;

             }
         }
         return maxProduct;
    }
    public static void main(String args []){
  int arr  [] = {2, 3, 4, 5, -1, 0};
  int n = 6;
        System.out.println(maxProduct(arr,n));


    }
}
