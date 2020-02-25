package wlm.innerclass;

public class test {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		OutClass.Inner inner = outClass.new Inner();
	}
}
