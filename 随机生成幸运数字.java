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

public class 随机生成幸运数字 {

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
随机生成幸运数字 window = new 随机生成幸运数字();
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
public 随机生成幸运数字() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame("利用数组随机抽取幸运学生");
frame.setBounds(100, 100, 500, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JLabel label = new JLabel("学生名单");
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
if (e.getKeyChar() != '\n')// 不是回车字符不做处理
return;
String name = textField.getText();
if (name.isEmpty())// 如果文本框没有字符串不做处理
return;
textArea_1.append(name + "\n");// 把输入人名与回车符添加到人员列表
textField.selectAll();// 选择文本框所有字符
}
protected void do_button_actionPerformed(ActionEvent e) {
String perstring = textArea_1.getText();// 获取人员列表文本
String[] personnelArray = perstring.split("\n{1,}");// 获取人员数组
int index = (int) (Math.random() * personnelArray.length);// 生成随机数组索引
// 定义包含格式参数的中奖信息
String formatArg = "本次抽取观众人员：\n\t%1$s\n恭喜%1$5s    成为本次观众抽奖的\r\n大奖得主。"
+ "\n\n我们将为%1$5s    颁发：\n\t过期的酸奶二十箱。";
// 为中奖信息添加人员参数
String info = String.format(formatArg, personnelArray[index]);
textArea.setText(info);// 在文本域显示中奖信息
}
protected void do_button_1_actionPerformed(ActionEvent e) {
System.exit(0);
}
}
