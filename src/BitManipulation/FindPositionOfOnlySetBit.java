package BitManipulation;

import java.util.Stack;

public class FindPositionOfOnlySetBit {

    public static  int powerOf2(int N ){

        Stack<Integer> st = new Stack<Integer>();
        int count =0;
        int postion =0;
        String result="";

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
        //System.out.println(st);
        int temp = st.size();
        while(!st.isEmpty()) {
            if (st.pop() == 1) {
                count++;

            }
        }
        //System.out.println(count );
        if(count ==1) {
            result ="Yes";
            postion= temp;

        }
        else {
            result="No";
            postion = -1;
        }
        return postion;

    }

    public static void main (String args []){
        System.out.println( powerOf2(4));

    }
}
