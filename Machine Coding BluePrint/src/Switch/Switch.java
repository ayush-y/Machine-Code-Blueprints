package Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Day: ");
        int number = sc.nextInt();
        oldSwitch(number);
        newSwitch(number);
    }
    public static void newSwitch(int day){
        String dayStr = switch (day) {
            case 1 -> ("Monday");
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7 -> "Weekend";
            default -> "Invalid Day";
        };
        System.out.println(dayStr);
    }
    public static void oldSwitch(int day){
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:// Fall through
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
