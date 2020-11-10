 package Final_exam;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Window {
	JFrame JF = new JFrame("Ô±¹¤¹ÜÀíÏµÍ³µÇÂ½");
	JPanel BeiMian = new JPanel();
	JLabel ZhangHao = new JLabel("ÕËºÅ:");
	JLabel MiMa = new JLabel("ÃÜÂë:");
	JTextField zHTextField = new JTextField(20);
	JPasswordField mimaPassword = new JPasswordField(20);
	JButton dennglu = new JButton("µÇÂ½");
	JButton zhuce = new JButton("×¢²á");
	Image icon = Toolkit.getDefaultToolkit().getImage(Window.class.getResource("T.png"));
	JLabel tpJLabel;

	public void Windows() {
		JF.setIconImage(icon);
		init();
		AddComponent();
		ComponentInit();
		zhengluButton();

	}

	public Window(JLabel tpJLabel) {
		// TODO Auto-generated constructor stub
		this.tpJLabel = tpJLabel;
	}

	private void init() {
		JF.setSize(450, 580);
		JF.setLocationRelativeTo(null);
		JF.setVisible(true);
		JF.setResizable(false);
		JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void ComponentInit() {
		BeiMian.setLayout(null);
		int x = 130;
		int y = 150;
		int w = 60;
		int h = 30;

		ZhangHao.setBounds(x-10, y, w, h + 20);
		MiMa.setBounds(x-10, y + 40, w, h + 20);
		zhuce.setBounds(x + 100, y + 130, w + 10, h);
		dennglu.setBounds(x + 15, y + 130, w + 10, h);
		zHTextField.setBounds(x + 20, y + 10, w + 100, h);
		mimaPassword.setBounds(x + 20, y + 50, w + 100, h);
		tpJLabel.setBounds(0, 0, 450, 580);
	}

	private void AddComponent() {
		JF.add(BeiMian, BorderLayout.CENTER);

		BeiMian.add(ZhangHao);
		BeiMian.add(MiMa);
		BeiMian.add(zHTextField);
		BeiMian.add(mimaPassword);
		BeiMian.add(dennglu);
		BeiMian.add(zhuce);
		BeiMian.add(tpJLabel);
	}

	private void zhengluButton() {
		dennglu.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				if (zHTextField.getText().equals("1314520") && mimaPassword.getText().equals("123456")) {
					JF.setVisible(false);
					new DengLuClass();

				}
			}
		});
	}

}
