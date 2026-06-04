import java.util.*;
//imports the Scanner class,which is used to take input from keyboard

public class PQ {   //defines a class named
public static void main(String[] args) {
    //program starts executing from the main() method

    Scanner sc = new Scanner(System.in);
    //creats a scanner object named sc
    //system.in means input will come from the keyboard

    int number;
    int choice;
    int evenSum = 0;
    int oddSum = 0;

    do {
        System.out.println("enter the number :");
        number = sc.nextInt();

        if(number%2 == 0) {
            evenSum = evenSum+number;
        } else {
            oddSum = oddSum+number;
        }
        System.out.println("Do you want to continue? press 1 for yes or 0 for no");
        choice = sc.nextInt();
    } while (choice == 1);
    System.out.println("sum of even numbers:" + evenSum);
    System.out.println("sum of odd numbers:" + oddSum);
    
}

}
