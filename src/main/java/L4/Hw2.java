package L4;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String input = scanner.nextLine();
        input = input.trim();
        input = input.replaceAll(" +", " ");
        System.out.println("Пробелы удалены:");
        System.out.println(input);



    }
}
