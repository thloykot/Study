package com.company;

import org.apache.commons.lang3.math.NumberUtils;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(NumberUtils.LONG_ONE);
        System.out.println(NumberUtils.SHORT_MINUS_ONE);
        int[] l;
        l = new int[]{1, 4, 6, 4, 3, 6, 4, 4, 3, 2,25};
        System.out.println(NumberUtils.max(l));
    }
}
