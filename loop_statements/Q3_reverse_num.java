import java.util.*;
public class Q3_reverse_num {

    public static void main(String[] args) {
        int n = 10899;
        while(n>0) {
        int lastDigit = n%10;    //to get a last digit
        System.out.print(lastDigit);
        n = n/10;   //to remove last digit
        }



