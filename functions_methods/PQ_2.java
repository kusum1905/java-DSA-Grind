//palindrome - A num is called palindrome if a num is equal to the reverse of a num(e.g 121)
import java.util.Scanner;
public class PQ_2 {
    public static void main(String[]args){
        System.out.print("please enter a number :");
        Scanner sc = new Scanner(System.in);
        int Palindrome = sc.nextInt();
    

    if(isPalindrome(Palindrome)) {
        System.out.println("number :"+Palindrome+" "+"is a Palindrome");
    } else {
        System.out.println("number :"+Palindrome+" "+"is not a Palindrome");
    }
    }
    public static boolean isPalindrome(int number) {
        int Palindrome = number;
        int reverse = 0;

        while(Palindrome != 0) {
        int remainder = Palindrome%10;
        reverse = reverse*10 + remainder;
        Palindrome = Palindrome/10;
        }
        if(number == reverse) {
            return true;
        }
        return false;

    }
}