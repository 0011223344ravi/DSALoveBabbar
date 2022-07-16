package BitManipulation;

import java.util.Stack;

public class SetBits {

    static int setBits(int N) {
        Stack<Integer> st = new Stack<>();
        int count =0;

        // Number Should be positive
        while (N > 0) {

            // Pushing numbers inside stack that
            // are divisible by 2
            st.push(N % 2);
            // Dividing number by 2
            N = N / 2;

           // System.out.println(1%2);
           // System.out.println(1/2);
        }

        while (!(st.isEmpty())) {

            // Printing binary number
            if(st.pop()==1){
                count ++;
            }
        }
        return count ;
    }
    public static void main (String args []){
        System.out.println(setBits(4));

       }

}
