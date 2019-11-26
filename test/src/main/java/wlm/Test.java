package wlm;

import java.util.ArrayList;

public class Test {

    ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        String str="xxx.png";
        String[] s=str.split("\\.");
        System.out.println(s[1]);

    }

    public void name() {
        ListTest listTest = new ListTest();

        list.add("e");
        listTest.list = list;
        listTest.test2();
        for (String s : list) {
            System.out.println(s);

        }
    }
}