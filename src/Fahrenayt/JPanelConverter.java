package Fahrenayt;

import javax.swing.*;
import java.awt.event.*;

public class JPanelConverter extends JPanel {
    
    private JLabel celciusLabel, fahrenheitLbel;
    private JTextField celciusTextField, fahrenheitTextField;
    private JRadioButton celciusBtn, fahrenheitBtn;
    private JButton convertBtn;
    
    public JPanelConverter() {
        
        celciusLabel = new JLabel("Celcius: ");
        fahrenheitLbel = new JLabel("Fahrenheit: ");
        celciusTextField = new JTextField(10);
        fahrenheitTextField = new JTextField(10);
        celciusBtn = new JRadioButton("To Celcius");
        fahrenheitBtn = new JRadioButton("To Fahrenheit");
        convertBtn = new JButton("Convert");
        convertBtn.addActionListener(new ButtonListener());
        
        add(celciusLabel);
        add(celciusTextField);
        add(fahrenheitLbel);
        add(fahrenheitTextField);
        add(celciusBtn);
        add(fahrenheitBtn);
        add(convertBtn);
    }

    
    private class ButtonListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
        
            if(celciusBtn.isSelected() && fahrenheitBtn.isSelected()) {
                celciusTextField.setText("Plese selec just one thing");
                fahrenheitTextField.setText("Plese selec just one thing");
            
            } else if(celciusBtn.isSelected()) {
                convert();
            } else if(fahrenheitBtn.isSelected()) {
                convert();
            } else {
                // selection haven't make
            }
        }
    }
    
    public void convert() {
        int celciusInt, fahrenheitInt;
        String text;
        
        if(celciusBtn.isSelected()) {
            // convert to celcius
            // (°F  -  32)  x  5/9 = °C
            text = fahrenheitTextField.getText();
            if(text != "") {
                fahrenheitInt = Integer.parseInt(text);
                celciusInt = (fahrenheitInt - 32) * 5/9;
                celciusTextField.setText(Integer.toString(celciusInt));
            }
            
        } else {
            // convert to fahrenheit
            // °C  x  9/5 + 32 = °F
            text = celciusTextField.getText();
            if(text != "") {
                celciusInt = Integer.parseInt(text);
                fahrenheitInt = celciusInt * 9/5 + 32;
                fahrenheitTextField.setText(Integer.toString(fahrenheitInt));
            }
        }
    }
    
    
}
