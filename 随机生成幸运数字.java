package chapter1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class ��������������� {

private JFrame frame;
private JTextField textField;
private JScrollPane scrollPane;
private JLabel label_1;
JTextArea textArea = new JTextArea();
private JTextArea textArea_1;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
��������������� window = new ���������������();
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
public ���������������() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame("�������������ȡ����ѧ��");
frame.setBounds(100, 100, 500, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JLabel label = new JLabel("ѧ������");
label.setBounds(10, 10, 132, 15);
frame.getContentPane().add(label);

textField = new JTextField();
textField.addKeyListener(new KeyAdapter() {
@Override
public void keyPressed(KeyEvent e) {
do_textField_keyPressed(e);
}
});
textField.setBounds(10, 35, 132, 21);
frame.getContentPane().add(textField);
textField.setColumns(10);

scrollPane = new JScrollPane();
scrollPane.setBounds(10, 66, 132, 185);
frame.getContentPane().add(scrollPane);

textArea_1 = new JTextArea();
scrollPane.setViewportView(textArea_1);

label_1 = new JLabel("LUCY STAR!");
label_1.setBounds(180, 10, 132, 15);
frame.getContentPane().add(label_1);


textArea.setBounds(180, 34, 214, 217);
frame.getContentPane().add(textArea);

JButton button = new JButton("\u62BD\u53D6");
button.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
do_button_actionPerformed(e);
}
});
button.setBounds(404, 187, 70, 23);
frame.getContentPane().add(button);

JButton button_1 = new JButton("\u9000\u51FA");
button_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
do_button_1_actionPerformed(e);
}
});
button_1.setBounds(404, 228, 70, 23);
frame.getContentPane().add(button_1);
}
protected void do_textField_keyPressed(KeyEvent e) {
if (e.getKeyChar() != '\n')// ���ǻس��ַ���������
return;
String name = textField.getText();
if (name.isEmpty())// ����ı���û���ַ�����������
return;
textArea_1.append(name + "\n");// ������������س�����ӵ���Ա�б�
textField.selectAll();// ѡ���ı��������ַ�
}
protected void do_button_actionPerformed(ActionEvent e) {
String perstring = textArea_1.getText();// ��ȡ��Ա�б��ı�
String[] personnelArray = perstring.split("\n{1,}");// ��ȡ��Ա����
int index = (int) (Math.random() * personnelArray.length);// ���������������
// ���������ʽ�������н���Ϣ
String formatArg = "���γ�ȡ������Ա��\n\t%1$s\n��ϲ%1$5s    ��Ϊ���ι��ڳ齱��\r\n�󽱵�����"
+ "\n\n���ǽ�Ϊ%1$5s    �䷢��\n\t���ڵ����̶�ʮ�䡣";
// Ϊ�н���Ϣ�����Ա����
String info = String.format(formatArg, personnelArray[index]);
textArea.setText(info);// ���ı�����ʾ�н���Ϣ
}
protected void do_button_1_actionPerformed(ActionEvent e) {
System.exit(0);
}
}
