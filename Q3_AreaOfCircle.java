import java.util.*;
public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println(area);

        float a = 25.9999f;
        int b = (int) a;
        System.out.println(b);
    }
}