package wlm;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.ArrayList;

public class Test {

    ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        try {
            System.out.println(parseLocalDate("2019-11-02"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static LocalDate parseLocalDate(String s) {
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd").withResolverStyle(ResolverStyle.STRICT);
            LocalDate localDate = LocalDate.parse(s, dtf);
            return localDate;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
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