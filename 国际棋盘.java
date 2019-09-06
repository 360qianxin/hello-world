package chapter1;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author caojiantao-ext 用窗体展现国际象棋的棋盘
 */
public class 国际棋盘 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("国际象棋");
        frame.setSize(415, 435);
        // 假设棋盘为20*20
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                JLabel label = new JLabel();
                label.setSize(20,20);
                label.setBackground(((i + j) % 2 == 0) ? Color.BLACK
                        : Color.white);
                label.setLocation(20 * i, 20 * j);
                // 设置不透明，要不然不会显示
                label.setOpaque(true);
                frame.add(label);
            }
        }
        // 窗体居中显示
        frame.setLocationRelativeTo(null);
        // 当窗口关闭程序结束
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 展示棋盘
        frame.setVisible(true);
    }
}
