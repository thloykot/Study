package com.company;
import org.apache.commons.lang3.math.NumberUtils;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(NumberUtils.LONG_ZERO);
        System.out.println(NumberUtils.INTEGER_ZERO);
        int[] i  = {4,6,36,31,5423,765};
        System.out.println(NumberUtils.max(i));

    }
}
