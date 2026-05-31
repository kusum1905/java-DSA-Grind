import java.util.*;
public class if_else {
    public static void main(String[] args) {
        // int age = 19;
        // if(age >= 18) {
        //     System.out.println("you can vote,drive");
        // } else {
        //     System.out.println("you cannot vote , drive");
        // }

        // int a = 12;
        // int b = 10;
        // if(a > b) {
        //     System.out.println("largest number:" + a);
        // } else {
        //     System.out.println("largest number :" + b);
        // }

        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // if(num % 2 == 0) {
        //     System.out.println(num + " " +"is even");
    
        // } else {
        //     System.out.println(num + " "+ "is odd");
        // }


        // int age = 13;
        // if(age >= 18) {
        //     System.out.println("adult");
        // } else if(age>=13 && age<18) { //to save extra check
        //    System.out.println("teenager");
        // }
        // else{
        //     System.out.println("child");
        // }

        // Scanner sc = new Scanner(System.in);
        // int income = sc.nextInt();
        // int tax;

        // if(income < 500000) {
        //     tax = 0;
        // }
        // else if(income > 500000 && income < 1000000) {
        //     tax = (int) (income * 0.2) ;  //20% tax
        // }
        // else {
        //     tax = (int) (income * 0.3) ; //30% tax
        // }
        //   System.out.println("your tax is:" + tax)  ;



        // int A = 1, B = 2, C = 3;

        //  if((A >= B) && (A >= C)) {
        //     System.out.println("A is largest of 3");
        //  }
         
        //  else if (B >= C) {
        //     System.out.println("B is largest of 3");
        //  } 
        //  else {
        //     System.out.println("C is largest of 3");
        //  }


// Scanner sc = new Scanner(System.in);
// int marks = sc.nextInt();
//         if(marks >= 33) {
//             System.out.println("pass");
//         } else {
//              System.out.println("fail");
//         } 
//using ternary operator
// int marks = 36;
// String reportCard = marks >= 33 ? "pass":"fail";
// System.out.println(reportCard);


//calc
Scanner sc = new Scanner(System.in);
System.out.println("enter a :");
int a = sc.nextInt();
System.out.println("enter b :");
int b = sc.nextInt();
System.out.println("enter operator:");
char operator = sc.next().charAt(0);

switch (operator) {
    case '+' : System.out.println(a+b);
                break;
    case '-' : System.out.println(a-b);
                break;
    case '*' : System.out.println(a*b);
              break;
    case '/' : System.out.println(a/b);
              break;
    case '%' : System.out.println(a%b); 
              break;

    default :  System.out.println("wrong operator"); 

}    
        }

         }
