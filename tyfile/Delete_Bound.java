package tySystem;

import javax.swing.*;
import java.awt.*;

public class Delete_Bound {
    private JPanel based_panel;
    private JPanel top = new JPanel();
    private JPanel bottom = new JPanel();

    JSplitPane jSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, true, top, bottom);// �趨Ϊ���²�ֲ���


    public Delete_Bound(JPanel display_panel) {
        this.based_panel =display_panel;
    }
    public  void mains(){
        based_panel.setLayout(new BorderLayout());
        based_panel.add(jSplitPane);
        jSplitPane.setDividerSize(2);// ���÷ָ��ߵĿ��
        jSplitPane.setDividerLocation(250);// �趨�ָ��ߵľ�����ߵ�λ��
        top.setBackground(Color.magenta);
    }

}
