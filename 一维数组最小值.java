package chapter1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class 一维数组最小值 {

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
一维数组最小值 window = new 一维数组最小值();
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
public 一维数组最小值() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame("获取一维数组最小值");
frame.setBounds(100, 100, 450, 150);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JLabel lblNewLabel = new JLabel("请在文本框中输入多个自然数，以空格为分隔符。例如：3 5 2 562 125");
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
String arrayStr = textField.getText().trim(); //去除左右空格
if(arrayStr.equals("")){
JOptionPane.showMessageDialog(null, "请输入数字内容");
return;
}
for (int i = 0; i < arrayStr.length(); i++) { // 过滤非法输入
char charAt = arrayStr.charAt(i);
if (!Character.isDigit(charAt) && charAt != ' ') {
JOptionPane.showMessageDialog(null, "输入包含非数字内容");
textField.setText("");
return;
}
}
String[] numStrs = arrayStr.split(" {1,}"); // 分割字符串
int[] numArray = new int[numStrs.length]; // 创建整型数组
// 转换输入为整型数组
for (int i = 0; i < numArray.length; i++) {
numArray[i] = Integer.valueOf(numStrs[i]);
}
int min = numArray[0]; // 创建最小数变量
for (int j = 0; j < numArray.length; j++) {
if (min > numArray[j]) { // 提取最小整数
min = numArray[j];
}
}
lblNewLabel_1.setText("数组中最小的数是：" + min); //显示最小值到指定的标签中
}
}