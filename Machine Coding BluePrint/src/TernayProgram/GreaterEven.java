package TernayProgram;

public class GreaterEven {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = (a>b)?a:b;
        String ans = (a%2 == 0)?"even":"odd";
        System.out.println("Greater number is: "+result);
        System.out.println("Even number is: "+ans);
    }
}
