package com.bsu.by;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;


public class MainTest {

    @Test
    public void createSetLetter1() {//
        Set<Character> setLetterExpected1 = Set.of('a', 'v', 'x');
        List<String> text1 = Arrays.asList("axv", "xva");
        Set<Character> setLetterActual1 = Main.createSetLetter(text1);
        Assert.assertEquals(setLetterExpected1, setLetterActual1);
    }

    @Test
    public void createSetLetter2() {//
        Set<Character> setLetterExpected1 = Set.of('a', 's', 'c', 'd', 'f', 'v', 'x', 'z');
        List<String> text1 = Arrays.asList("ASDFf", "zxcvVc");
        Set<Character> setLetterActual1 = Main.createSetLetter(text1);
        Assert.assertEquals(setLetterExpected1, setLetterActual1);
    }
}
