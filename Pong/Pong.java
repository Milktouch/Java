/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

import java.awt.Color;
import javax.swing.JFrame;


public class Pong {

    private static JFrame frame ;
    
    public static void main(String[] args) {
       frame = new JFrame("Pong Game - Score : ");
       frame.setSize(600, 900);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GamePanel p = new GamePanel();
        p.setBackground(Color.yellow);
       frame.add(p);
       
       frame.setVisible(true);
        while (true) {            
            frame.repaint();
        }
    }
    public static JFrame getframe()
    {
        return frame;
    }
    
}
