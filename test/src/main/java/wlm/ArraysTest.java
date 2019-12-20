package wlm;

import java.util.ArrayList;
import java.util.List;

public class ArraysTest {
    public static void arraysize() {
        List<String> list = new ArrayList<>(100);
        System.out.println(list.size());
        list.add("e");
        System.out.println(list.size());
    }

    public static void arrayAdd() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("c");
        list.add(2, "b");
        for (String s : list) {
            System.out.println(s);
        }
    }
}