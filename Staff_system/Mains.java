package Final_exam;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Mains {
	static JLabel tpJLabel=new JLabel(new ImageIcon(Window.class.getResource("Tp.png")));
	public static void main(String [] args) {
		Window window=new Window(tpJLabel);
		window.Windows();
	}

}
