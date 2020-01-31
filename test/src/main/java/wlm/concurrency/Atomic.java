package wlm.concurrency;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

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
        atomicLong.incrementAndGet();

    }

    public static void longAdder(){
        var addr=new LongAdder();

    }
}
