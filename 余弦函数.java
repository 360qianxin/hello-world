package chapter1;
import java.applet.*;
import java.awt.Graphics;

/**
 * @author caojiantao-ext 画余弦函数
 */
public class 余弦函数 extends Applet {

    /**
     * 重写resize函数，改变applet窗体大小
     */
    @Override
    public void resize(int arg0, int arg1) {
        // TODO Auto-generated method stub
        super.resize(800, 600);
    }

    /**
     * 重写paint，画点成线，特别注意比例的转换（自己计算）
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // 画x轴
        g.drawLine(50, 300, 750, 300);
        // 画y轴
        g.drawLine(400, 50, 400, 550);
        // 画坐标轴箭头
        g.drawLine(735, 290, 750, 300);
        g.drawLine(735, 310, 750, 300);
        g.drawLine(390, 65, 400, 50);
        g.drawLine(410, 65, 400, 50);
        // 计算缩放比例
        double d = 150.0 / (Math.PI);
        // 画cos曲线
        int x, y;
        for (x = 100; x <= 700; x++) {
            // 特别注意这里的sin(PI)不等于0，浮点通病
            double a = Math.sin((x - 400) / d);
            // 绘余弦函数
            // double a = Math.cos((x - 400) / d);
            y = (int) (a * d);
            // 注意坐标转换
            g.drawString("·", x, 300 - y);
        }
    }
}
