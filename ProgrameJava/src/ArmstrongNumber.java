import java.util.Scanner;

public class ArmstrongNumber {


    public static void main(String[] args) {

        int num, number, temp,a, c = 0;

        System.out.println("Enter 3 digit number");

        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        temp = num;

         //While loop
         while(num>0)
        {
            a=num%10;
            num=num/10;
            c = c + ( a * a * a);
        }
        if (temp==c){
               System.out.println("is armstrong number");}
        else
               { System.out.println("is not an armstrong number");
           }
    }
}