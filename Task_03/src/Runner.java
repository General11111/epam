import java.util.Scanner;

import static java.lang.Math.*;

public class Runner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x:");
        double x = sc.nextDouble();
        System.out.println("Введите y:");
        double y = sc.nextDouble();

        double result = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);

        System.out.println("Значение по формуле равно: " + result);

    }

}
