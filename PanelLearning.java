import javax.swing.*;
import java.awt.*;

public class PanelLearning {
    JFrame jFrame;

    PanelLearning()
    {
        jFrame = new JFrame("Panel Learning");
        jFrame.setBounds(100,100,500,700);
        MyPanel panel= new MyPanel();
        panel.setBackground(Color.black);
        jFrame.add(panel);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        PanelLearning p = new PanelLearning();
    }
}
