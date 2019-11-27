package wlm;

import java.util.ArrayList;

public class Test {

    ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        IoUtil.changeFilePath("C:\\Users\\lenovo2\\Desktop\\1\\1.json","C:\\Users\\lenovo2\\Desktop\\2");

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