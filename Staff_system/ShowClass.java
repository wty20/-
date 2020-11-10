package Final_exam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ShowClass {

	private JPanel showPanel;
	private JLabel promptInput = new JLabel("请输入要查询的员工号:");
	private JTextArea wenBengYu = new JTextArea();
	private JButton showButton = new JButton("查询");
	private JTextField yuanGongHaowbk = new JTextField();
	private ArrayList<Dates> list;
	private JLabel tpJLabels = new JLabel(new ImageIcon(Window.class.getResource("gsd.png")));

	public ShowClass(JPanel showPanel) {
		this.showPanel = showPanel;
	}

	public void ShowMain() {
		showPanel.setLayout(null);
		this.list = DengLuClass.getList();
		wenBengYu.setText("\n\t序号\t员工号\t姓名\t性别\t每月工资\t所属部门\n");
		showPanel.add(promptInput);
		showPanel.add(yuanGongHaowbk);
		showPanel.add(showButton);
		showPanel.add(wenBengYu);
		showPanel.add(tpJLabels);
		tpJLabels.setBounds(0, 0, 1800, 820);
		wenBengYu.setEditable(false);

		promptInput.setFont(new java.awt.Font("宋体", 1, 15));
		promptInput.setBounds(170, 100, 200, 30);
		yuanGongHaowbk.setBounds(350, 100, 160, 30);
		showButton.setBounds(520, 100, 65, 30);
		wenBengYu.setBounds(150, 200, 670, 130);

	

	}

	public void showActionListener() {
		showButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				if (!yuanGongHaowbk.getText().equals("") && !yuanGongHaowbk.getText().equals(null)) {

					for (int i = 0; i < list.size(); i++) {
						if (list.get(i).getString2().equals(yuanGongHaowbk.getText())) {
							wenBengYu.setText("\n\t序号\t员工号\t姓名\t性别\t每月工资\t所数部门\n\n" + "\t" + list.get(i).getString1()
									+ "\t" + list.get(i).getString2() + "\t" + list.get(i).getString3() + "\t"
									+ list.get(i).getString4() + "\t" + list.get(i).getString5() + "\t"
									+ list.get(i).getString6());
							yuanGongHaowbk.setText("");
							break;
						} else {
							if (i == list.size() - 1) {
								wenBengYu.setText("\n\t\t此记录搜索不到！");
							}
						}

					}
				} else {
					wenBengYu.setText("输入框不能为空！");
				}

			}
		});

	}

}
