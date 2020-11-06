package tySystem;

import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Main {
//	static JLabel tpJLabel=new JLabel(new ImageIcon(Window.class.getResource("gsd.png")));
	static JLabel tpJLabel=new JLabel();
    public static void main(String[] args) throws IOException {
        Window window = new Window(tpJLabel);
        mkdirFile mkdirFile =new mkdirFile();
        mkdirFile.mkdirfiles();
        window.windows();
    }
}
