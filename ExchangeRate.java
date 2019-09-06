package chapter1;

import java.applet.Applet;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ExchangeRate extends Applet{
    
    Choice ce1,ce2;//Ñ¡Ôñ²Ëµ¥
    TextField tf1,tf2,tf3,tf4;
    Label lab;
    
    public void init(){
        setSize(300,200);
        setBackground(Color.pink);
        setVisible(true);
        setLayout(null);
        
        lab = new Label("Exchange Rate");
        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();
        tf4 = new TextField();
        ce1 = new Choice();
        ce2 = new Choice();
        
        add(lab);
        add(tf1);add(tf2);add(tf3);add(tf4);
        add(ce1);add(ce2);
        ce1.add("RMB");ce1.add("Dollar");ce1.add("Pound");ce1.add("Jpy");
        ce2.add("RMB");ce2.add("Dollar");ce2.add("Pound");ce2.add("Jpy");
        ce1.setBounds(20, 20,50,30);
        ce2.setBounds(20, 100,50,30);
        tf1.setBounds(100, 20, 120, 20);
        tf2.setBounds(100, 100, 120, 20);
        tf3.setBounds(100, 60, 120, 20);
        lab.setBounds(10, 60, 90, 30);
        
        tf2.setEditable(false);
        tf3.setEditable(false);
        ce1.addItemListener(new itr1());
        ce2.addItemListener(new itr1());
    }
    
    class itr1 implements ItemListener{
        public void itemStateChanged(ItemEvent e){

            double n2 = Double.parseDouble(tf1.getText());
            if(n2 != 0){
                if(ce1.getSelectedIndex() == 0){
                    if(ce2.getSelectedIndex() == 0){
                        tf2.setText(""+(n2*1));
                        tf3.setText("1.000");
                    }
                    if(ce2.getSelectedIndex() == 1){
                        tf2.setText(""+(n2*1/6.35));
                        tf3.setText("1/6.35");
                    }
                    if(ce2.getSelectedIndex() == 2){
                        tf2.setText(""+(n2*1/9.64));
                        tf3.setText("1/9.64");
                    }
                    if(ce2.getSelectedIndex() == 3){
                        tf2.setText(""+(n2*1/0.0526));
                        tf3.setText("1/0.0526");
                    }
                }
                if(ce1.getSelectedIndex() == 1){
                    if(ce2.getSelectedIndex() == 0){
                            tf2.setText(""+(n2*6.35));
                            tf3.setText("6.350");
                        }
                        if(ce2.getSelectedIndex() == 1){
                            tf2.setText(""+(n2*1));
                            tf3.setText("1.000");
                        }
                        if(ce2.getSelectedIndex() == 2){
                            tf2.setText(""+(n2*(6.35/9.64)));
                            tf3.setText("6.35/9.64");
                        }
                        if(ce2.getSelectedIndex() == 3){
                            tf2.setText(""+(n2*(6.350/0.0526)));
                            tf3.setText("6.35/0.0526");
                        }
                }
                if(ce1.getSelectedIndex() == 2){
                    if(ce2.getSelectedIndex() == 0){
                            tf2.setText(""+(n2*9.64));
                            tf3.setText("9.640");
                        }
                        if(ce2.getSelectedIndex() == 1){
                            tf2.setText(""+(n2*(9.64/6.35)));
                            tf3.setText("9.64/6.35");
                        }
                        if(ce2.getSelectedIndex() == 2){
                            tf2.setText(""+(n2*1));
                            tf3.setText("1.000");
                        }
                        if(ce2.getSelectedIndex() == 2){
                            tf2.setText(""+(n2*(9.64/0.0526)));
                            tf3.setText("9.64/0.0526");
                        }
                }
                if(ce1.getSelectedIndex() == 3){
                    if(ce2.getSelectedIndex() == 0){
                            tf2.setText(""+(n2*0.0526));
                            tf3.setText("0.0526");
                        }
                        if(ce2.getSelectedIndex() == 1){
                            tf2.setText(""+(n2*(0.0526/6.35)));
                            tf3.setText("00.0526/6.35");
                        }
                        if(ce2.getSelectedIndex() == 2){
                            tf2.setText(""+(n2*(0.0526/9.64)));
                            tf3.setText("0.0526/9.64");
                        }
                        if(ce2.getSelectedIndex() == 3){
                            tf2.setText(""+(n2*1));
                            tf3.setText("1.000");
                        }
                }
            }else{
                tf2.setText(""+0);
            }
        }
    }
}
