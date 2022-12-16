import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    int speedx = 10;
    int speedy = 10;
    int x = 10;
    int y = 10;


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.white);
        g.fillRect(x, y, 100, 50);
        if(x>=400 || x<=0) {
            speedx = -speedx;
        }
        if(y>=650 || y<=0)
        {
            speedy = -speedy;
        }
        x += speedx;
        y += speedy;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        repaint();
    }
}
