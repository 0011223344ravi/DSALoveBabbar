package String;

public class ValidSuffle {

  public static void validSuffleOrNot(String Str , String s1,String s2){

       int l1 = s1.length();
       int l2 = s2.length();
       int res = Str.length();
       if(res !=l1+l2)
       {
            System.out.println("No");
       }
       else {
            int i =0;int j=0;int k=0;
            int f =0;

            while (k < res) {

                 if (i < l1 && s1.charAt(i) ==Str.charAt(k)) {
                  i++;
                 }
                 else if(j < l2 && s2.charAt(j) ==Str.charAt(k)){
                      j++;
                 }

                 else {
                      f=1; break;
                 }
                 k++;

            }
            if(l1>i ||l2>j)
                 System.out.println("No");
            else
                 System.out.println("Yes");

       }

  }

     public static void main (String args []){
  String Str = "x2y1";
  String s1 = "xy";
  String s2 ="12";
          validSuffleOrNot(Str,s1,s2);
     }
}
