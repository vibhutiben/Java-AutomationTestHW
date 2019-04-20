import java.util.Scanner;

public class Reversestring {

    public static void main(String[]args){

        String name;
        System.out.println("Enter a String ");

        Scanner scanner=new Scanner(System.in);
        name=scanner.next();

       StringBuilder sb=new StringBuilder();

       //For loop
       for(int i=name.length()-1;i>=0;i--){

         sb.append(name.charAt(i));
       }
        {System.out.println("Reversed string is");
         System.out.println(sb.toString());

    }
}}
