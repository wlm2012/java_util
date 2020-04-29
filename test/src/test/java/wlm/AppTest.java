package wlm;

import org.junit.jupiter.api.Test;

import wlm.stream.StreamTest;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        StreamTest.test3();
    }

    @Test
    public void name() {
        String s=null;
/*         if (s.equals("2")) {
            
        } */

        if ("condition".equals(s)) {
            System.out.println("pass");
        }else{
            System.out.println("no");
        }
    }
}
