package String;

import java.util.Scanner;

public class PalindromString {



  static  int isPalindrom(String str ){
        String reversedString = "";
       int temp=0;
        int n = str.length();
        char arr [] = new char[n];
        arr=  str.toCharArray();
        for(int i =n-1 ; i>=0; i--){
            reversedString = reversedString+arr[i];

        }
        if(reversedString.equals(str)){
            temp=1;
        }
        else {
            temp =0;
        }
       return temp;
    }

    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrom(str));

    }
}
