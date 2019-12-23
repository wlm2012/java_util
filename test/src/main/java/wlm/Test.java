package wlm;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Test {

    ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        String[] ss = { "11", "22" };
        for (String s : ss) {
            System.out.println(s);
        }

    }

    public static LocalDate parseLocalDate(String s) {
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.parse(s, dtf);
            return localDate;
        } catch (Exception e) {
            throw e;
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

    public static void test1() {
        Object d = null;
        String s = (String) d;
        System.out.println(s);
    }

}