import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main  {
    private static JFrame frame;
    private static JPanel panel;
    private static JTextField textField;
    private static JButton button1;
    private static JButton button2;
    private static JButton button3;
    private static JButton button4;
    private static JButton button5;
    private static JButton button6;
    private static JButton button7;
    private static JButton button8;
    private static JButton button9;
    private static JButton button10;
    private static JButton button11;
    private static JButton button12;
    private static JButton button13;
    private static JButton button14;
    private static JButton button15;
    private static JButton button16;

    public static void main(String[] args){

        frame = new JFrame();
        frame.setSize(450,420);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.setResizable(false);
        //frame.setLocation(500,250);

        panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        textField = new JTextField();
        textField.setBounds(235,40,170,30);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false );

        panel.add(textField);

        button1 = new JButton("1");
        button1.setBounds(35,105,70,40);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button1) {
                    String bt1 = textField.getText() + button1.getText();
                    textField.setText(bt1);
                }
            }
        });
        panel.add(button1);

        button2 = new JButton("2");
        button2.setBounds(135,105,70,40);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button2) {
                    String bt2 = textField.getText() + button2.getText();
                    textField.setText(bt2);
                }

            }
        });
        panel.add(button2);

        button3 = new JButton("3");
        button3.setBounds(235,105,70,40);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt3 = textField.getText() + button3.getText();
                textField.setText(bt3);

            }
        });
        panel.add(button3);

        button4 = new JButton("+");
        button4.setBounds(335,105,70,40);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt4 = textField.getText() + button4.getText();
                textField.setText(bt4);

            }
        });
        panel.add(button4);

        button5 = new JButton("4");
        button5.setBounds(35,175,70,40);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt5 = textField.getText() + button5.getText();
                textField.setText(bt5);

            }
        });
        panel.add(button5);

        button6 = new JButton("5");
        button6.setBounds(135,175,70,40);
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt6 = textField.getText() + button6.getText();
                textField.setText(bt6);

            }
        });
        panel.add(button6);

        button7 = new JButton("6");
        button7.setBounds(235,175,70,40);
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt7 = textField.getText() + button7.getText();
                textField.setText(bt7);

            }
        });
        panel.add(button7);

        button8 = new JButton("-");
        button8.setBounds(335,175,70,40);
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt8 = textField.getText() + button8.getText();
                textField.setText(bt8);

            }
        });
        panel.add(button8);

        button9 = new JButton("7");
        button9.setBounds(35,245,70,40);
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt9 = textField.getText() + button9.getText();
                textField.setText(bt9);

            }
        });
        panel.add(button9);

        button10 = new JButton("8");
        button10.setBounds(135,245,70,40);
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt10 = textField.getText() + button10.getText();
                textField.setText(bt10);

            }
        });
        panel.add(button10);

        button11 = new JButton("9");
        button11.setBounds(235,245,70,40);
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt11 = textField.getText() + button11.getText();
                textField.setText(bt11);

            }
        });
        panel.add(button11);

        button12 = new JButton("*");
        button12.setBounds(335,245,70,40);
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt12 = textField.getText() + button12.getText();
                textField.setText(bt12);

            }
        });
        panel.add(button12);

        button13 = new JButton("0");
        button13.setBounds(35,315,70,40);
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt13 = textField.getText() + button13.getText();
                textField.setText(bt13);

            }
        });
        panel.add(button13);

        button14 = new JButton("Clear");
        button14.setBounds(135,315,70,40);
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        panel.add(button14);

        button15 = new JButton("=");
        button15.setBounds(235,315,70,40);
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptEngineManager mgr = new ScriptEngineManager();
                ScriptEngine engine = mgr.getEngineByName("JavaScript");
                String foo = textField.getText();
                try {
                    System.out.println(engine.eval(foo));
                    var t = engine.eval(foo);
                    String s = t.toString();
                    //int x = (int) engine.eval(foo);
                     //System.out.println(x);
                     //String s = Integer.toString(x);
                    String x = foo +button15.getText()+s;
                     textField.setText(x);
                } catch (ScriptException scriptException) {
                    //scriptException.printStackTrace();
                }
            }
        });
        panel.add(button15);

        button16 = new JButton("/");
        button16.setBounds(335,315,70,40);
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt16 = textField.getText() + button16.getText();
                textField.setText(bt16);

            }
        });
        panel.add(button16);





        frame.setVisible(true);

    }


}
