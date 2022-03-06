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
public class Ball extends Rectangle{//ball class for pong application
    
    private Color ball_color;

    public Ball() {
        super();
        x = 250;
        y = 500;
        width = 25;
        ball_color = Color.BLACK;
    }

    public Ball(int x, int y, int r, Color clr) {
        super(x,y,r,r);
        this.ball_color = clr;
    }
    
    public void moveBall(int deltaX,int deltaY)
    {
        this.x +=deltaX;
        this.y +=deltaY;
    }
    
    public void paint(Graphics board)
    {
        board.setColor(ball_color);
        board.drawOval(x, y, width, width);
        board.fillOval(x, y, width, width);
    }
}   
