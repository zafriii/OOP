// Fig. 6.11
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSmiley extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.lightGray);
        // draw the face
        g.fillOval(10, 10, 200, 200);
        g.setColor(Color.black);
        // draw the eyes
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);

        g.fillOval(50, 110, 120, 60); // draw the mouth

        // "touch up" the mouth into a smile
        g.setColor(Color.lightGray);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);

    }
}
