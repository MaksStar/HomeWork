package Coffee;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите напиток");
        System.out.println("1 - Эспрессо");
        System.out.println("2 - Aмериканно");
        System.out.println("3 - Капучино");
        System.out.println("4 - Чай");
        int choice = sc.nextInt();
        sc.close();
        machinedOne machinedOne = new machinedOne();
        if (choice == 1)
            System.out.println("Вы выбрали эспрессо");
        else if (choice == 2)
            System.out.println("Вы выбрали американно: " + machinedOne.cof1(""));
        else if (choice == 3)
            System.out.println("Вы выбрали капучино: " + machinedOne.cof2(""));
        else if (choice == 4)
            System.out.println("Вы выбрали чай");
        else
            System.out.println("Не вереый выбор");

    }
}