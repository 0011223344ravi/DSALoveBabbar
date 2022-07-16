package Matrix;

public class CelebrityProblem {

    public  static int celebrity(int N , int Mat [][] ){


        int celebR =0;
        int celebC =0;
        int celeb =0;
        boolean rboolean = false;
        boolean cboolean = false;
        int rcount =0;
        int ccount =0;
        int countZero =0;




        int i=0;
        int j=0;

        while(i<N && j< N){
            if(Mat[i][j] ==0){
                countZero++;
            }
            j++;
            if(j==N){
                i=i+1;
                j=0;
            }
        }

          i=0;
         j=0;

        while(i<N && j< N){
            if(Mat[i][j]==0) {
                rcount++;
            }

            j++;
            if(j==N){
                if(rcount ==N)
                {
                    rboolean= true ;
                    celebR= i ;
                    break ;
                }
                else {
                    rcount=0;
                }
                i=i+1;
                j=0;
            }
        }
         System.out.println("celebR"+celebR);
        i =0;j=0;
        while(i<N && j< N){
            if(Mat[i][j]==1 ) {
                ccount++;
            }


            i++;
            if(i==N){
                if(ccount ==N-1)
                {
                    cboolean= true ;
                    celebC= j;
                    break ;
                }
                else {
                    ccount=0;
                }
                j=j+1;
                i=0;
            }
        }

         System.out.println("celebR"+celebR+"celebC"+celebC);
       if (countZero==(N*N)){
            celeb= -1;

        }
        else  if(celebR == celebC) {
            celeb = celebR;
        }

        else {
            celeb = -1;
        }

        System.out.println(celeb);
        return celeb;

    }

    public static void main (String args []){
   int Mat [][] =  { {0, 0, 0, 0},
           {0, 0, 0, 0},
           {0, 0, 0, 0},
           {0, 0, 0, 0} };
   int n=4;
   System.out.println(celebrity(n,Mat));

    }
}
