package wlm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IoUtil {
    public static void main(String[] args) throws IOException {
        String FromPath = "C:\\Users\\lenovo2\\Desktop\\1\\4\\3\\1.txt";
        String ToPath = "C:\\Users\\lenovo2\\Desktop\\2\\1.txt";
        MoveFile(FromPath, ToPath);
        // readFile(FromPath);
    }

    // 根据系统自动修改斜杆和反斜杠
    public static String RepalceSeparator(String s) {
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

    public static String readFile(String path) throws IOException {
        path = RepalceSeparator(path);
        File file = new File(path);
        StringBuffer stringBuffer = new StringBuffer();
        try (FileReader fReader = new FileReader(file)) {

            char[] buf = new char[1024 * 10];
            int temp = 0;
            while ((temp = fReader.read(buf)) > 0) {
                stringBuffer.append(new String(buf, 0, temp));
            }
            return stringBuffer.toString();
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
            throw e;
        }
    }

    public static void writeFile(String path, String s) throws IOException {
        path = RepalceSeparator(path);
        File file = new File(path);
        if (!file.exists()) {
            creatFile(path);
        }
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write(s);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void MoveFile(String FromPath, String ToPath) throws IOException {
        FromPath = RepalceSeparator(FromPath);
        ToPath = RepalceSeparator(ToPath);
        byte[] buf = new byte[1024];
        try (FileInputStream fInputStream = new FileInputStream(FromPath);
                FileOutputStream fOutputStream = new FileOutputStream(ToPath)) {
            int length = 0;
            while ((length = fInputStream.read(buf)) > 0) {
                fOutputStream.write(buf, 0, length);
            }
        } catch (IOException e) {
            throw e;
        }
    }

    /**
     * 通过改变文件路径来移动文件
     *
     * @param fromPath 源路径+文件名
     * @param toPath   新路径（没有文件名）
     * @throws Exception
     */

    public static boolean changeFilePath(String fromPath, String toPath) {

        toPath = toPath + "\\";
        File fromfile = new File(RepalceSeparator(fromPath));
        File tofile = new File(RepalceSeparator(toPath) + fromfile.getName());
        return fromfile.renameTo(tofile);

    }

    public static boolean creatFolder(String folderPath) {

        File filePath = new File(folderPath);
        if (!filePath.exists()) {
            return filePath.mkdirs();
        } else {
            return true;
        }
    }

    public static boolean creatFileOnly(String filePath) throws IOException {

        File fileName = new File(filePath);
        if (!fileName.exists()) {
            return fileName.createNewFile();
        } else {
            return true;
        }
    }

    public static boolean delFile(String filePath) {

        File file = new File(filePath);
        if (file.delete()) {
            return true;
        } else {
            return false;
        }
    }

    public static void creatFile(String filePath) throws IOException {

        if (filePath.lastIndexOf(File.separator) < 0) {
            throw new IOException("文件路径不正确");
        }
        String FolderPath = filePath.substring(0, filePath.lastIndexOf(File.separator));
        File Folder = new File(FolderPath);
        if (Folder.exists()) {
            creatFileOnly(filePath);
        } else {
            creatFolder(FolderPath);
            creatFileOnly(filePath);
        }
    }

}
