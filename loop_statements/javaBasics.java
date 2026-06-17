import java.util.*;
public class javaBasics {
    public static void main(String[] args) {

        //print 100x hello world;

        // int counter = 1;
        // while(counter <= 10) {
        //     System.out.println("hello kusumm!");
        //     counter++;
        // }
        



        //print 1-N ;
    //    Scanner sc = new Scanner (System.in);
    //    int n = sc.nextInt();

    //    int counter = 1;
    //    while(counter <= n) {
    //     System.out.println(counter + " ");
    //     counter++;
    //    }



//reverse the given number
        // int n = 10899;
        // int rev = 0;

        // while(n>0) {
        //     int lastDigit = n%10;
        //     rev = (rev*10)+lastDigit;
        //     n = n/10;
        // }
        // System.out.println(rev);




        //break statement;
    //    for(int i = 1; i<=7; i++) {
    //     if(i == 4) {
    //         continue;
    //     }
    //     System.out.println(i);
    //    }
    //    System.out.println("i am out of the loop");



//using continue keyword
// Scanner sc =  new Scanner(System.in);
// do {
//     System.out.println("enter your number :");
//     int n = sc.nextInt();

//     if(n%10 == 0) {
//         continue;
//     }
//     System.out.print(" number was :"+n);
// } while(true);


//PATTERN QUESTION
// for(int line=1; line<=4; line++) {
//     for(int star=1; star<=line; star++) {
//         System.out.print("*");
//     }
//     System.out.println();
// }



//inverted star pattern
// int n= 5;
// for(int line=1; line<=n; line++){
//     for(int star=1; star<=(n-line+1); star++){
//        System.out.print("*");  
//     }
//     System.out.println();
// }


//half pyramid pattern
// 


//print character
// int n = 4 ;
// char ch = 'A';
// for(int line=1; line<=n; line++) {
//     for(int chars=1; chars<=line; chars++) {
//         System.out.print(ch);
//          ch++;
//     }
//      System.out.println();
 
// }

int n = 4;
for(int line=1; line<=4; line++) {
    for(int star=1; star<=n+1; star++) {
        line++;
        System.out.print("*");
    }
    System.out.println();
}
   }
}
   
     

       
        
    
