package com.bsu.by;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class MainTest {

    @Test
    public void createSetLatter() {
        List<Integer> setLetterExpected1 = Arrays.asList(97, 118, 120);
        List<String> text1 = Arrays.asList("axv", "xva");
        List<Integer> setLetterActual1 = Main.createSetLatter(text1);
        Assert.assertEquals(setLetterExpected1, setLetterActual1);

        List<Integer> setLetterExpected2 = Arrays.asList(97, 99, 100, 102, 115, 118, 120, 122);
        List<String> text2 = Arrays.asList("ASDFf", "zxcvVc");
        List<Integer> setLetterActual2 = Main.createSetLatter(text2);
        Assert.assertEquals(setLetterExpected2, setLetterActual2);
    }
}
