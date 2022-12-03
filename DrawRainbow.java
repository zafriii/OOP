// Fig. 7.25
// Drawing a rainbow using arcs and an array of colors.
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawRainbow extends JPanel {

  // colors to use in the rainbow, starting from the innermost
  // The two white entries result in an empty arc in the center

  private Color[] colors = { Color.PINK, Color.lightGray, Color.blue,
      Color.GREEN, Color.yellow, Color.orange, Color.red };

  public DrawRainbow() {
    setBackground(Color.WHITE); // set the background to white
  }

  // draws a rainbow using concentric arcs
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    int radius = 20; // radius of an arc
    // draw the rainbow near the bottom-center
    int centerX = getWidth() / 2;
    int centerY = getHeight() - 10;

    // draws filled arcs starting with the outermost
    for (int counter = colors.length; counter > 0; counter--) {
      // set the color for the current arc
      g.setColor(colors[counter - 1]);

      // fill the arc from 0 to 180 degrees
      g.fillArc(centerX - counter * radius,
          centerY - counter * radius,
          counter * radius * 2, counter * radius * 2, 0, 360);

    }

  }

}
