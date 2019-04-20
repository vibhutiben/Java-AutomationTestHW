import java.util.Scanner;

public class FiveDigitSum {
    private static Scanner scanner;

    public static void main(String[]args){
        int sum = 0;

        scanner=new Scanner(System.in);
        System.out.println("Enter any digit: ");
        int n = scanner.nextInt();

        //While Loop

        while(n>0){
            int reminder= n % 10;
            sum = sum + reminder;
            n = n /10;
        }
        System.out.format("Sum of the given digit = ",sum);

    }
}
