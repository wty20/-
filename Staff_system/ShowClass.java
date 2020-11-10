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
	private JLabel promptInput = new JLabel("������Ҫ��ѯ��Ա����:");
	private JTextArea wenBengYu = new JTextArea();
	private JButton showButton = new JButton("��ѯ");
	private JTextField yuanGongHaowbk = new JTextField();
	private ArrayList<Dates> list;
	private JLabel tpJLabels = new JLabel(new ImageIcon(Window.class.getResource("gsd.png")));

	public ShowClass(JPanel showPanel) {
		this.showPanel = showPanel;
	}

	public void ShowMain() {
		showPanel.setLayout(null);
		this.list = DengLuClass.getList();
		wenBengYu.setText("\n\t���\tԱ����\t����\t�Ա�\tÿ�¹���\t��������\n");
		showPanel.add(promptInput);
		showPanel.add(yuanGongHaowbk);
		showPanel.add(showButton);
		showPanel.add(wenBengYu);
		showPanel.add(tpJLabels);
		tpJLabels.setBounds(0, 0, 1800, 820);
		wenBengYu.setEditable(false);

		promptInput.setFont(new java.awt.Font("����", 1, 15));
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
							wenBengYu.setText("\n\t���\tԱ����\t����\t�Ա�\tÿ�¹���\t��������\n\n" + "\t" + list.get(i).getString1()
									+ "\t" + list.get(i).getString2() + "\t" + list.get(i).getString3() + "\t"
									+ list.get(i).getString4() + "\t" + list.get(i).getString5() + "\t"
									+ list.get(i).getString6());
							yuanGongHaowbk.setText("");
							break;
						} else {
							if (i == list.size() - 1) {
								wenBengYu.setText("\n\t\t�˼�¼����������");
							}
						}

					}
				} else {
					wenBengYu.setText("�������Ϊ�գ�");
				}

			}
		});

	}

}
