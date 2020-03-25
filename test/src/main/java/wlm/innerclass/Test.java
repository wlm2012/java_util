package wlm.innerclass;

/**
 * @author lenovo2
 */
public class Test {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		OutClass.Inner inner = outClass.new Inner();
	}
}
