package Final_exam;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ToolClass {
	private JLabel head1 = new JLabel("序号");
	private JLabel head2 = new JLabel("员工号");
	private JLabel head3 = new JLabel("姓名");
	private JLabel head4 = new JLabel("性别");
	private JLabel head5 = new JLabel("每月工资");
	private JLabel head6 = new JLabel("所属部门");

	private JTextField yuaong1 = new JTextField(20);

	private JTextField yuaong2 = new JTextField(20);
	private JTextField yuaong3 = new JTextField(20);
	private JTextField yuaong4 = new JTextField(20);
	private JTextField yuaong5 = new JTextField(20);
	private JTextField yuaong6 = new JTextField(20);
	

	public void FangFa(JPanel Panels) {
		Panels.add(yuaong1);
		Panels.add(yuaong2);
		Panels.add(yuaong3);
		Panels.add(yuaong4);
		Panels.add(yuaong5);
		Panels.add(yuaong6);

		Panels.add(head1);
		Panels.add(head2);
		Panels.add(head3);
		Panels.add(head4);
		Panels.add(head5);
		Panels.add(head6);
		
		int x = 150;
		int y = 150;
		int w = 90;
		int h = 28;

		head1.setBounds(x, y, w, h);
		head2.setBounds(x + 110, y, w, h);
		head3.setBounds(x + 210, y, w, h);
		head4.setBounds(x + 310, y, w, h);
		head5.setBounds(x + 410, y, w, h);
		head6.setBounds(x + 510, y, w, h);

		yuaong1.setBounds(x - 20, y + 30, w, h);
		yuaong2.setBounds(x + 90, y + 30, w, h);
		yuaong3.setBounds(x + 190, y + 30, w, h);
		yuaong4.setBounds(x + 290, y + 30, w, h);
		yuaong5.setBounds(x + 390, y + 30, w, h);
		yuaong6.setBounds(x + 490, y + 30, w, h);
		
		
	}

	public JTextField getYuaong1() {
		return yuaong1;
	}
	public JTextField getYuaong2() {
		return yuaong2;
	}
	public JTextField getYuaong3() {
		return yuaong3;
	}
	public JTextField getYuaong4() {
		return yuaong4;
	}
	public JTextField getYuaong5() {
		return yuaong5;
	}
	public JTextField getYuaong6() {
		return yuaong6;
	}
	public void Cancel() {
		yuaong1.setText("");
		yuaong2.setText("");
		yuaong3.setText("");
		yuaong4.setText("");
		yuaong5.setText("");
		yuaong6.setText("");
	}

}
