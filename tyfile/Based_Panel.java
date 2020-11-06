package tySystem;

import javax.swing.*;

import tySystem.Window;



public class Based_Panel {
	private JPanel JPanel;
	private JPanel top = new JPanel();
	private JPanel bottom = new JPanel();
	private static JLabel tpJLabel2 = new JLabel(new ImageIcon(Window.class.getResource("t.jpg")));
	JSplitPane jSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, true, top, bottom);// 璁惧畾涓轰笂涓嬫媶鍒嗗竷灞�

	public Based_Panel(JPanel based_panel) {
		this.JPanel = based_panel;
	}

	public void addJpanel() {
		// JPanel.setBackground(Color.PINK);
		JPanel.setLayout(null);
		JPanel.add(tpJLabel2);
		tpJLabel2.setBounds(0, 0, 1200, 800);
	}
}
