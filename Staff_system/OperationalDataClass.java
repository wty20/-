package Final_exam;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OperationalDataClass {
	private JPanel mainOperationalPanel;

	public OperationalDataClass(JPanel mainOperationalPanel) {
		this.mainOperationalPanel = mainOperationalPanel;
	}

	private JPanel OperationalUp = new JPanel();
	private JLabel tpJLabel = new JLabel(new ImageIcon(Window.class.getResource("gs.png")));

	private JButton Addyg = new JButton("添加员工");
	private JButton upDate = new JButton("修改员工");
	private JButton delete = new JButton("删除员工");
	private JButton show = new JButton("查询员工");

	private JPanel ipCard = new JPanel();
	private JPanel inputPanel = new JPanel();
	private JPanel updateCard = new JPanel();
	private JPanel deleteCard = new JPanel();
	private JPanel showPanel = new JPanel();

	private CardLayout card = new CardLayout();

	AddSetText addSetText = new AddSetText(inputPanel);
	UpdeteClass updeteClass = new UpdeteClass(updateCard);
	deleteClass deleteClass = new deleteClass(deleteCard);
	ShowClass showClass = new ShowClass(showPanel);

	public void OperationalDataClassMain() {
		addInit();
		addOperational();
		AddActionLister();

		addSetText.addDateMains();
		deleteClass.deleteMain();
		updeteClass.updateMain();
		showClass.ShowMain();

	}

	public void addInit() {
		OperationalUp.setLayout(null);
		OperationalUp.setPreferredSize(new Dimension(0, 90));

		updateCard.setBounds(40, 50, 400, 300);
		inputPanel.setBounds(40, 50, 400, 300);

		Addyg.setBounds(220, 40, 90, 28);
		upDate.setBounds(340, 40, 90, 28);
		delete.setBounds(460, 40, 90, 28);
		show.setBounds(580, 40, 90, 28);
		ipCard.setBounds(120, 30, 400, 600);

		tpJLabel.setBounds(0, 0, 1800, 90);

		OperationalUp.setBounds(0, 0, 900, 90);
	}

	public void addOperational() {
		mainOperationalPanel.add(OperationalUp, BorderLayout.NORTH);
		OperationalUp.add(Addyg);
		OperationalUp.add(upDate);
		OperationalUp.add(delete);
		OperationalUp.add(show);
		OperationalUp.add(tpJLabel);

		mainOperationalPanel.add(ipCard, BorderLayout.CENTER);

		ipCard.setLayout(card);
		ipCard.add(inputPanel, "p1");
		ipCard.add(updateCard, "p2");
		ipCard.add(deleteCard, "p3");
		ipCard.add(showPanel, "p4");

	}

	private void AddActionLister() {

		Addyg.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(ipCard, "p1");
			}
		});
		upDate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(ipCard, "p2");
			}
		});

		delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(ipCard, "p3");
			}
		});
		show.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(ipCard, "p4");
			}
		});
	}

}
