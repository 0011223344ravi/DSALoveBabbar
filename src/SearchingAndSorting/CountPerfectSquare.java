package SearchingAndSorting;

public class CountPerfectSquare {
     static int countSquares(int N) {
          int count =0;


           for(int i =0; i<N; i++){
               double d = Math.sqrt(i);
                if ((d - Math.floor(d)) == 0){
                     count ++;
                }
           }
          return count -1 ;

     }

     public static void main (String args []){

      int  n =countSquares(5);
      System.out.println(n);
     }
}
