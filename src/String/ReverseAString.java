package String;

import java.util.Scanner;

public class ReverseAString {
    public static String reverseWord(String str)
    {
        String reversedString = "";

        int n = str.length();
        char arr [] = new char[n];
        arr=  str.toCharArray();
        for(int i =n-1 ; i>=0; i--){
            reversedString = reversedString+arr[i];

        }
        return reversedString;
    }
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseWord(str));

    }

}
