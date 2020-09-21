package com.bsu.by;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            List<String> inputText = new ArrayList<>();
            String nextLineText = sc.nextLine();
            while (!nextLineText.isEmpty()) {
                inputText.add(nextLineText);
                nextLineText = sc.nextLine();
            }

            Set<Character> setLetter = createSetLetter(inputText);
            System.out.println(setLetter);
        }
    }

    static Set<Character> createSetLetter(List<String> text) {
        Set<Character> setLetter = new HashSet<>();
        char[] copyLine;
        int numLetter;
        for (String i : text) {
            copyLine = i.toLowerCase().toCharArray();
            for (char j : copyLine) {
                numLetter = j;
                if (numLetter >= 91 && numLetter <= 122) {
                    setLetter.add(j);
                }
            }
        }
        return setLetter;
    }
}
