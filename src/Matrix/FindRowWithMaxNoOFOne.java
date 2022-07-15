package Matrix;

import org.omg.Messaging.SyncScopeHelper;

import java.net.Inet4Address;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindRowWithMaxNoOFOne {
    static int rowWithMax1s(int arr[][], int n, int m) {
        int row = 0;
        int cmax = 0;

        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=m-1;j>=0;j--){
                if(arr[i][j] == 1)
                    count++;
                else
                    break;
            }
            if(count == m)
                return i;
            else if(cmax < count){
                row = i;
                cmax = count;
            }
        }
        if(cmax == 0)
            return -1;
        return row;

}
    public static void main (String args []){
        int N = 4 ;int M = 4;
        int Arr[][] = {{0, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 0}};


     System.out.println(rowWithMax1s(Arr,N,M));

    }
}
