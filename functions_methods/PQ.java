// Q1/PQ

import java.util.*;
public class PQ{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first input:");
        double x = sc.nextDouble();
        System.out.print("enter second input:");
        double y = sc.nextDouble();
        System.out.print("enter third input:");
        double z = sc.nextDouble();

        System.out.println("Average is"+average(x,y,z));
    }
    public static double average(double x,double y,double z) {
        return (x+y+z)/3;
    }
}