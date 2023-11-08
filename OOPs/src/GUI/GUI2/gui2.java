package GUI.GUI2;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

class GUI{
    GUI(){
        JFrame frame=new JFrame();
        frame.setSize(300,200);
        frame.setTitle("MyApplication");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new FlowLayout());
        JLabel label=new JLabel("Enter your age");
        frame.add(label);

        JTextField tb=new JTextField(15);
        frame.add(tb);
        JPasswordField pwd=new JPasswordField(15);
        frame.add(pwd);
        JButton button=new JButton("Enter");
        frame.add(button);

        frame.setVisible(true);


    }
}
class Main{
    public static void main(String[] s){
        new GUI();
    }
}
