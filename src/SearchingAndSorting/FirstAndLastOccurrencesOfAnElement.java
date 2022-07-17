package SearchingAndSorting;

import java.util.ArrayList;

public class FirstAndLastOccurrencesOfAnElement {

    public static ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> al = new ArrayList<>();
        long first = 0;
        long last = 0;
        int count =0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]==x)
                count++;

        }
        if(count ==0){
          first=-1;
          last =-1;
          al.add(first);
          al.add(last);
          return al;
        }


         if(arr.length==1) {
            first =0;
            last =0;

            al.add(first);
            al.add(last);

         } else {

             for (int i = 0; i < n; i++) {

                 if (arr[i] == x && arr[(int) first]!=x ) {
                     first = i;
                    last = i;
                 } else if (arr[i] == x) {
                     last =i;

                 }


             }
             al.add(first);
             al.add(last);
         }
         return al;
    }

    public static void main(String args []){
     int n=1; int  x=5;
        long arr[] = { 1  };
        ArrayList<Long> al = find(arr,n,x);
        System.out.println(al);

    }
}
