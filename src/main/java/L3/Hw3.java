package L3;

import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        System.out.println("Операции над double/float");
        System.out.println("1. Сравнить");
        System.out.println("2. Округлить");
        System.out.println("3. Отбросить остаток");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        System.out.println("Введите первое число:");
        String number1 = scanner.nextLine();
        System.out.println("Введите второе число:");
        String number2 = scanner.nextLine();
        float number1Float = Float.parseFloat(number1);
        float number2Float = Float.parseFloat(number2);

        switch (type){
            case "1":
                float result = number1Float - number2Float;

                if(result == 0){
                    System.out.println("Числа равны");
                } else if(result > 0){
                    System.out.println("Первое число больше");
                } else {
                    System.out.println("Второе число больше");
                }
                break;

            case "2":
                System.out.println(Math.round(number1Float));
                System.out.println(Math.round(number2Float));
                break;

            case "3":
                System.out.println((long) number1Float);
                System.out.println((long) number2Float);
                break;
        }


    }
}
