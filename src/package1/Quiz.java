package package1;

import java.util.Random;
import java.util.Scanner;

public class Quiz {

    private final String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli",
            "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
            "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    private String word;
    private int attempt;
    private Scanner scan;

    public void start() {
        System.out.println("This is quiz.\nYou have 10 attempts to guess word.\n(It's food)");
        scan = new Scanner(System.in);
        word = words[(new Random()).nextInt(24)];
        //------------------------------------------------------------------------------------------
        System.out.println("Development [" + word + "]");
        //------------------------------------------------------------------------------------------
        controller();
    }

    private void controller() {

        int position = compareAnswer(getUserInput());

        if (attempt >= 10 && position > -1) {
            scan.close();
            System.out.println("You used 10 attempts and lost.");
        } else if (position == -1) {
            scan.close();
            System.out.println("WIN!");
        } else {
            outputHint(position);
        }
    }

    private String getUserInput() {
        attempt++;
        System.out.println("What is your answer?");
        return scan.next();
    }

    private void outputHint(int position) {
        StringBuffer sb = new StringBuffer(word.substring(0, position));
        for (int i = sb.length(); i < 15; i++) {
            sb.append('#');
        }
        System.out.println(sb.toString());
        controller();
    }

    private int compareAnswer(String str) {
        if (str.length() < word.length()) {
            StringBuffer sb = new StringBuffer(str);
            sb.append("*".repeat(10));
            str = sb.toString();
        }

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == str.charAt(i)) {
                continue;
            } else {
                return i;
            }
        }
        return -1;
    }

}
