package tySystem;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Outbound_Table {
	private JPanel bottom;
	private Object jTable;
	private JScrollPane gundongtiao = new JScrollPane();
	private String[][] shuiguo;
	private String[] thead;
	// private static ArrayList list = new ArrayList<Dates>();
	private ArrayList list = new ArrayList();

	public Outbound_Table(Object jTable, JPanel bottom) {
		this.jTable = jTable;
		this.bottom = bottom;
	}

	public void mains() {
		bottom.setLayout(null);
//        thead = new String[] { " ","����", "����", "��۸�", "�����û�", "����֤��", "��ϵ��ʽ","����ʱ��"," " };
//        String[] name={"ѧ��","�������","Java","����","���ݽṹ","���ݿ�","�ܳɼ�","ƽ���ɼ�"};

//        Object[][] tableData =
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");//�������ڸ�ʽ
        String times1 = df1.format(new Date());// new Date()Ϊ��ȡ��ǰϵͳʱ��
    	 String[][] tableData = new String[100][15];
                
                	for(int i=0; i<100;i++) {
                		for (int j =0;j<15;j++){
                			String bString = String.valueOf(i+1);
                			if (j ==0) {
                				tableData[i][j] = bString;
                			}else if (j ==1) {
                				tableData[i][j] = "59200"+String.valueOf(i);
							}else if (j ==2) {
								tableData[i][j] = "����"+String.valueOf(i);
							}else if (j ==3) {
								tableData[i][j] = "520";
							}else if (j ==4) {
								tableData[i][j] = "name"+String.valueOf(i);
							}else if (j ==5) {
								tableData[i][j] = "2020218"+bString;
							}
							else if (j ==6) {
								tableData[i][j] = "13145920"+bString;
							}
							else if (j ==7) {
								tableData[i][j] = times1;
							}
							else if (j ==8) {
								tableData[i][j] = "  ";
							}
							else if (j ==9) {
								tableData[i][j] = "  ";
							}
							else if (j ==10) {
								tableData[i][j] = "  ";
							}
							else if (j ==11) {
								tableData[i][j] = "  ";
							}
							else if (j ==12) {
								tableData[i][j] = "  ";
							}
							else if (j ==13) {
								tableData[i][j] = "  ";
							}
							else if (j ==14) {
								tableData[i][j] = "  ";
							}
                			
                		}
                	}
//                	}
//                        new Object[]{"������", 29, "Ů"},
//                        new Object[]{"������", 29, "Ů"},
//                        new Object[]{"�ո�����", 56, "��"},
//                        new Object[]{"���", 35, "��"},
//                        new Object[]{"Ū��", 18, "Ů"},
//                        new Object[]{"��ͷ", 2, "��"},
//                        new Object[]{"������", 29, "Ů"},
//                        new Object[]{"�ո�����", 56, "��"},
//                        new Object[]{"���", 35, "��"},
//                        new Object[]{"Ū��", 18, "Ů"},
//                        new Object[]{"��ͷ", 2, "��"},
//                        new Object[]{"������", 29, "Ů"},
//
//                };
        //����һά������Ϊ�б���
        Object[] columnTitle = { "���","����", "����", "��۸�", "�����û�", "����֤��", "��ϵ��ʽ","����ʱ��"," "," "," "," "," "," "," " };
        //�Զ�ά�����һά����������һ��JTable����
        jTable = new JTable(tableData, columnTitle);
        
//        //��JTable�������JScrollPane�У�������JScrollPane���ڴ�������ʾ����
////        bottom.setLayout(null);
//        bottom.add(new JScrollPane((Component) jTable));
//        ((Component) jTable).setSize(1200,800);
//        ((Component) jTable).setBounds(5,5,1200,800);
//        bottom.setVisible(true);
		bottom.add((Component) jTable);

		gundongtiao.setViewportView((Component) jTable);
//		gundongtiao.setRowHeaderView(biao);

		bottom.add(gundongtiao);
		gundongtiao.setBounds(50, 20, 1500, 700);
//		tpJLabel.setBounds(0,0,1800,900);
		((JComponent) jTable).setEnabled(false);
		((JComponent) jTable).setOpaque(false);
		
//		bottom.add(tpJLabel);


    }

}
