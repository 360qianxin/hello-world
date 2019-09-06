package chapter1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class ������ extends JFrame { // �̳д�����JFrame
/**
*
*/
private static final long serialVersionUID = 6626440733001287873L;
private JTextField textField;

public static void main(String args[]) {
try {
UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
} catch (Throwable e) {
e.printStackTrace();
}
������ frame = new ������();
frame.setVisible(true); // ���ô���ɼ���Ĭ��Ϊ���ɼ�
}

public ������() {
super(); // �̳и���Ĺ��췽��
BorderLayout borderLayout = (BorderLayout) getContentPane().getLayout();
borderLayout.setHgap(20);
borderLayout.setVgap(10);
setTitle("��ť����ʵ�ּ��������� "); // ���ô���ı���
setBounds(100, 100, 290, 282); // ���ô������ʾλ�ü���С
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô���رհ�ť�Ķ���Ϊ�˳�
textField = new JTextField();
textField.setHorizontalAlignment(SwingConstants.TRAILING);
textField.setPreferredSize(new Dimension(12, 50));
getContentPane().add(textField, BorderLayout.NORTH);
textField.setColumns(10);
final GridLayout gridLayout = new GridLayout(4, 0); // �������񲼾ֹ���������
gridLayout.setHgap(5); // ���������ˮƽ���
gridLayout.setVgap(5); // ��������Ĵ�ֱ���
JPanel panel = new JPanel(); // �����������
panel.setLayout(gridLayout); // ���������������񲼾ֹ�����
getContentPane().add(panel, BorderLayout.CENTER);
String[][] names = { { "1", "2", "3", "��" }, { "4", "5", "6", "��" }, { "7", "8", "9", "��" }, { ".", "0", "=", "��" } };
JButton[][] buttons = new JButton[4][4];
for (int row = 0; row < names.length; row++) {
for (int col = 0; col < names.length; col++) {
buttons[row][col] = new JButton(names[row][col]); // ������ť����
buttons[row][col].addActionListener(new ActionListener() {

@Override
public void actionPerformed(ActionEvent e) {
JButton button = (JButton) e.getSource();
String text = textField.getText();
textField.setText(text + button.getText());
}
});
panel.add(buttons[row][col]); // ����ť��ӵ������
}
}
}

}
