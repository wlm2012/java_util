package wlm.concurrency;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author wlm
 */
public class Atomic {

    public static AtomicLong atomicLong=new AtomicLong();

    public static void main(String[] args){
        Runnable runnable=()->{};
    }

    public static void atomicAndIncrement(){
        atomicLong.getAndIncrement();
    }
}
