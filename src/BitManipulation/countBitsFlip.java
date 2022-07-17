package BitManipulation;

import java.util.ArrayList;
import java.util.Stack;

public class countBitsFlip {

    public static int countBitsFlip(int a, int b){
        int count = 0;
        int n = a^b;
        while (n != 0) {
            count++;
            n &=(n-1);
        }
        return count;
    }
    public static void main(String args []){
        int n = countBitsFlip(10,20);

        System.out.println(n);

    }
}
