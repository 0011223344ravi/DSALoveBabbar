package array;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;

public class SubsetOrNot {


      public static String isSubset( long a1[], long a2[], long n, long m) {


            int count =0;
            Arrays.sort(a1);
            Arrays.sort(a2);
            ArrayList<Long>  al = new ArrayList<>();
          for(int i =0; i<n ; i++){
                al.add(a1[i]);
          }

          for(int i =0; i<m; i++){

              if(al.contains(a2[i]))
                    count ++;
          }

             if(count ==m){
                 return "Yes";
             }
             else
                   return "No";




      }


      public static void main (String args []){
            long a1[] = {589, 5847, 595, 959, 258};
            long a2[] = {258, 25};
            long n =5;
            int m =2;

            System.out.println(isSubset(a1,a2,n,m));

      }
}
