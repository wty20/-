package tySystem;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeThread implements Runnable {
    private String times = null;
    private final JPanel jPenel_west_up;
    private JTextArea time_According;
    Font T = new Font("Serif",1,21);


    public TimeThread(JPanel jPenel_west_up, JTextArea time_According2) {
        this.jPenel_west_up = jPenel_west_up;
        this.time_According =time_According2;
    }

    @Override
    public void run() {
        while (true){
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            times = df.format(new Date());// new Date()为获取当前系统时间
            time_According.setFont(T);
            time_According.setText("> "+times);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public void time_string() {

        jPenel_west_up.add(time_According);
        time_According.setBounds(60,160,220,30);
        time_According.setEditable(false);

    }
}
