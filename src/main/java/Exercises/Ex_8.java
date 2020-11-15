package Exercises;

import java.util.Scanner;

public class Ex_8 {
    public static void main(String[] args) {
        Logic l = new Logic();
        l.StringAndInt("String", 5);
    }
}

class Logic {

    int x;
    String text;

    void StringAndInt(String str, int y) {
        text = str;
        x = y;
        StringBuffer result = new StringBuffer();
        while (y > 0) {
            StringBuffer sb = new StringBuffer(text.substring(0, x));
            x--;
            y--;
            result.append(sb);
        }
        System.out.println(result);

    }
}
