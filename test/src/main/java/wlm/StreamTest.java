package wlm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * StreamTest
 */
public class StreamTest {


    public static void test() {
        String[] s = { "ww3", "qq", "ee" };
        List<String> words = new ArrayList<>();
        words = Arrays.asList(s);
        long num=words.stream().filter(w -> w.length()>2).count();
        System.out.println(num);
    }

    
}