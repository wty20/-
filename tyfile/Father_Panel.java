package tySystem;

import javax.swing.*;
import java.awt.*;

public class Father_Panel {
    private JPanel based_panel;
    private JPanel top = new JPanel();
    private JPanel bottom = new JPanel();

    JSplitPane jSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, true, top, bottom);// 设定为上下拆分布局


    public Father_Panel(JPanel based_panel) {
        this.based_panel = based_panel;
    }



    public void outBound() {
        based_panel.setLayout(new BorderLayout());
        based_panel.add(jSplitPane);
        jSplitPane.setDividerSize(2);// 设置分割线的宽度
        jSplitPane.setDividerLocation(250);// 设定分割线的距离左边的位置


    }
    public void test(){
        top.setBackground(Color.BLUE);

    }


}
