import java.util.Scanner;

import static java.lang.Math.*;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a");
        int a = scanner.nextInt();
        System.out.println("Введите b");
        int b = scanner.nextInt();
        System.out.println("Введите c");
        int c = scanner.nextInt();

        int z = ((a - 3) * b / 2) + c;
        System.out.println("Значение z = " + z);

    }

}
