package tySystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Out_Bound {
    private JPanel based_panel;
    private JPanel top = new JPanel();
    private JPanel bottom = new JPanel();

    JSplitPane jSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, true, top, bottom);// 设定为上下拆分布局
    private JLabel ReaderID = new JLabel("借书证号:");
    private JTextField id = new JTextField();
    private JButton yes = new JButton("确定");

    private JLabel naem = new JLabel("姓名：");
    private JLabel age = new JLabel("年龄：");
    private JLabel reader_id = new JLabel("借书证：");
    private JLabel phone = new JLabel("联系号码：");

    private JTextField naem_Text = new JTextField();
    private JTextField age_Text = new JTextField();
    private JTextField reader_id_Text = new JTextField();
    private JTextField phone_Text = new JTextField();
    Font zt = new Font("宋体", 1, 12);

    private  JLabel input_book =new JLabel("输入借书名:");
    private JTextField input_book_Text = new JTextField();
    private JButton lend =new JButton("借出>");
    private  JButton no =new JButton("取消");
    private JTable jTable = new JTable();
    private Object JTable =new JTable();
    Outbound_Table outbound_table = new Outbound_Table(JTable,bottom);

    public Out_Bound(JPanel display_panel) {
        this.based_panel = display_panel;
    }

    public void mains() {
        tint();
        add_Table();
        add_function();
        based_panel.setOpaque(false);
        jSplitPane.setOpaque(false);
        top.setOpaque(false);
        bottom.setOpaque(false);
        open_According(false);
        Butoon();
    }

    private void add_Table() {
        outbound_table.mains();
    }

    private void Butoon() {
        yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                open_According(true);
            }
        });
        no.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                open_According(false);
            }
        });
    }

    private void open_According( boolean vat) {

        input_book.setVisible(vat);
        input_book_Text.setVisible(vat);
        lend.setVisible(vat);
        no.setVisible(vat);
    }

    private void add_function() {
        top.setLayout(null);

        user_Query();
        int x =30;
        user_Data(top, naem, 530+x, 14, 70, 40, null);
        user_Data(top, age, 680+x, 14, 70, 40, null);
        user_Data(top, reader_id, 830+x, 14, 70, 40, null);
        user_Data(top, phone, 1000+x, 14, 90, 40, null);
        user_Data(top, input_book, 100+x, 80, 90, 40, null);

        addUD(top, naem_Text, zt,605);
        addUD(top, age_Text, zt,755);
        addUD(top, reader_id_Text, zt,920);
        addUD(top, phone_Text, zt,1110);

        top.add(input_book);
        input_book.setBounds(100+x, 85, 100, 40);
        input_book.setFont(new Font("宋体", 1, 16));

        top.add(input_book_Text);
        input_book_Text.setBounds(230,90,180,32);

        top.add(lend);
        lend.setBounds(460,90,70,30);

        top.add(no);
        no.setBounds(630,90,70,30);

    }

    private static void addUD(JPanel top, JTextField naem_Text, Font zt,int x1) {
        top.add(naem_Text);
        naem_Text.setBounds(x1,19,100,30);
        naem_Text.setFont(zt);
        naem_Text.setEditable(false);
    }

    private static void user_Data(JPanel top, JLabel naem, int x, int y, int w, int h, Color color) {

        top.add(naem);
        naem.setBounds(x, y, w, h);
        naem.setFont(new Font("宋体", 1, 15));
        naem.setBackground(color);
    }


    private void user_Query() {
        top.add(ReaderID);
        int x = 150;
        ReaderID.setBounds(x, 14, 100, 40);
        ReaderID.setFont(new Font("宋体", 1, 18));
        ReaderID.setBackground(Color.cyan);

        top.add(id);
        id.setBounds(x + 100, 18, 170, 35);

        top.add(yes);
        yes.setBounds(x + 295, 19, 60, 30);
    }

    private void tint() {
        based_panel.setLayout(new BorderLayout());
        based_panel.add(jSplitPane);
        jSplitPane.setDividerSize(2);// 设置分割线的宽度
        jSplitPane.setDividerLocation(180);// 设定分割线的距离左边的位置


    }
}
