//fig-4.18
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        g.drawLine(0, 0, width, height); // total width
        g.drawLine(0, height, width, 0); // total height
    }

}
