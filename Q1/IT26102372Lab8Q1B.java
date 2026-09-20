import java.util.Scanner;
public class IT26102372Lab8Q1B {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int myArray[] = new int[5];
        int evenArray[] = new int[5];
        int countEven = 0;
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

        System.out.println("\n");

        for(count = 0; count < 5; count++){

            if( (myArray[count] % 2) == 0){
                evenArray[countEven] = myArray[count];
                countEven++;
            }

        }

        System.out.println("evenArray Contents");

        for(count = 0; count < 5; count++){
            System.out.print(evenArray[count] + " ");
        }




    }
}