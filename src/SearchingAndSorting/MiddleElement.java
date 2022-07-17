package SearchingAndSorting;

import java.util.ArrayList;
import java.util.Collections;

public class MiddleElement {
    static int middle(int A, int B, int C) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(A);
        al.add(B);
        al.add(C);
        Collections.sort(al);
        return al.get(1);
    }

    public  static  void main (String args []){
  int n =middle(978 ,518, 300);
  System.out.println(n);

    }
}
