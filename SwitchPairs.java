package homeworkInet.switchPairs;

import java.util.Scanner;

public class SwitchPairs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое слово или фразу");
        String word = scanner.nextLine();
        switchPairs(word);

    }

    private static String switchPairs(String word) {
        if (word.length() % 2 == 0) {
            SwitchPairsEven even = new SwitchPairsEven();

        } else {
            SwitchPairsNotEven notEven = new SwitchPairsNotEven();
        }
        return word;
    }
}
