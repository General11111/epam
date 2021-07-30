import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Runner {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a");
        int a = scanner.nextInt();
        System.out.println("Введите b");
        int b = scanner.nextInt();
        System.out.println("Введите c");
        int c = scanner.nextInt();

        double result = b + sqrt((b * b) + (4 * a * c)) / (2 * a) - a * (a * a) * c + (1 / b * b);
        System.out.println(result);


    }

}
