/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author User
 */
public class Bat extends Rectangle {

    private Color bat_color;

    public Bat() {
        super();
        x = 300;
        y = 800;
        width = 150;
        height = 25;
        bat_color = Color.BLACK;
    }

    public Bat(int x, int y, int w, int h,
            Color clr) {
        
        super(x,y,w,h);
        this.bat_color = clr;
    }
    
    public void move(int deltaX)
    {
        this.x+=deltaX;
    }
    
    public void paint(Graphics board)
    {
        board.setColor(bat_color);
        board.drawRect(x, y, width, height);
        board.fillRect(x, y, width, height);
    }
}
