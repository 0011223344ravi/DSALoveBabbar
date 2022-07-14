package String;

import java.util.Scanner;

public class StringIsRotationOfOther {


    public static boolean areRotations(String s1, String s2 )
    { String str = s1+s1;
         if(s1.length()!=s2.length()){
             return false;
         }

         else if(str.contains(s2)){
             return true;


    }
         else
             return false;
    }

    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(areRotations(str1,str2));

    }
}
