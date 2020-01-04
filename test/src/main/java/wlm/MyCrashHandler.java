package wlm;

import java.lang.Thread.UncaughtExceptionHandler;

/**
 * MyCrashHandler
 */
public class MyCrashHandler implements UncaughtExceptionHandler{


    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(e.getMessage());
        System.out.println(e);


    }
    
}