import java.util.Scanner;

public class CountPositiveNegativeZero {


    public static void main(String[]args){

        Scanner sc =new Scanner(System.in);

        int number,countpositive=0,countnegative=0,countzero=0;
        char choice;
         //Do While and If else
          do   {
            System.out.print("Enter the number");
            number =sc.nextInt();

            if(number>0){
                countpositive++;
            }
            else if (number<0){
                countnegative++;}

                else{ countzero++;

                }
                System.out.println("do you want to continue y/n?");
                choice=sc.next().charAt(0);

            }while (choice=='y'||choice=='Y');

          System.out.println("positive numbers: " + countpositive);
          System.out.println("negative numbers: " + countnegative);
          System.out.println("zero numbers: " + countzero);

        }
    }


