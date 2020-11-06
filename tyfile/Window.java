package tySystem;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Window {
    private JFrame jFrame = new JFrame();
    private JLabel tpJLabel;
    private JPanel jPanel = new JPanel();
    private JPanel jPanel_east = new JPanel();
    private JPanel jPanel_up = new JPanel();
    private JLabel zhanHao = new JLabel("用户名:");
    private JTextField user_name = new JTextField();
    private JLabel miMa = new JLabel("密码:");
    private JPasswordField jPasswordField = new JPasswordField();

    private JButton dengLu = new JButton("登录");
    private JButton zhuCe = new JButton("注册");
    private JLabel prompt = new JLabel("忘记密码?");

    private JLabel weicome = new JLabel("欢迎使用凌羽科技");
    private JPanel jPanel_center = new JPanel();
 
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
        jFrame.setSize(950, 650);//设置显示窗口大小
        jFrame.setLocation(500, 200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//默认单机点关闭窗口
        jFrame.setResizable(false);//设置窗口不可变大小贴用
        jFrame.setVisible(true);//设置窗口为可见的
    }


    private void getjPanel() {
        jFrame.add(jPanel);
        jPanel.setBackground(Color.cyan);
        jPanel.setLayout(new BorderLayout());

        getjPanel_up();
        getjPanel_east();
        getjPanel_center();
        getsetOpaque();


    }

    private void getsetOpaque() {
        // TODO Auto-generated method stub
        jPanel_center.setOpaque(false);
        jPanel_up.setOpaque(false);
        weicome.setOpaque(false);
        jPanel_east.setOpaque(false);
    }

    private void getjPanel_center() {
        jPanel.add(jPanel_center, BorderLayout.CENTER);
        jPanel_center.setBackground(Color.cyan);
        jPanel_center.add(tpJLabel);

    }

    private void getjPanel_up() {
        jPanel.add(jPanel_up, BorderLayout.NORTH);
        jPanel_up.setPreferredSize(new Dimension(0, 60));
        add_Controls_Up();


    }

    private void add_Controls_Up() {
        jPanel_up.add(weicome);
        jPanel_up.setBackground(Color.RED);
        weicome.setFont(new java.awt.Font("宋体", 1, 40));
        weicome.setForeground(Color.magenta);
        weicome.setOpaque(true);
        weicome.setBackground(Color.RED);
        weicome.setHorizontalAlignment(SwingConstants.CENTER);
        weicome.setVerticalAlignment(SwingConstants.CENTER);
    }

    private void getjPanel_east() {
        jPanel.add(jPanel_east, BorderLayout.EAST);
        jPanel_east.setLayout(null);
        jPanel_east.setBackground(Color.YELLOW);
        jPanel_east.setPreferredSize(new Dimension(450, 0));
        add_Controls();
    }

    private void add_Controls() {
        int x = 70;
        int y = 100;

        jPanel_east.add(zhanHao);
        zhanHao.setBounds(x, y, 80, 50);
        zhanHao.setFont(new Font("宋体", 1, 20));
        zhanHao.setForeground(Color.RED);

        // 添加用户名输入框
        jPanel_east.add(user_name);
        user_name.setBounds(x + 80, y + 10, 180, 32);

        // 添加密码标签
        jPanel_east.add(miMa);
        miMa.setFont(new Font("宋体", 1, 20));
        miMa.setBounds(x + 20, y + 60, 80, 50);
        miMa.setForeground(Color.RED);

        // 添加密码输入框
        jPanel_east.add(jPasswordField);
        jPasswordField.setBounds(x + 80, y + 70, 180, 32);

        // 添加登录按钮
        jPanel_east.add(dengLu);
        dengLu.setBounds(x + 20, y + 180, 110, 30);
        dengLu.setFont(new Font("宋体", 1, 20));
        dengLu.setForeground(Color.RED);

        // 添加注册按钮
        jPanel_east.add(zhuCe);
        zhuCe.setBounds(x + 140, y + 180, 110, 30);
        zhuCe.setFont(new Font("宋体", 1, 20));
        zhuCe.setForeground(Color.RED);

        // 添加提示
        jPanel_east.add(prompt);
        prompt.setBounds(x + 20, y + 260, 120, 40);
        prompt.setForeground(Color.GRAY);
    }


}
