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


public class IoUtil {
    public static void main(String[] args) {
        String FromPath = "C:\\Users\\lenovo2\\Desktop\\业务影像化.postman_collection.json";
        String ToPath="";

        FromPath=RepalceSeparator(FromPath);
        ToPath=RepalceSeparator(ToPath);
        readFile(FromPath);
    }

    //根据系统自动修改斜杆和反斜杠
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
        FileInputStream fInputStream = null;
        FileOutputStream fOutputStream = null;
        byte[] buf=new byte[1024]; 
        try {
            fInputStream = new FileInputStream(FromFile);
            fOutputStream = new FileOutputStream(ToFile);
            int length=0;
            while(fInputStream.available()>0){

            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


   /**
    * 通过转化文件路径来移动文件
    * @param fromPath  源路径+文件名
    * @param toPath   新路径（没有文件名）
    */

    public static void changeFilePath(String fromPath,String toPath) {
        toPath=toPath+"\\";
        File fromfile=new File(RepalceSeparator(fromPath));
        File tofile=new File(RepalceSeparator(toPath)+fromfile.getName());
        fromfile.renameTo(tofile);
    }

}