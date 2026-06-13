import java.util.Scanner;                      //import scanner class to take input from user
public class PQ {
    public static void main(String[]args) {    //execution starts from the main method
    Scanner sc = new Scanner(System.in);
    System.out.print("input first integer :");
    int digits = sc.nextInt();
    System.out.println("the sum of integer"+sumDigits(digits));

    }

    public static int sumDigits(int n) {
    int sumDigits = 0;
    while(n>0) {
        int lastDigit = n%10;
        sumDigits += lastDigit;
        n = n/10;
    }
    return sumDigits;

    }
}