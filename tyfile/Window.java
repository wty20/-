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

    private JLabel zhanHao = new JLabel("�û���:");
    private JTextField user_name = new JTextField();
    private JLabel miMa = new JLabel("����:");
    private JPasswordField jPasswordField = new JPasswordField();

    private JButton dengLu = new JButton("��¼");
    private JButton zhuCe = new JButton("ע��");
    private JLabel prompt = new JLabel("��������?");

    private JLabel weicome = new JLabel("��ӭʹ������Ƽ�ϵͳ");
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
        jFrame.setTitle("ͼ�����ϵͳ");
        jFrame.setSize(950, 600);//������ʾ���ڴ�С
        jFrame.setLocation(500, 200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Ĭ�ϵ�����رմ���
        jFrame.setResizable(false);//���ô��ڲ��ɱ��С����
        jFrame.setVisible(true);//���ô���Ϊ�ɼ���
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
        weicome.setFont(new java.awt.Font("����", 1, 40));
        weicome.setForeground(Color.magenta);
        weicome.setBounds(270, 20, 830, 50);
        weicome.setBackground(Color.RED);

    }


    private void add_Controls() {
        int x = 560;
        int y = 150;

        jPanel.add(zhanHao);
        zhanHao.setBounds(x, y, 80, 50);
        zhanHao.setFont(new Font("����", 1, 20));
        zhanHao.setForeground(Color.RED);

        // ����û��������
        jPanel.add(user_name);
        user_name.setBounds(x + 80, y + 10, 180, 32);

        // ��������ǩ
        jPanel.add(miMa);
        miMa.setFont(new Font("����", 1, 20));
        miMa.setBounds(x + 20, y + 60, 80, 50);
        miMa.setForeground(Color.RED);

        // ������������
        jPanel.add(jPasswordField);
        jPasswordField.setBounds(x + 80, y + 70, 180, 32);

        // ��ӵ�¼��ť
        jPanel.add(dengLu);
        dengLu.setBounds(x + 20, y + 180, 110, 30);
        dengLu.setFont(new Font("����", 1, 20));
        dengLu.setForeground(Color.RED);

        // ���ע�ᰴť
        jPanel.add(zhuCe);
        zhuCe.setBounds(x + 140, y + 180, 110, 30);
        zhuCe.setFont(new Font("����", 1, 20));
        zhuCe.setForeground(Color.RED);

        // �����ʾ
        jPanel.add(prompt);
        prompt.setBounds(x + 20, y + 260, 120, 40);
        prompt.setForeground(Color.GRAY);
    }


}
