import java.util.Scanner;
public class IT26102372Lab8Q1A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int myArray[] = new int[5];
        int count;

        for(count = 0; count < 5; count++) {

            System.out.print("Enter a positive Number " + (count + 1) + ": ");
            myArray[count] = input.nextInt();


        }

        System.out.println("\n");
        System.out.println("Array in reverse Order:");




        for(count = 4; count >= 0; count--){

                System.out.print(myArray[count] + " ");

        }





    }
}