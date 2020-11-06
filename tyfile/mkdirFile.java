package tySystem;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class mkdirFile {
    private String path = "init.txt";
    File file = new File(path);
    StringBuffer stringBuffer = new StringBuffer();


    public void mkdirfiles() throws IOException {
//        stringBuffer.append();
        if (file.exists()) {
            file.createNewFile();
        }else {


            FileOutputStream fileOutputStream = new FileOutputStream(file);
//            fileOutputStream.write("h");
            fileOutputStream.close();
        }


    }
}
