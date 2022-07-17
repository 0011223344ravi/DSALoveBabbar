package SearchingAndSorting;

public class SearchAnElement {

    static int Search(int array[], int target)
    {
        int index =0;

        for (int i =0; i<array.length; i++){

          if(array[i]==target){
              index=i;
              break;
          }
          else {
              index=-1;
          }
         // System.out.println(index);
        }
        return index;
    }
    public static void main (String args []){
int arr [] ={3,1,2};
int target =1;
       int n = Search(arr,target);
       System.out.println(n);

    }
}
