package wlm.reflect;

import wlm.entity.Person;
import wlm.enumtest.EnumTest;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * ReflectTest
 */
public class ReflectTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        testConstructor();
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

    public static void testConstructor() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c1=Class.forName("wlm.entity.Person");
//      Person person=(Person) c1.getConstructor().newInstance();
        Person person=(Person) c1.getConstructor(String.class,int.class).newInstance("wlm",11);
        String name=person.getName();
        System.out.println(name);
        System.out.println(person.getOld());
        person.printName();
    }
}