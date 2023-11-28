package ru;

import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int DOR = 3, NUMBERS = 1000;

        int choice, attempt, answer, win = 0, lose = 0;
        HashMap<Integer, Boolean> result = new HashMap<>();
        Random r = new Random();

        for(attempt = 1; attempt <= NUMBERS; attempt++){
            answer = r.nextInt(DOR) + 1;
            choice = r.nextInt(DOR) + 1;

            if (answer != choice) {
                win++;
                result.put(attempt, true);
            } else {
                lose++;
                result.put(attempt, false);
            }
        }

        System.out.printf("Количество побед - %d" +
                "\nКоличетво поражений - %d" +
                "\nСтатистика побед - %.0f%%", win, lose, (Double.valueOf(win) / NUMBERS * 100));
    }
}