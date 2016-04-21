package Fahrenayt;

import javax.swing.*;

public class MainConverter extends JFrame {
    
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Converter");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanelConverter jpConverter = new JPanelConverter();
        jFrame.getContentPane();
        jFrame.add(jpConverter);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}