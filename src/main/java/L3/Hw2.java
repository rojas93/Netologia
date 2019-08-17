package L3;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        System.out.println("Из какой системы в какую переводим?");
        System.out.println("1. 16 -> 10");
        System.out.println("2. 8 -> 10");
        System.out.println("3. 2 -> 10");
        System.out.println("4. 10 -> 16");
        System.out.println("5. 10 -> 8");
        System.out.println("6. 10 -> 2");
        System.out.println("Выберите и нажмите ввод:");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        System.out.println("Введите число для перевода:");
        String number = scanner.nextLine();

        switch (type){
            case "1":
                System.out.println(Integer.parseInt(number, 16));
                break;
            case "2":
                System.out.println(Integer.parseInt(number, 8));
                break;
            case "3":
                System.out.println(Integer.parseInt(number, 2));
                break;
            case "4":
                System.out.println(Integer.toHexString(Integer.parseInt(number)));
                break;
            case "5":
                System.out.println(Integer.toOctalString(Integer.parseInt(number)));
                break;
            case "6":
                System.out.println(Integer.toBinaryString(Integer.parseInt(number)));
                break;
        }
    }
}
