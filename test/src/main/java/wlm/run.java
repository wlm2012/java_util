package wlm;

/**
 * run
 */
public class run {

    public static void main(String[] args) {
        test1();
    }

    //多线程例子
    public static void test() {
        Runnable run = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("i=" + i);
            }
        };
        Thread thread = new Thread(run);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    //捕获多线程中的错误
    public static void test1() {
        Runnable run = () -> {
            int a = 1 / 0;
            System.out.println(a);
        };

        Thread thread = new Thread(run);
        thread.setUncaughtExceptionHandler(new MyCrashHandler());
        thread.start();
    }

    
}