package tySystem;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Window {
    private JFrame jFrame = new JFrame();
    private JLabel tpJLabel;
    private JPanel jPanel = new JPanel();

    private JLabel zhanHao = new JLabel("用户名:");
    private JTextField user_name = new JTextField();
    private JLabel miMa = new JLabel("密码:");
    private JPasswordField jPasswordField = new JPasswordField();

    private JButton dengLu = new JButton("登录");
    private JButton zhuCe = new JButton("注册");
    private JLabel prompt = new JLabel("忘记密码?");

    private JLabel weicome = new JLabel("欢迎使用凌羽科技系统");
//    private JPanel jPanel_center = new JPanel();
 
    Image icon = Toolkit.getDefaultToolkit().getImage(Window.class.getResource("gfh.png"));


  


	public Window(JLabel tpJLabel2) {
		// TODO Auto-generated constructor stub
		this.tpJLabel =tpJLabel2;
	}


	public void windows() throws IOException {

        init();
        getjPanel();
        get_DengLu_Button();
        get_zhuCe_Button();

    }


    private void get_DengLu_Button() {
        dengLu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.removeAll();
                DengLu_Class dengLu_class = new DengLu_Class(jFrame, jPanel);
                dengLu_class.mains();
            }
        });

    }

    private void get_zhuCe_Button() {
        zhuCe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void init() {
    	jFrame.setIconImage(icon);
        jFrame.setTitle("图书管理系统");
        jFrame.setSize(950, 600);//设置显示窗口大小
        jFrame.setLocation(500, 200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//默认单机点关闭窗口
        jFrame.setResizable(false);//设置窗口不可变大小贴用
        jFrame.setVisible(true);//设置窗口为可见的
    }


    private void getjPanel() {
        jFrame.add(jPanel);
//        jPanel.setBackground(Color.cyan);
        jPanel.setLayout(null);

        add_Controls_Up();
        add_Controls();
        add_beijing();

    }



    private void add_beijing() {
		// TODO Auto-generated method stub
		jPanel.add(tpJLabel);
		tpJLabel.setBounds(0, 0, 950, 600);
	}


	private void add_Controls_Up() {
    	jPanel.add(weicome);
        weicome.setFont(new java.awt.Font("宋体", 1, 40));
        weicome.setForeground(Color.magenta);
        weicome.setBounds(270, 20, 830, 50);
        weicome.setBackground(Color.RED);

    }


    private void add_Controls() {
        int x = 560;
        int y = 150;

        jPanel.add(zhanHao);
        zhanHao.setBounds(x, y, 80, 50);
        zhanHao.setFont(new Font("宋体", 1, 20));
        zhanHao.setForeground(Color.RED);

        // 添加用户名输入框
        jPanel.add(user_name);
        user_name.setBounds(x + 80, y + 10, 180, 32);

        // 添加密码标签
        jPanel.add(miMa);
        miMa.setFont(new Font("宋体", 1, 20));
        miMa.setBounds(x + 20, y + 60, 80, 50);
        miMa.setForeground(Color.RED);

        // 添加密码输入框
        jPanel.add(jPasswordField);
        jPasswordField.setBounds(x + 80, y + 70, 180, 32);

        // 添加登录按钮
        jPanel.add(dengLu);
        dengLu.setBounds(x + 20, y + 180, 110, 30);
        dengLu.setFont(new Font("宋体", 1, 20));
        dengLu.setForeground(Color.RED);

        // 添加注册按钮
        jPanel.add(zhuCe);
        zhuCe.setBounds(x + 140, y + 180, 110, 30);
        zhuCe.setFont(new Font("宋体", 1, 20));
        zhuCe.setForeground(Color.RED);

        // 添加提示
        jPanel.add(prompt);
        prompt.setBounds(x + 20, y + 260, 120, 40);
        prompt.setForeground(Color.GRAY);
    }


}
