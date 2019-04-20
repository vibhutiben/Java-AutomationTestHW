import java.util.Scanner;

public class CountAinString {

    public static void main(String[]args){


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Name or Keyword: ");
        String str=sc.nextLine();

        int count = 0;
        int size=str.length();

        //For loop
        for (int i=0; i <size; i++){

            if (str.charAt(i)=='a' ||str.charAt(i)=='A'){
                count++;
            }
        }
        System.out.println(count);
    }
}
