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
    public static void main(String[] args) {
        String FromPath = "C:\\Users\\lenovo2\\Desktop\\业务影像化.postman_collection.json";
        String ToPath = "";

        FromPath = RepalceSeparator(FromPath);
        ToPath = RepalceSeparator(ToPath);
        readFile(FromPath);
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
        FileReader fReader = null;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            fReader = new FileReader(file);
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
        } finally {
            fReader.close();
        }
    }

    public static void writeFile(String path, String s) throws Exception {
        path = RepalceSeparator(path);
        File file = new File(path);
        if (!file.exists()) {
            creatFile(path);
        }
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(s);

        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } finally {
            fileWriter.close();
        }
    }

    public static void MoveFile(String FromPath, String ToPath) {
        FromPath = RepalceSeparator(FromPath);
        ToPath = RepalceSeparator(ToPath);
        File FromFile = new File(FromPath);
        File ToFile = new File(ToPath);
        FileInputStream fInputStream = null;
        FileOutputStream fOutputStream = null;
        byte[] buf = new byte[1024];
        try {
            fInputStream = new FileInputStream(FromFile);
            fOutputStream = new FileOutputStream(ToFile);
            int length = 0;
            while (fInputStream.available() > 0) {

            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 通过改变文件路径来移动文件
     * 
     * @param fromPath 源路径+文件名
     * @param toPath   新路径（没有文件名）
     * @throws Exception
     */

    public static void changeFilePath(String fromPath, String toPath) throws Exception {
        try {
            toPath = toPath + "\\";
            File fromfile = new File(RepalceSeparator(fromPath));
            File tofile = new File(RepalceSeparator(toPath) + fromfile.getName());

            if (fromfile.renameTo(tofile)) {
                // System.out.println("移动成功");
                // do nothing
            } else {
                throw new Exception("文件移动失败");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public static void creatFolder(String folderPath) throws Exception {
        try {
            File filePath = new File(folderPath);
            if (!filePath.exists()) {
                if (filePath.mkdirs()) {
                } else {
                    throw new Exception("新建文件夹失败");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public static void creatFileOnly(String filePath) throws Exception {
        try {
            File fileName = new File(filePath);
            if (!fileName.exists()) {
                if (fileName.createNewFile()) {
                } else {
                    throw new Exception("新建文件失败");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public static void delFile(String filePath) throws Exception {
        try {
            File file = new File(filePath);
            if (file.delete()) {

            } else {
                throw new Exception("删除文件失败");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public static void creatFile(String filePath) throws Exception {
        try {
            if (filePath.lastIndexOf(File.separator) < 0) {
                throw new Exception("文件路径不正确");
            }
            String FolderPath = filePath.substring(0, filePath.lastIndexOf(File.separator));
            File Folder = new File(FolderPath);
            if (Folder.exists()) {
                creatFileOnly(filePath);
            } else {
                creatFolder(FolderPath);
                creatFileOnly(filePath);
            }
        } catch (Exception e) {
            throw e;
        }
    }

}
