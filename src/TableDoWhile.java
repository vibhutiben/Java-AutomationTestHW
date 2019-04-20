import java.util.Scanner;

public class TableDoWhile {


    public static void main(String[]args){

       int a,b=1;

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number - ");
        a =sc.nextInt();

        //Do While
       do{
       int value=a*b;
       System.out.println(a +"*"+b+"="+value);
       b++;}

       while(b<=10);

    }

}
