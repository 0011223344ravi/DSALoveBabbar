package array;

public class MinimumJumpsToReachEnd {

    static int minJumps1(int[] arr){
        // your code here
        if(arr.length==1){
            return 0;
        }
        if(arr[0]==0){
            return -1;
        }
        int maxrange = arr[0];
        int  step = 0;
        int jump =0;
        for(int i=0;i<arr.length;i++){
            step = Math.max(step,i+arr[i]);
            if(i==maxrange){
                maxrange = step;
                jump++;
            }
            if(maxrange>=arr.length-1){
                return jump+1;
            }
        }
        return -1;
    }


    static int minJumps(int[] arr){

        int a = arr[0];
        int minJumpCounts=0;
        int n = arr.length;

        if(n==1){

            minJumpCounts =0;
        }
        if(arr[0]==0){

           minJumpCounts=-1;
        }

        for(int i =0; i<n;  i =i+a ){
            a= arr[i];

          minJumpCounts++;
          if(a>=n-a)
              break;


        }

        return minJumpCounts;
    }
    public static void main (String args []){
       int arr []  =  {1, 4, 3, 2, 6, 7} ;
        System.out.println( minJumps(arr));

    }
}
