import java.util.Scanner;

public class ReverseNumbers {


public static void main(String[]args){

    int num,reversed=0;

    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the number:");
    num=scanner.nextInt();

    //While Loop
    while(num!=0){

        int digit=num%10;
        reversed=reversed*10+digit;
        num/=10;

    } System.out.println("Reversed number " + reversed);
}
}
