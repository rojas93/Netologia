package L4;

import java.util.Scanner;

public class Hw3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите формулу:");
        String formula = scanner.nextLine();
        boolean result = isFormulaValid(formula);
        if(result){
            System.out.println("Формула корректна");
        } else {
            System.out.println("Формула некорректна");
        }
    }

    public static boolean isFormulaValid (String input){
        int counter = 0;
        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if (c == '(') {
                counter++;
            } else if (c == ')') {
                counter--;
            }
        }
        return counter == 0;
    }
}
