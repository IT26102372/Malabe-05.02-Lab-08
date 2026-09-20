import java.util.Scanner;
public class IT26102372Lab8Q4 {

    public static void main(String[] args) {

        int studentArray[] = new int[8];
        int count,studentID;

        Scanner input = new Scanner(System.in);

        for(count = 0; count < 8; count++){

            System.out.print("Enter student ID for student " + (count + 1) + ": ");
            studentArray[count] = input.nextInt();

                if(studentArray[count] <= 0 ){
                    System.out.println("Error: Please Enter ONLY positive Numbers");
                    count--;
                }

        }

        System.out.println("\n");

        System.out.print("Enter a Student ID to Search: ");
        studentID = input.nextInt();

        System.out.println();

        for(count = 0; count < 8; count++){

            if(studentID == studentArray[count]){
                System.out.print("Student is Available");
                return;
            }
        }

        System.out.println("Student is not Available");




    }
}