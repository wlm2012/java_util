package wlm;

import java.util.Arrays;

public class Lambda {


    public static void main(final String[] args) {
        String[] strings={"qqq","ww","11"};
        test(strings);
        Arrays.sort(strings,String::compareToIgnoreCase);
        test(strings);

    }

    public static void  test(String[] strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }
}