/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method2;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Runner {
    
    private static JFrame frame ;
    private static JPanel panel;
    public static void main(String [] args){
        frame = new JFrame("Method2");
        frame.setSize(600, 600);
        panel = new JPanel();
        panel.setLayout(new GridLayout(10, 5));
        panel.setBackground(Color.yellow);
        JTextField tf = new JTextField("");
        for (int i = 0; i < 50; i++) {
            
            panel.add(new JLabel(""));
            if(i==6)
                panel.add(new JLabel("Enter Your Name : "));
            if(i==7)
            {   
                
                panel.add(tf);
            }
            if(i==10)
            {
                JButton btn = new JButton("Click To Send");
                btn.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        JOptionPane.showMessageDialog(frame,
                "the name entered was : "+
                tf.getText());
                    }
                });
                panel.add(btn);
            }
        }
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
    }
}
