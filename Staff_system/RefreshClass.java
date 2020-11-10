package Final_exam;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class RefreshClass {
	private JPanel DisplayPanel;
	private String[] thead;
	private String[][] shuiguo;
	private JScrollPane gundongtiao = new JScrollPane();
	private JTable biao;
	private ArrayList<Dates> list;
	private JLabel tpJLabel=new JLabel(new ImageIcon(Window.class.getResource("g.jpg")));
	public RefreshClass(JPanel DisplayPanel, ArrayList<Dates> list) {
		this.DisplayPanel = DisplayPanel;
		this.list = list;

	}
	public void xingshuafanga() {
		DisplayPanel.setLayout(null);
		thead = new String[] { "序号", "员工号", "姓名", "性别", "每月工资", "所数部门" };
		
		shuiguo = new String[list.size()][6];

		for (int i = 0; i < list.size(); i++) {

			shuiguo[i][0] = list.get(i).getString1();
			shuiguo[i][1] = list.get(i).getString2();
			shuiguo[i][2] = list.get(i).getString3();
			shuiguo[i][3] = list.get(i).getString4();
			shuiguo[i][4] = list.get(i).getString5();
			shuiguo[i][5] = list.get(i).getString6();
		}

		biao = new JTable(shuiguo, thead);

		DisplayPanel.add(biao, BorderLayout.CENTER);

		gundongtiao.setViewportView(biao);

		DisplayPanel.add(gundongtiao);
		gundongtiao.setBounds(50, 20, 800, 600);
		tpJLabel.setBounds(0,0,1800,900);
		biao.setEnabled(false);
		biao.setOpaque(false);
		DisplayPanel.add(tpJLabel);
	}

}
