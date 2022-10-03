import java.util.Scanner;

public class Example32 {
    public static void main(String[] args) {
        double x,y ,n;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number: ");

        n = input.nextDouble();

        x = n;
        System.out.println(1/2);
        for (int i =1; i <= 10; i++) {
            y = 1.0 / 2.0* (x + n / x);
            x = y;
            System.out.println(x);
        }
    }
}
