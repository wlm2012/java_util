package wlm;

import java.util.ArrayList;

public class Test {

    ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {

        try {
            IoUtil.changeFilePath("C:\\Users\\lenovo2\\Desktop\\1\\0.json", "C:\\Users\\lenovo2\\Desktop\\2");
        } catch (Exception e) {
            e.printStackTrace();
        }

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