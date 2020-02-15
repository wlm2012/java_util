package wlm.reflect;

import wlm.entity.Person;
import wlm.enumtest.EnumTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * ReflectTest
 */
public class ReflectTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        testMethod();
    }

    public static void test() {
        Class<EnumTest> class1 = EnumTest.class;
        String name = class1.getName();
        System.out.println(name);
    }

    public static void testClass() {
        Person person = new Person();
        System.out.println(person.getClass());
        System.out.println(Person.class);
        System.out.println(Arrays.toString(Person.class.getConstructors()));
    }

    public static void testConstructor() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c1 = Class.forName("wlm.entity.Person");
//      Person person=(Person) c1.getConstructor().newInstance();
        Person person = (Person) c1.getConstructor(String.class, int.class).newInstance("wlm", 11);
        String name = person.getName();
        System.out.println(name);
        System.out.println(person.getOld());
        person.printName();

    }

    public static void testMethod() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c1 = Class.forName("wlm.entity.Person");
        Object person = c1.getConstructor().newInstance();
        Method method = c1.getMethod("printYear", String.class);
        method.invoke(person, "2020");


    }
}