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
    private JLabel zhanHao = new JLabel("�û���:");
    private JTextField user_name = new JTextField();
    private JLabel miMa = new JLabel("����:");
    private JPasswordField jPasswordField = new JPasswordField();

    private JButton dengLu = new JButton("��¼");
    private JButton zhuCe = new JButton("ע��");
    private JLabel prompt = new JLabel("��������?");

    private JLabel weicome = new JLabel("��ӭʹ������Ƽ�");
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
        jFrame.setTitle("ͼ�����ϵͳ");
        jFrame.setSize(950, 650);//������ʾ���ڴ�С
        jFrame.setLocation(500, 200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Ĭ�ϵ�����رմ���
        jFrame.setResizable(false);//���ô��ڲ��ɱ��С����
        jFrame.setVisible(true);//���ô���Ϊ�ɼ���
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
        weicome.setFont(new java.awt.Font("����", 1, 40));
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
        zhanHao.setFont(new Font("����", 1, 20));
        zhanHao.setForeground(Color.RED);

        // ����û��������
        jPanel_east.add(user_name);
        user_name.setBounds(x + 80, y + 10, 180, 32);

        // ��������ǩ
        jPanel_east.add(miMa);
        miMa.setFont(new Font("����", 1, 20));
        miMa.setBounds(x + 20, y + 60, 80, 50);
        miMa.setForeground(Color.RED);

        // ������������
        jPanel_east.add(jPasswordField);
        jPasswordField.setBounds(x + 80, y + 70, 180, 32);

        // ��ӵ�¼��ť
        jPanel_east.add(dengLu);
        dengLu.setBounds(x + 20, y + 180, 110, 30);
        dengLu.setFont(new Font("����", 1, 20));
        dengLu.setForeground(Color.RED);

        // ���ע�ᰴť
        jPanel_east.add(zhuCe);
        zhuCe.setBounds(x + 140, y + 180, 110, 30);
        zhuCe.setFont(new Font("����", 1, 20));
        zhuCe.setForeground(Color.RED);

        // �����ʾ
        jPanel_east.add(prompt);
        prompt.setBounds(x + 20, y + 260, 120, 40);
        prompt.setForeground(Color.GRAY);
    }


}
