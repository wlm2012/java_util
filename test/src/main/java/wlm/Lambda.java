package wlm;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambda {

    public static void test(String[] strings) {
        for (String string : strings) {

            System.out.println(string);
        }
    }

    public static void repeat() {
        repeat(10, () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello world");
        });
    }

    public static void repeat(int n, Runnable action) {
        for (int i = 0; i < n; i++) {
            action.run();
        }
    }

    public static void checkAndExecute(List<Person> list, Predicate<Person> Predicate, Consumer<Person> consumer) {
        for (Person person : list) {
            if (Predicate.test(person)) {
                consumer.accept(person);
            }
        }
    }

    public static void testCheck() {
        List<Person> pList = Arrays.asList(new Person("qq", 11), new Person("ww", 22));
        pList.stream().filter((p) -> {
            return p.getName().startsWith("q");
        }).forEach(p -> {
            System.out.println(p.getName());
        });

        checkAndExecute(pList, (p) -> {
            return p.getName().startsWith("q");
        }, p -> {
            System.out.println(p.getName());
        });
    }

}