package chapter1;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author caojiantao-ext �ô���չ�ֹ������������
 */
public class �������� {

    public static void main(String[] args) {
        JFrame frame = new JFrame("��������");
        frame.setSize(415, 435);
        // ��������Ϊ20*20
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                JLabel label = new JLabel();
                label.setSize(20,20);
                label.setBackground(((i + j) % 2 == 0) ? Color.BLACK
                        : Color.white);
                label.setLocation(20 * i, 20 * j);
                // ���ò�͸����Ҫ��Ȼ������ʾ
                label.setOpaque(true);
                frame.add(label);
            }
        }
        // ���������ʾ
        frame.setLocationRelativeTo(null);
        // �����ڹرճ������
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // չʾ����
        frame.setVisible(true);
    }
}
