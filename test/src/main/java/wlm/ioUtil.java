package wlm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class ioUtil {
    public static void main(String[] args) {
        String FromPath = "C:\\Users\\lenovo2\\Desktop\\业务影像化.postman_collection.json";
        String ToPath="";

        FromPath=RepalceSeparator(FromPath);
        ToPath=RepalceSeparator(ToPath);
        readFile(FromPath);
    }

    public static String RepalceSeparator(String s){
        return s.replace("\\", File.separator).replace("/", File.separator);
    }

    public static void test() {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);

        BufferedReader bReader = new BufferedReader(reader);
        try {
            System.out.println(bReader.read());
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static void readFile(String path) {
        File file = new File(path);
        FileReader fReader = null;
        try {
            fReader = new FileReader(file);
            char[] buf = new char[1024];
            int temp = 0;
            while ((temp = fReader.read(buf)) > 0) {
                System.out.print(new String(buf, 0, temp));
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void MoveFile(String FromPath, String ToPath) {
        File FromFile = new File(FromPath);
        File ToFile = new File(ToPath);
/*         FileInputStream fInputStream=null;
        FileOutputStream fOutputStream=null;
        try {
            fInputStream = new FileInputStream(FromFile);
            fOutputStream=new FileOutputStream(ToFile);

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } */
    }

}