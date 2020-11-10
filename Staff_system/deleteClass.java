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

public class deleteClass {

	private JPanel deleteCard;
	private JLabel promptInput = new JLabel("������Ҫɾ����Ա����:");
	private JTextField yuanGongHaowbk = new JTextField();
	private JTextArea wenBengYu = new JTextArea();
	private JButton deleteButton = new JButton("ɾ��");
	private JButton yes = new JButton("ȷ��");
	private JButton nos = new JButton("ȡ��");
	private ArrayList<Dates> list;
	private int index;
	private JLabel tpJLabels = new JLabel(new ImageIcon(Window.class.getResource("gsd.png")));

	public deleteClass(JPanel deleteCard) {
		this.deleteCard = deleteCard;
	}

	public void deleteMain() {
		addsettext();
		deleteActionListener();
	}

	public void addsettext() {

		deleteCard.setLayout(null);
		deleteCard.add(yes);
		deleteCard.add(nos);
		yes.setVisible(false);
		nos.setVisible(false);
		promptInput.setFont(new java.awt.Font("����", 1, 15));

		yes.setBounds(300, 320, 65, 28);
		nos.setBounds(450, 320, 65, 28);

		deleteCard.add(promptInput);
		deleteCard.add(yuanGongHaowbk);
		deleteCard.add(deleteButton);
		deleteCard.add(wenBengYu);
		deleteCard.add(tpJLabels);
		wenBengYu.setEditable(false);

		promptInput.setBounds(180, 100, 190, 30);
		yuanGongHaowbk.setBounds(350, 100, 160, 30);
		deleteButton.setBounds(520, 100, 65, 30);
		wenBengYu.setBounds(160, 200, 560, 100);
		tpJLabels.setBounds(0, 0, 1800, 820);
	}

	public void deleteActionListener() {
		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				list = DengLuClass.getList();
				if (!yuanGongHaowbk.getText().equals("") && yuanGongHaowbk.getText() != "") {

					for (int i = 0; i < list.size(); i++) {
						if (list.get(i).getString2().equals(yuanGongHaowbk.getText())) {
							wenBengYu.setText("���\tԱ����\t����\t�Ա�\tÿ�¹���\t��������\n" + list.get(i).getString1() + "\t"
									+ list.get(i).getString2() + "\t" + list.get(i).getString3() + "\t"
									+ list.get(i).getString4() + "\t" + list.get(i).getString5() + "\t"
									+ list.get(i).getString6() + "\n\n" + "\t\t��ȷ��Ҫɾ��������¼��");
							index = i;

							yes.setVisible(true);
							nos.setVisible(true);
							break;
						} else {
							if (i == list.size() - 1) {
								wenBengYu.setText("\n\t�޴˼�¼����ɾ����");

							}
						}
					}
				} else {
					wenBengYu.setText("\n\t\t�������Ϊ�գ�");

				}
			}
		});

		yes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				list.remove(index);
				FileReadWrite.inputFile();
				Xiangcheng thread = new Xiangcheng(wenBengYu);
				new Thread(thread, "1").start();
				yes.setVisible(false);
				nos.setVisible(false);
				yuanGongHaowbk.setText("");

			}
		});

	}

}

class Xiangcheng implements Runnable {

	private JTextArea wenBengYu;

	public Xiangcheng(JTextArea wenBengYu) {
		this.wenBengYu = wenBengYu;
	}

	@Override
	public void run() {
		wenBengYu.setText("\n\t\t�ѳɹ�ɾ��һ����¼");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wenBengYu.setText("");
	}

}
