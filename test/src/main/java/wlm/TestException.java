package wlm;




public class TestException {


    public static void testEx1() {
        try {
             int a=1/0;

        } catch (Exception e) {
            System.out.println("test");
            // throw e;
            // throw new IOException();
        }
    }

    public static void main(String[] args) {
        
        try {
            testEx1();
            System.out.println("1");
        } catch (Exception e) {
            System.out.println("main");
            e.printStackTrace();
        }
    }
}