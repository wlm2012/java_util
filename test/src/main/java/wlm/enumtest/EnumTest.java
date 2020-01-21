package wlm.enumtest;

import java.util.Scanner;

public class EnumTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("small, medium, large");
        String input = in.next();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("string=" + Size.small.toString());
        System.out.println("size=" + size);
        System.out.println("ab=" + size.getAd());
        in.close();
    }
/*  input:   small
    output:
    string=small
    size=small
    ab=s
    
    */


}

enum Size {
    small("s"), medium("m"), large("l");

    private Size(String ad) {
        this.ad = ad;
    }

    private String ad;

    public String getAd() {
        return ad;
    }
}