package chapter1;
import java.applet.*;
import java.awt.Graphics;

/**
 * @author caojiantao-ext �����Һ���
 */
public class ���Һ��� extends Applet {

    /**
     * ��дresize�������ı�applet�����С
     */
    @Override
    public void resize(int arg0, int arg1) {
        // TODO Auto-generated method stub
        super.resize(800, 600);
    }

    /**
     * ��дpaint��������ߣ��ر�ע�������ת�����Լ����㣩
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // ��x��
        g.drawLine(50, 300, 750, 300);
        // ��y��
        g.drawLine(400, 50, 400, 550);
        // ���������ͷ
        g.drawLine(735, 290, 750, 300);
        g.drawLine(735, 310, 750, 300);
        g.drawLine(390, 65, 400, 50);
        g.drawLine(410, 65, 400, 50);
        // �������ű���
        double d = 150.0 / (Math.PI);
        // ��cos����
        int x, y;
        for (x = 100; x <= 700; x++) {
            // �ر�ע�������sin(PI)������0������ͨ��
            double a = Math.sin((x - 400) / d);
            // �����Һ���
            // double a = Math.cos((x - 400) / d);
            y = (int) (a * d);
            // ע������ת��
            g.drawString("��", x, 300 - y);
        }
    }
}
