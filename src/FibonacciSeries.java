import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[]args){

        int n=0,t1=0,t2=1;

        Scanner scanner=new Scanner(System.in);
        System.out.print("First terms:");
        n=scanner.nextInt();
        //For Loop
        for( int i = 1; i<=n;++i){

            System.out.print(t1 + "+");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

    }
}
