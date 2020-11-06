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
//        thead = new String[] { " ","书编号", "书名", "书价格", "借书用户", "借书证号", "联系方式","借书时间"," " };
//        String[] name={"学号","软件工程","Java","网络","数据结构","数据库","总成绩","平均成绩"};

//        Object[][] tableData =
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        String times1 = df1.format(new Date());// new Date()为获取当前系统时间
    	 String[][] tableData = new String[100][15];
                
                	for(int i=0; i<100;i++) {
                		for (int j =0;j<15;j++){
                			String bString = String.valueOf(i+1);
                			if (j ==0) {
                				tableData[i][j] = bString;
                			}else if (j ==1) {
                				tableData[i][j] = "59200"+String.valueOf(i);
							}else if (j ==2) {
								tableData[i][j] = "书名"+String.valueOf(i);
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
//                        new Object[]{"李清照", 29, "女"},
//                        new Object[]{"李清照", 29, "女"},
//                        new Object[]{"苏格拉底", 56, "男"},
//                        new Object[]{"李白", 35, "男"},
//                        new Object[]{"弄玉", 18, "女"},
//                        new Object[]{"虎头", 2, "男"},
//                        new Object[]{"李清照", 29, "女"},
//                        new Object[]{"苏格拉底", 56, "男"},
//                        new Object[]{"李白", 35, "男"},
//                        new Object[]{"弄玉", 18, "女"},
//                        new Object[]{"虎头", 2, "男"},
//                        new Object[]{"李清照", 29, "女"},
//
//                };
        //定义一维数据作为列标题
        Object[] columnTitle = { "序号","书编号", "书名", "书价格", "借书用户", "借书证号", "联系方式","借书时间"," "," "," "," "," "," "," " };
        //以二维数组和一维数组来创建一个JTable对象
        jTable = new JTable(tableData, columnTitle);
        
//        //将JTable对象放在JScrollPane中，并将该JScrollPane放在窗口中显示出来
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
