package VaribleExample;

import java.util.Arrays;

public class Variable {
    public static void main(String[] args) {
        int i = 10;
        float f = 20.5f;
        double d = 20.5;
        boolean b = true;
        char c = 'a';
        String s = "Hà Nội";

        for (String s1 : Arrays.asList("i = " + i, "f = " + f, "d = " + d, "b = " + b, "c = " + c, "s = " + s)) {
            System.out.println(s1);
        }
    }
}
