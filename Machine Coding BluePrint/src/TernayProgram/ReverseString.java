package TernayProgram;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your string: ");
        String str = sc.next();
        System.out.println("Reversed string is: "+reverseString(str));

    }

    private static String reverseString(String str) {
        StringBuilder newStr = new StringBuilder(" ");
        for(int i = str.length()-1; i >=0; i--){
            newStr.append(str.charAt(i));
        }
        return newStr.toString();
    }
}
