import java.util.*;
public class basics.java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
         float pencil = sc.nextFloat();
          float eraser = sc.nextFloat();

          float total= pen + pencil+eraser;
          System.out.println("bill is :"+ total);

          //ADD ON 18% TAX 
          float newTotal = total + (0.18f * total);
          System.out.println("bill with 18% tax :" + newTotal) ;
    }
}