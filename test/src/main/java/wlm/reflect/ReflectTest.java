package wlm.reflect;

import wlm.entity.Person;
import wlm.enumtest.EnumTest;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * ReflectTest
 *
 * @author wlm
 */
public class ReflectTest {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException {
//		Class c1 = Class.forName("wlm.entity.Person");
		setAndGetField();
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

	public static void ResourceTest() throws ClassNotFoundException, IOException {
		Class c1 = Class.forName("wlm.entity.Person");
		//create 1.txt under Person.class fold for test
		System.out.println(c1.getResource("1.txt"));
		InputStream inputStream = c1.getResourceAsStream("1.txt");
		StringBuffer stringBuffer = new StringBuffer();
		byte[] buf = new byte[1024 * 10];
		int temp;
		while ((temp = inputStream.read(buf)) > 0) {
			stringBuffer.append(new String(buf, 0, temp));
		}
		System.out.println(stringBuffer);

	}

	public static void printField(Class c1) {
		Field[] fields = c1.getDeclaredFields();
		for (Field field : fields) {
			String modifier = Modifier.toString(c1.getModifiers());
			if (modifier.length() > 0) {
				System.out.print(modifier + "   ");
			}
			System.out.println(field.getType().getName() + "   " + field.getName());
		}
	}

	public static void setAndGetField() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		Class c1 = Class.forName("wlm.entity.Person");
		var harry =(Person)c1.getConstructor(String.class, int.class, String.class).newInstance("Harry", 14, "1");
		Field[] fields=c1.getDeclaredFields();
		for (Field field:fields){
			field.setAccessible(true);
			Object s=field.get(harry);
			System.out.println(s);
		}

	}

}