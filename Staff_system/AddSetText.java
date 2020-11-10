package Final_exam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddSetText {

	private JPanel inputPanel;
	private ArrayList<Dates> list;

	private JTextField yuaong1 = new JTextField(20);
	private JTextField yuaong2 = new JTextField(20);
	private JTextField yuaong3 = new JTextField(20);
	private JTextField yuaong4 = new JTextField(20);
	private JTextField yuaong5 = new JTextField(20);
	private JTextField yuaong6 = new JTextField(20);

	private JLabel noNull = new JLabel("输入框不能为空");
	private JLabel noLike = new JLabel("添加的序号或员工号已存在");
	private JLabel yesAdd = new JLabel("确定要添加吗？");
	private JLabel addSuccessful = new JLabel("添加已成功！");

	private JButton yes = new JButton("确定");
	private JButton nos = new JButton("取消");
	private JButton adds = new JButton("添加");
	private JButton qingKong = new JButton("清空");
	private JLabel tpJLabels = new JLabel(new ImageIcon(Window.class.getResource("gsd.png")));
	ToolClass addToolClass = new ToolClass();

	public AddSetText(JPanel inputPanel) {
		this.inputPanel = inputPanel;
	}

	public void addDateMains() {
		addsettext();
		Assignment();
		AddSetTextActionListener();
	}

	public void addsettext() {
		addToolClass.FangFa(inputPanel);
		inputPanel.setLayout(null);
		inputPanel.add(adds);
		inputPanel.add(noLike);
		inputPanel.add(noNull);
		inputPanel.add(addSuccessful);
		inputPanel.add(yes);
		inputPanel.add(nos);
		inputPanel.add(yesAdd);
		inputPanel.add(qingKong);

		yes.setVisible(false);
		nos.setVisible(false);
		yesAdd.setVisible(false);
		noLike.setVisible(false);
		noNull.setVisible(false);
		addSuccessful.setVisible(false);
		qingKong.setVisible(false);

		yesAdd.setFont(new java.awt.Font("宋体", 1, 18));
		noLike.setFont(new java.awt.Font("宋体", 1, 18));
		noNull.setFont(new java.awt.Font("宋体", 1, 18));
		addSuccessful.setFont(new java.awt.Font("宋体", 1, 18));

		int x = 150;
		int y = 150;
		int w = 90;
		int h = 28;

		adds.setBounds(x + 590, y + 30, w, h);
		yes.setBounds(x + 150, y + 120, w - 25, h);
		nos.setBounds(x + 250, y + 120, w - 25, h);
		noNull.setBounds(x + 50, y + 80, w + 90, h);
		yesAdd.setBounds(x + 50, y + 80, w + 150, h);
		noLike.setBounds(x + 50, y + 80, w + 150, h);
		qingKong.setBounds(x + 200, y + 120, w - 25, h);
		addSuccessful.setBounds(x + 100, y + 80, w + 150, h);
		
		inputPanel.add(tpJLabels);
		tpJLabels.setBounds(0,0,1800,820);

	}

	private void Assignment() {
		this.yuaong1 = addToolClass.getYuaong1();
		this.yuaong2 = addToolClass.getYuaong2();
		this.yuaong3 = addToolClass.getYuaong3();
		this.yuaong4 = addToolClass.getYuaong4();
		this.yuaong5 = addToolClass.getYuaong5();
		this.yuaong6 = addToolClass.getYuaong6();
	}

	public void AddSetTextActionListener() {
		adds.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				list = DengLuClass.getList();
				if (list.size() == 0) {
					if (!yuaong1.getText().equals("") && !yuaong2.getText().equals("") && !yuaong3.getText().equals("")
							&& !yuaong4.getText().equals("") && !yuaong5.getText().equals("")
							&& !yuaong6.getText().equals("")) {
						yesAdd.setVisible(true);
						YAN(true);
					} else {
						qingKong.setVisible(false);
						Threads(1);
					}

				} else {
					if (!yuaong1.getText().equals("") && !yuaong2.getText().equals("") && !yuaong3.getText().equals("")
							&& !yuaong4.getText().equals("") && !yuaong5.getText().equals("")
							&& !yuaong6.getText().equals("")) {

						for (int i = 0; i < list.size(); i++) {
							if (!yuaong1.getText().equals(list.get(i).getString1())
									&& !yuaong2.getText().equals(list.get(i).getString2())) {

								if (i == list.size() - 1) {
									noLike.setVisible(false);
									noNull.setVisible(false);
									qingKong.setVisible(false);
									YAN(true);

								}

							} else {

								YAN(false);
								noNull.setVisible(false);
								qingKong.setVisible(true);
								Threads(3);
								break;

							}
						}

					} else {
						YAN(false);
						noLike.setVisible(false);
						qingKong.setVisible(false);
						Threads(1);

					}
				}
			}

		});
		qingKong.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				EmptyTextBox();
				qingKong.setVisible(false);
			}
		});

		yes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				list.add(new Dates(yuaong1.getText(), yuaong2.getText(), yuaong3.getText(), yuaong4.getText(),
						yuaong5.getText(), yuaong6.getText()));

				FileReadWrite.inputFile();

				EmptyTextBox();

				yes.setVisible(false);
				nos.setVisible(false);
				yesAdd.setVisible(false);
				Threads(2);

			}

		});
		nos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				EmptyTextBox();
				yes.setVisible(false);
				nos.setVisible(false);
				yesAdd.setVisible(false);
			}
		});
	}

	private void YAN(boolean tAf) {
		yes.setVisible(tAf);
		nos.setVisible(tAf);
		yesAdd.setVisible(tAf);
	}

	private void Threads(int is) {
		addThread s = new addThread(addSuccessful, noNull, noLike, is);
		new Thread(s).start();
	}

	private void EmptyTextBox() {
		addToolClass.Cancel();
	}

}

class addThread implements Runnable {

	private JLabel addSuccessful;
	private JLabel noNull;
	private JLabel noLike;
	private int is;

	public addThread(JLabel addSuccessful, JLabel noNull, JLabel noLike, int is) {
		this.addSuccessful = addSuccessful;
		this.noNull = noNull;
		this.noLike = noLike;
		this.is = is;
	}

	@Override
	public void run() {
		if (is == 1) {
			noNull.setVisible(true);
		}
		if (is == 2) {

			addSuccessful.setVisible(true);
		}
		if (is == 3) {
			noLike.setVisible(true);
		}
		try {
			Thread.sleep(1000);
			addSuccessful.setVisible(false);
			noLike.setVisible(false);
			noNull.setVisible(false);
			is = 0;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
