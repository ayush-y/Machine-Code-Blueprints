package TernayProgram;
import java.util.Scanner;
public class Recursion {
    public static void main(String[] args) {
        System.out.println("Please enter your number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Factorial of "+x+" is: "+factIterator(x));
    }

    private static int factorial(int x) {
        if(x == 1){
            return 1;
        }
        return x*factorial(x-1);
    }
    private static int factIterator(int n){
        int ans = 1;
        while(n >= 1){
            ans  *= n;
            n--;
        }
        return ans;
    }
}
