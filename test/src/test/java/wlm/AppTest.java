package wlm;

import java.util.ServiceLoader;

import org.junit.jupiter.api.Test;

import wlm.innerclass.OutClass;
import wlm.proxy.PayService;
import wlm.proxy.pay;
import wlm.stream.StreamTest;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */

     @Test
     public void serviceLoader() {
         ServiceLoader<pay> pays=ServiceLoader.load(pay.class);
         for (pay pay : pays) {
             pay.print();
         }
        //  pays.stream().forEach(s->{});
        
     }

    @Test
    public void shouldAnswerWithTrue() {
        StreamTest.test3();
    }

    @Test
    public void name() {
        String s = null;
        /*
         * if (s.equals("2")) {
         * 
         * }
         */

        if ("condition".equals(s)) {
            System.out.println("pass");
        } else {
            System.out.println("no");
        }
    }

    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        OutClass.Inner inner = outClass.new Inner();
        System.out.println(inner);
    }
}
