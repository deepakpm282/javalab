package GUI;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GUI extends JFrame implements ActionListener{
    GUI(){
        setSize(400,300);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("My Application");
        setLayout(new FlowLayout());

        JLabel label=new JLabel("Username");
        add(label);

        JTextField textbox=new JTextField(25);
        add(textbox);

        JLabel password=new JLabel("Password");
        add(password);

        JPasswordField pwd=new JPasswordField(25);
        add(pwd);

        JButton button=new JButton("Enter");
        add(button);

        button.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        JLabel label_2=new JLabel("Button Clicked..");
        //System.out.println("Button Clicked..");
        add(label_2);
        revalidate();
    }
}

class Main{
    public static void main(String[] s){
        new GUI();
    }
}