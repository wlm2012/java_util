package wlm.reflect;

import wlm.entity.Person;
import wlm.enumtest.EnumTest;

import java.util.Arrays;

/**
 * ReflectTest
 */
public class ReflectTest {

    public static void main(String[] args) {
        test1();
    }

    public static void test() {
        Class<EnumTest> class1 = EnumTest.class;
        String name = class1.getName();
        System.out.println(name);
    }

    public static void test1() {
        Person person = new Person();
        System.out.println(person.getClass());
        System.out.println(Person.class);
        System.out.println(Arrays.toString(Person.class.getConstructors()));
    }

    public static void test2(){

    }
}