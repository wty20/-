package Final_exam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UpdeteClass {
	private JPanel updateCard;
	private ArrayList<Dates> list;

	private JTextField yuanGongHaowbk = new JTextField(20);
	private JButton ShouSuo = new JButton("查询");
	private JLabel noLike = new JLabel("修改的序号或员工号已存在");

	private JTextField yuaong1 = new JTextField(20);
	private JTextField yuaong2 = new JTextField(20);
	private JTextField yuaong3 = new JTextField(20);
	private JTextField yuaong4 = new JTextField(20);
	private JTextField yuaong5 = new JTextField(20);
	private JTextField yuaong6 = new JTextField(20);

	private JButton yes = new JButton("确定");
	private JButton nos = new JButton("取消");
	private JLabel promptInput = new JLabel("请输入要修改的员工号:");
	private JLabel NoUpdate = new JLabel("无此记录可修改！");
	private JButton updateButton = new JButton("修改");
	private int index;
	ToolClass updateToolClass = new ToolClass();
	private JLabel tpJLabels = new JLabel(new ImageIcon(Window.class.getResource("gsd.png")));
	public UpdeteClass(JPanel updateCard) {
		this.updateCard = updateCard;
	}

	public void updateMain() {
		addsettext();
		Assignment();
	}

	public void addsettext() {
		updateToolClass.FangFa(updateCard);
		updateCard.setLayout(null);

		updateCard.add(yes);
		updateCard.add(nos);
		updateCard.add(NoUpdate);
		updateCard.add(noLike);
		yes.setVisible(false);
		nos.setVisible(false);
		NoUpdate.setVisible(false);
		noLike.setVisible(false);

		updateCard.add(promptInput);
		updateCard.add(updateButton);
		updateCard.add(yuanGongHaowbk);

		NoUpdate.setFont(new java.awt.Font("宋体", 1, 15));
		promptInput.setFont(new java.awt.Font("宋体", 1, 15));
		noLike.setFont(new java.awt.Font("宋体", 1, 15));
		yuanGongHaowbk.setBounds(380, 100, 160, 30);
		noLike.setBounds(200, 210, 240, 28);
		promptInput.setBounds(200, 100, 190, 30);

		updateButton.setBounds(550, 100, 65, 30);
		NoUpdate.setBounds(250, 180, 560, 100);

		yes.setBounds(300, 250, 65, 28);
		nos.setBounds(450, 250, 65, 28);

		ShouSuo.setBounds(370, 50, 80, 30);
		updeteActionListener();
		this.list = DengLuClass.getList();
		updateCard.add(tpJLabels);
		tpJLabels.setBounds(0,0,1800,820);
	}

	private void Assignment() {
		this.yuaong1 = updateToolClass.getYuaong1();
		this.yuaong2 = updateToolClass.getYuaong2();
		this.yuaong3 = updateToolClass.getYuaong3();
		this.yuaong4 = updateToolClass.getYuaong4();
		this.yuaong5 = updateToolClass.getYuaong5();
		this.yuaong6 = updateToolClass.getYuaong6();
	}

	private void updeteActionListener() {
		updateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (!yuanGongHaowbk.getText().equals("") && yuanGongHaowbk.getText() != "") {

					for (int i = 0; i < list.size(); i++) {
						if (list.get(i).getString2().equals(yuanGongHaowbk.getText())) {
							yuaong1.setText(list.get(i).getString1());
							yuaong2.setText(list.get(i).getString2());
							yuaong3.setText(list.get(i).getString3());
							yuaong4.setText(list.get(i).getString4());
							yuaong5.setText(list.get(i).getString5());
							yuaong6.setText(list.get(i).getString6());
							index = i;

							yes.setVisible(true);
							nos.setVisible(true);

							break;
						} else {
							if (i == list.size() - 1) {
								NoUpdate.setVisible(true);
							}
						}

					}
				}

			}
		});
		yuanGongHaowbk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				NoUpdate.setVisible(false);
				noLike.setVisible(false);

			}
		});

		yes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < list.size(); i++) {
					if (index != list.size() - 1) {

						if (i != index) {
							if (!yuaong1.getText().equals(list.get(i).getString1())
									&& !yuaong2.getText().equals(list.get(i).getString2())) {
								if (i == list.size() - 1) {
									removeList();
								}
							} else {
								noLike.setVisible(true);
								break;
							}
						}
					} else if (index == list.size() - 1) {
						if (i != index) {
							if (!yuaong1.getText().equals(list.get(i).getString1())
									&& !yuaong2.getText().equals(list.get(i).getString2())) {
								System.out.println("只对比下标为" + i);

								if (i == list.size() - 2) {
									removeList();
								}
							} else {
								noLike.setVisible(true);
								break;
							}
						}
					}
				}

			}

		});
		nos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Cancels();
				yes.setVisible(false);
				nos.setVisible(false);
				noLike.setVisible(false);
			}
		});

	}

	private void removeList() {
		list.remove(index);
		list.add(new Dates(yuaong1.getText(), yuaong2.getText(), yuaong3.getText(), yuaong4.getText(),
				yuaong5.getText(), yuaong6.getText()));
		Cancels();
		FileReadWrite.inputFile();
		yes.setVisible(false);
		nos.setVisible(false);
	}

	private void Cancels() {
		updateToolClass.Cancel();
		yuanGongHaowbk.setText("");
	}

}
