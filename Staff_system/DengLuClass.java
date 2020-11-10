package Final_exam;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class DengLuClass {
	JFrame Fs = new JFrame("员工管理系统"); // 第二个窗口

	private JPanel mainpanel = new JPanel(); // 主面板
	private JPanel titlePanel = new JPanel(); // 标题面板
	private JLabel weicome = new JLabel("欢迎使用本系统");

	private JPanel cPanel = new JPanel();// 最上面板
	private JPanel left = new JPanel();// 左面板
	private JPanel zhong = new JPanel();// 卡片布局面板
	private JPanel DisplayPanel = new JPanel();// 显示数据界面
	private JPanel mainOperationalPanel = new JPanel();// 操作数据界面

	private JButton OperationalData = new JButton("操作数据");
	private JButton DisplayData = new JButton("显示数据");
	JLabel gJLabel=new JLabel(new ImageIcon(Window.class.getResource("zb.png")));
	JLabel biaoti=new JLabel(new ImageIcon(Window.class.getResource("bts.png")));

	private CardLayout cardLayouts = new CardLayout();

	private static ArrayList<Dates> list = new ArrayList<Dates>();

	RefreshClass refreshClass = new RefreshClass( DisplayPanel, list);
	FileReadWrite fileReadWrite = new FileReadWrite();
	OperationalDataClass operationalDataClass = new OperationalDataClass(mainOperationalPanel);

	public static ArrayList<Dates> getList() {
		return list;
	}

	public DengLuClass() {
		Image icon = Toolkit.getDefaultToolkit().getImage(Window.class.getResource("T.png"));
		Fs.setIconImage(icon);
		new Thread(fileReadWrite).start();
		intis();
		addComponent();
		ComponentInits();
		ButtonActionListener();
		operationalDataClass.OperationalDataClassMain();
		refreshClass.xingshuafanga();
		
		
		gJLabel.setBounds(0,0,290,900);
		left.add(gJLabel);
		
	}

	private void intis() {
		Fs.setSize(1200, 800);
		Fs.setLocationRelativeTo(null);
		Fs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Fs.setVisible(true);

	}

	private void addComponent() {
		Fs.setLayout(new BorderLayout());
		mainpanel.setLayout(new BorderLayout());
		titlePanel.setLayout(new BorderLayout());
		cPanel.setLayout(new BorderLayout());
		mainOperationalPanel.setLayout(new BorderLayout());

		Fs.add(mainpanel, BorderLayout.CENTER);
		mainpanel.add(titlePanel, BorderLayout.NORTH);
		
		titlePanel.add(biaoti, BorderLayout.CENTER);

		mainpanel.add(cPanel, BorderLayout.CENTER);
		cPanel.add(left, BorderLayout.WEST);
		left.add(OperationalData);
		left.add(DisplayData);

		cPanel.add(zhong, BorderLayout.CENTER);
		zhong.setLayout(cardLayouts);
		zhong.add(DisplayPanel, "xiangShi");
		zhong.add(mainOperationalPanel, "chaoZuo");
		
	}

	private void ComponentInits() {
		titlePanel.setPreferredSize(new Dimension(0, 100));

		weicome.setFont(new java.awt.Font("宋体", 1, 40));
		weicome.setForeground(Color.PINK);
		weicome.setHorizontalAlignment(SwingConstants.CENTER);
		weicome.setVerticalAlignment(SwingConstants.CENTER);

		left.setPreferredSize(new Dimension(250, 0));
		left.setLayout(null);
		int x = 80;
		int y = 150;
		DisplayData.setBounds(x, y, 90, 30);
		OperationalData.setBounds(x, y + 50, 90, 30);

	}

	private void ButtonActionListener() {
		OperationalData.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayouts.show(zhong, "chaoZuo");
			}
		});
		DisplayData.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayouts.show(zhong, "xiangShi");
				refreshClass.xingshuafanga();
			}
		});

	}
}
