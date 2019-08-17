package L3;

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String result = "";

        while (!"end".equals(input)) {
            System.out.println("Введите ASCII код (end для вывода результата):");
            input = scanner.nextLine();
            if (!"end".equals(input)){
                int inputInt = Integer.parseInt(input, 8);
                result += (char) inputInt;

            }
        }
        System.out.println(result);
    }
}
