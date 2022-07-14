package String;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacterInString {


   public static void  findDuplicateCharacterInString(String str ){

       int n = str.length();
       char ch [] = new char[n];
       ch = str.toCharArray();
     HashMap<Character, Integer> hm = new HashMap<>();
       for(Character c :ch){

           if(hm.containsKey(c)){
               hm.put(c,hm.get(c)+1);
           }
           else{

               hm.put(c,1);
           }
       }

       for(Map.Entry<Character, Integer> entry :hm.entrySet()){
           if(entry.getValue()>1){
               System.out.println(entry.getKey());
           }

       }

    }
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
         findDuplicateCharacterInString(str);

    }
}
