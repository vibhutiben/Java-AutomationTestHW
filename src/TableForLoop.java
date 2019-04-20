import java.util.Scanner;

public class TableForLoop {


 public static void main(String[]args) {

     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number:");
     int t=sc.nextInt();

     //For Loop
     for(int i =1;i<=10;i++){
         int value = t*i;

         System.out.println(t +"*"+i+"="+value);
     }

}
}
