package tySystem;

import javax.swing.*;

import tySystem.Window;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DengLu_Class {
	private JPanel jPanel;
	private JFrame jFrame;
	private JPanel jPenel_west = new JPanel();
	private JPanel user_heads = new JPanel();
	private JPanel user_text = new JPanel();
	private static JLabel tpJLabel = new JLabel("头像");
//	private static JLabel tpJLabel = new JLabel(new ImageIcon(Window.class.getResource("y.png")));
//	Image icon = Toolkit.getDefaultToolkit().getImage(Window.class.getResource("gfh.png"));
	private JLabel tishi = new JLabel("管理员资料");
	private String name = "name";
	private String zhanghao = "218003697";
	private String dianhua = "183858*****";
	private String youxiang = "2830375486";

	private JTextArea user_data = new JTextArea();
	Font x = new Font("Serif", 1, 12);
	private JLabel editor = new JLabel("编辑");
	private JButton button_editor = new JButton("");
	private JLabel cherish = new JLabel(" 珍惜");
	private JLabel time = new JLabel(" 时间");
	private JTextArea time_According = new JTextArea();

	private JButton Home_page = new JButton("首 页");
	private JButton out_Bound = new JButton("出库");
	private JButton in_Bound = new JButton("入库");
	private JButton Enter_the_user = new JButton("录入用户");
	private JButton delete_Bound = new JButton("管理图书");
	private JButton system_set = new JButton("系统设置");
	private JPanel Display_panel = new JPanel();

	JSplitPane jSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true);// 设定为左右拆分布局
	Based_Panel instantiation = new Based_Panel(Display_panel);
	Out_Bound out_bound = new Out_Bound(Display_panel);
	In_Bounds in_bound_main = new In_Bounds(Display_panel);
	Enter_User enter_user = new Enter_User(Display_panel);
	Delete_Bound delete_bound = new Delete_Bound(Display_panel);
	System_Butoot system_butoot = new System_Butoot(Display_panel);
	
	private static JLabel ff = new JLabel(new ImageIcon(DengLu_Class.class.getResource("b.png")));

	public DengLu_Class(JFrame jFrame, JPanel jPanel) {
		this.jFrame = jFrame;
		this.jPanel = jPanel;

	}

	public void mains() {
		redraw();
		get_jPanel_main();

	}

	private void redraw() {
		jFrame.setSize(1500, 900);// 设置显示窗口大小
		jFrame.setLocation(200, 50);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 默认单机点关闭窗口
		jFrame.setResizable(true);// 设置窗口不可变大小贴用
		jFrame.setVisible(true);// 设置窗口为可见的
		jPanel.setBackground(Color.YELLOW);
		jPanel.setLayout(null);

		jPanel.add(jSplitPane);
		jSplitPane.setBounds(0, 0,1920,1080);
		
		jPanel.add(ff);
		ff.setBounds(0, 0, 1950, 1097);
		

		
	
		
		
	}

	private void get_jPanel_main() {

		add_set_jSplitPane();

		 get_Based_Panel();
		jSplitPane.setEnabled(false);

		jSplitPane.setOneTouchExpandable(true);// 让分割线显示出箭头

		jPenel_west.setLayout(null);

		addsetOpaque();
		add_jPenel_west_up();
		add_right_jPanel();
		Add_operation();
		add_JButoon_Listening();
		

	}

	private void add_right_jPanel() {
		Display_panel.setBackground(Color.red);
		Display_panel.setOpaque(false);
		jSplitPane.setRightComponent(Display_panel);
		Display_panel.removeAll();
		instantiation.addJpanel();
		
	}

	private void add_JButoon_Listening() {
		Home_page.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				get_Based_Panel();
				
				
			}
		});

		out_Bound.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Display_panel.removeAll();
				out_bound.mains();
			}
		});
		in_Bound.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Display_panel.removeAll();
				in_bound_main.mains();
			}
		});
		Enter_the_user.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Display_panel.removeAll();
				enter_user.mains();
			}
		});
		delete_Bound.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Display_panel.removeAll();
				delete_bound.mains();
			}
		});
		system_set.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

	}

	private void get_Based_Panel() {
		Display_panel.removeAll();
		add_set_jSplitPane();
		add_right_jPanel();
		instantiation.addJpanel();


	}

	private void add_set_jSplitPane() {
		jSplitPane.setLeftComponent(jPenel_west);

		jSplitPane.setDividerSize(1);// 设置分割线的宽度
		jSplitPane.setDividerLocation(280);// 设定分割线的距离左边的位置
		jPenel_west.setSize(280, 900);
	}

	private void addsetOpaque() {
//		 TODO Auto-generated method stub
		user_data.setOpaque(false);
//		user_heads.setOpaque(false);
		user_text.setOpaque(false);
		editor.setOpaque(false);
		cherish.setOpaque(false);
		time.setOpaque(false);
		tishi.setOpaque(false);
		time_According.setOpaque(false);
		button_editor.setOpaque(false);
		jSplitPane.setOpaque(false);
		jPenel_west.setOpaque(false);
		

	}

	private void add_jPenel_west_up() {
		add_Controls();
		add_cherishtime();
		add_time_According();

	}

	private void Add_operation() {
		add_color_font(Home_page, 260, Color.magenta);
		add_color_font(out_Bound, 330, Color.blue);
		add_color_font(in_Bound, 410, Color.blue);
		add_color_font(Enter_the_user, 490, Color.blue);
		add_color_font(delete_Bound, 570, Color.blue);
		add_color_font(system_set, 650, Color.blue);
	}

	private void add_color_font(JButton names, int y, Color color) {
		jPenel_west.add(names);
		names.setBounds(100, y, 100, 30);
		names.setFont(new java.awt.Font("宋体", 1, 15));
		names.setForeground(color);

	}

	private void add_time_According() {

		TimeThread timeThread = new TimeThread(jPenel_west, time_According);
		Thread mThread1 = new Thread(timeThread);
		mThread1.start();

		timeThread.time_string();
	}

	private void add_cherishtime() {
		// 添加珍惜
		jPenel_west.add(cherish);
		cherish.setBounds(0, 150, 50, 25);
		cherish.setFont(new java.awt.Font("宋体", 1, 16));

		// 添加时间
		jPenel_west.add(time);
		time.setBounds(0, 175, 50, 25);
		time.setFont(new java.awt.Font("宋体", 1, 16));

	}

	private void add_Controls() {
		add_user_herd();
		add_uset_text();
		add_tishi();
		add_editor();
		add_editorButoon(button_editor);

	}

	private void add_editor() {
		// TODO Auto-generated method stub
		jPenel_west.add(editor);
		editor.setBounds(245, 125, 30, 20);
		editor.setFont(new java.awt.Font("宋体", 0, 12));
		editor.setHorizontalAlignment(SwingConstants.CENTER);
		editor.setVerticalAlignment(SwingConstants.CENTER);

	}

	private void add_editorButoon(JButton name) {
		// TODO Auto-generated method stub
		jPenel_west.add(name);
		name.setBounds(245, 125, 30, 20);
		name.setFont(new java.awt.Font("宋体", 0, 12));
		name.setBackground(Color.cyan);
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setVerticalAlignment(SwingConstants.CENTER);

	}

	private void add_tishi() {
		// TODO Auto-generated method stub
		jPenel_west.add(tishi);
		tishi.setBounds(120, 0, 160, 40);
		tishi.setFont(new java.awt.Font("宋体", 1, 20));
		tishi.setBackground(Color.cyan);
		tishi.setHorizontalAlignment(SwingConstants.CENTER);
		tishi.setVerticalAlignment(SwingConstants.CENTER);

	}

	private void add_uset_text() {
		// TODO Auto-generated method stub
		jPenel_west.add(user_text);
		user_text.setBounds(120, 40, 160, 80);
		user_text.setLayout(null);
		user_text.add(user_data);
		user_data.setBounds(0, 0, 160, 80);
		user_data.setFont(x);
		user_data.setBackground(Color.red);
		user_data.setText(" 姓名： " + name + "\n" + " 账号： " + zhanghao + "\n" + " 电话： " + dianhua + "\n" + " 邮箱："
				+ youxiang + "@qq.com");
		user_data.setEditable(false);

	}

	private void add_user_herd() {
		jPenel_west.add(user_heads);
		user_heads.setBounds(0, 0, 120, 150);
		user_heads.setLayout(null);
		user_heads.add(tpJLabel);
		tpJLabel.setBounds(2, 2, 118, 148);
		tpJLabel.setBackground(Color.BLUE);

	}
}
