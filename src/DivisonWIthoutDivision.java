import java.util.*;
public class DivisonWIthoutDivision {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int x = s.nextInt();
        s.nextLine();
        System.out.println("Enter another positive integer");
        int y = s.nextInt();
        s.nextLine();
        int a = 0;
        int b = 0;
        while (x - a >= y) {
            b++;
            a += y;
        }
        System.out.print(b + ".");
        int remainder = x - a;
        boolean on = true;
        while (on) {
            x= 0;
            for (int i = 0; i < 10; i++) {
                x += remainder;
            }
            a = 0;
            b = 0;
            while (x - a >= y) {
                b++;
                a += y;
            }
            System.out.println(b);
            remainder = x - a;
            if (remainder == 0) {
                on = false;
            }
        }
        s.close();


    }

}


















































