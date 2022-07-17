package array;

public class CountPairSumK {


    public static int countPair(int arr[],int n , int k){
        int countPair =0;
        int temp = arr[0];
        for(int i  =0; i<n ;i++){
            for(int j =i+1; j<n ;j++){
                if( k ==arr[i]+arr[j] && i !=j){
                    countPair ++;
                }
                else{
                    continue;
                }
            }

        }
        return countPair;

    }
    public static void main (String args []){
        int arr [] ={1,1,1,1};
        int n =4;
        int k =2;
        System.out.println(countPair(arr,n,k));

    }
}
