package chapter1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class һά������Сֵ {

private JFrame frame;
private JTextField textField;
JLabel lblNewLabel_1 = new JLabel();
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
һά������Сֵ window = new һά������Сֵ();
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the application.
*/
public һά������Сֵ() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame("��ȡһά������Сֵ");
frame.setBounds(100, 100, 450, 150);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JLabel lblNewLabel = new JLabel("�����ı�������������Ȼ�����Կո�Ϊ�ָ��������磺3 5 2 562 125");
lblNewLabel.setBounds(10, 10, 414, 15);
frame.getContentPane().add(lblNewLabel);

textField = new JTextField();
textField.setBounds(10, 35, 414, 21);
frame.getContentPane().add(textField);
textField.setColumns(10);
lblNewLabel_1.setBounds(115, 70, 309, 15);
frame.getContentPane().add(lblNewLabel_1);
JButton button = new JButton("\u8BA1\u7B97");
button.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
do_button_actionPerformed(e);
}
});
button.setBounds(10, 66, 93, 23);
frame.getContentPane().add(button);
}
protected void do_button_actionPerformed(ActionEvent e) {
String arrayStr = textField.getText().trim(); //ȥ�����ҿո�
if(arrayStr.equals("")){
JOptionPane.showMessageDialog(null, "��������������");
return;
}
for (int i = 0; i < arrayStr.length(); i++) { // ���˷Ƿ�����
char charAt = arrayStr.charAt(i);
if (!Character.isDigit(charAt) && charAt != ' ') {
JOptionPane.showMessageDialog(null, "�����������������");
textField.setText("");
return;
}
}
String[] numStrs = arrayStr.split(" {1,}"); // �ָ��ַ���
int[] numArray = new int[numStrs.length]; // ������������
// ת������Ϊ��������
for (int i = 0; i < numArray.length; i++) {
numArray[i] = Integer.valueOf(numStrs[i]);
}
int min = numArray[0]; // ������С������
for (int j = 0; j < numArray.length; j++) {
if (min > numArray[j]) { // ��ȡ��С����
min = numArray[j];
}
}
lblNewLabel_1.setText("��������С�����ǣ�" + min); //��ʾ��Сֵ��ָ���ı�ǩ��
}
}