package wlm;



public class Lambda {

    public static void main(final String[] args) {

        repeat(100, () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello world");
        });

    }

    public static void test(String[] strings)  {
        for (String string : strings) {

            System.out.println(string);
        }
    }

    public static void repeat(int n, Runnable action) {
        for (int i = 0; i < n; i++) {
            action.run();
        }
    }


}