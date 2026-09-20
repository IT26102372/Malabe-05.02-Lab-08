import java.util.Scanner;
public class IT26102372Lab8Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number[] = new int[6];
        int count,maxNum;

        for(count = 0; count <= 5; count++) {

            System.out.print("Enter a positive Number (" + (count + 1) + "/6): ");
            number[count] = input.nextInt();

            if (number[count] <= 0) {
                System.out.println("Error: Please Enter Only Positive Number");
                count--;
            }
        }

        System.out.println("\n");
        System.out.println("Array Contents:");




        for(count = 0; count <= 5; count++){

                System.out.print(number[count] + " ");

        }

        System.out.println();

        maxNum = number[0];

        for(count = 1; count <=5; count++){
            if(number[count] > maxNum){
                maxNum = number[count];
            }
        }

        System.out.println("The Maximum Number Entered: " + maxNum);




    }
}