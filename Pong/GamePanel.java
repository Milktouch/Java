package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements KeyListener {

    private Ball the_ball;
    private Bat the_bat;
    private Timer ball_timer;
    private int deltaX, deltaY, score, hp;

    public GamePanel() {
        score = 0;
        hp = 3;
        setBackground(Color.yellow);
        setVisible(true);
        deltaX = deltaY = 0;

        addKeyListener(this);
        setFocusable(true);
        //the_ball = new Ball(this.WIDTH / 2, this.HEIGHT / 2, WIDTH * HEIGHT / 10000, Color.RED);
        //the_bat = new Bat(the_ball.x - the_ball.width, this.HEIGHT - 25, the_ball.width * 2, the_ball.width, Color.blue);
        the_ball = new Ball(300, 300, 50, Color.RED);
        the_bat = new Bat();
        ball_timer = new Timer(30, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (deltaX == 0 && deltaY == 0) {
                    //deltaX = new Random().nextInt(10) + 5;
                    // deltaY = new Random().nextInt(10) + 5 * (-1);
                    deltaX = 15;
                    deltaY = -15;
                } else if (the_ball.x > getpanel().getWidth() || the_ball.x < 0) {
                    deltaX *= (-1);
                } else if (the_ball.y < 0) {
                    deltaY *= (-1);
                } else if (the_ball.y > the_bat.y) {
                    if (hp > 0) {
                        hp--;
                        deltaY *= (-1);
                        the_ball = new Ball(300, 300, 50, Color.RED);
                    }
                    else
                    {
                        ball_timer.stop();
                        int user_result=JOptionPane.showConfirmDialog(getpanel(),"Do you want to Restart?" ,"Game Over!" , JOptionPane.YES_NO_OPTION);
                        if(user_result==0)
                        {
                            
                            the_ball = new Ball(300, 300, 50, Color.RED);
                            ball_timer.start();
                            score=0;
                            hp=3;
                            Pong.getframe().setTitle("Pong Game - Score : " + String.valueOf(score) + "  HP : " + String.valueOf(hp));

                        }
                        else
                        {
                            getpanel().setVisible(false);
                            Pong.getframe().dispatchEvent(new WindowEvent(Pong.getframe(), 
                                    WindowEvent.WINDOW_CLOSING));
                        }
                        
                    }
                } else if (the_ball.intersects(the_bat)) {
                    deltaY *= (-1);
                    score++;
                }

                Pong.getframe().setTitle("Pong Game - Score : " + String.valueOf(score) + "  HP : " + String.valueOf(hp));

                the_ball.moveBall(deltaX, deltaY);
            }
        });
        ball_timer.start();
    }

    public GamePanel getpanel() {
        return this;
    }

    @Override
    public void paint(Graphics g) {

        the_ball.paint(g);
        the_bat.paint(g);
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            the_bat.move(-15);
        } else if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            the_bat.move(15);

        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
}
