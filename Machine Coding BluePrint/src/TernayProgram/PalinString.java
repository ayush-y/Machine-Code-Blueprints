package TernayProgram;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PalinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your string: ");
        String str = sc.next();
        //System.out.println("Is the string palindrome? "+palinIterative(str));
        System.out.println("Is the string palindrome? "+palinIterative(str));
    }
    public static String palinIterative(String str){
        int s = 0;
        int e = str.length()-1;
        while(s <= e){
            if(str.charAt(s) != str.charAt(e)){
                return "No";
            }else{
                s++;
                e--;
            }
        }
        return "yes";
    }
    public static String palinRecursive(String str){
        if(str.length() == 0 || str.length() == 1){
            return "Yes";
        }
        if(str.charAt(0) == str.charAt(str.length()-1)){
            return palinRecursive(str.substring(1,str.length()-1));
        }
        return "No";
    }

}
