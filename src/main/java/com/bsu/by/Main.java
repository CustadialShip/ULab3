package com.bsu.by;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> inputText = new ArrayList<>();
        String nextLineText = sc.nextLine();
        while (!nextLineText.isEmpty()) {
            inputText.add(nextLineText);
            nextLineText = sc.nextLine();
        }

        List<Integer> setLetter = createSetLatter(inputText);
        printText(inputText);

        printSetLetter(setLetter);
    }

    static void printText(List<String> text) {
        for (String i : text) {
            System.out.println(i);
        }
    }

    static List<Integer> createSetLatter(List<String> text) {
        List<Integer> setLetter = new ArrayList<>();

        char[] copyLine;
        int numLetter;
        for (String i : text) {
            copyLine = i.toCharArray();
            for (char j : copyLine) {
                numLetter = j;
                if (!(setLetter.contains(numLetter + 32)) &&
                        !(setLetter.contains(numLetter)) &&
                        numLetter >= 65 &&
                        numLetter <= 90) {
                    setLetter.add(numLetter + 32);
                } else if (!(setLetter.contains(numLetter)) && numLetter >= 91 && numLetter <= 122) {
                    setLetter.add(numLetter);
                }
            }
        }
        Collections.sort(setLetter);
        return setLetter;
    }

    static void printSetLetter(List<Integer> setLetter) {
        for (Integer i : setLetter) {
            System.out.print((char) i.intValue() + " ");
        }
    }
}
