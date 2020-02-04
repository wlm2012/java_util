package wlm.reflect;

import wlm.enumtest.EnumTest;

/**
 * ReflectTest
 */
public class ReflectTest {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Class<EnumTest> class1 = EnumTest.class;
        String name = class1.getName();
        System.out.println(name);
    }

    public static void test1() {

    }
}