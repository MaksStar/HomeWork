import java.util.Scanner;

public class HomeWorkJava1 {
    public static void main(String[] args) {
        System.out.println("Конвертер десятичных чисел в двоичные");

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        double d = sc.nextDouble();
        String c = Integer.toBinaryString((int) d);

        System.out.print("Ваше число в двоичной системе: " + c );

        sc.close();
    }
}
