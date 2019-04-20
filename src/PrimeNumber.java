import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[]args){

        int number,m=0,i,flag=0;

        System.out.println("Enter a number");

        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();

        m=number/2;

        //If Else and For Loop
        if(number==2||number==1){System.out.println("is not a prime number");}

        else
            {for(i=2;i<=m;i++) {

                if (number % i == 0) {
                    System.out.println("is not a prime number");

                    flag = 1;

                    break;
                }
            }    if(flag==0){System.out.println("is prime number");

            }


        }
    }
}
