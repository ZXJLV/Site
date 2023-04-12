package test;

import javax.swing.*;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

        // 创建一个随机数生成器
        Random random = new Random();

        // 创建一个循环，每隔一秒弹出一个窗口
        while (true) {
            // 生成一个随机的位置坐标
            int x = random.nextInt(1000);
            int y = random.nextInt(800);

            // 创建一个新的窗口
            JFrame frame = new JFrame("Popup Window");
            frame.setSize(200, 100);
            frame.setLocation(x, y);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            // 在窗口中添加一些文本
            JLabel label = new JLabel("Hello, this is a popup window!");
            label.setHorizontalAlignment(SwingConstants.CENTER);
            frame.add(label);

            // 显示窗口
            frame.setVisible(true);

            // 等待一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
