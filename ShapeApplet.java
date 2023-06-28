import java.awt.*;
import java.applet.*;

public class ShapeApplet extends Applet {
    public void paint(Graphics g) {
        // Set the background color
        setBackground(Color.WHITE);

        // Set the shape colors
        Color rectangleColor = Color.RED;
        Color circleColor = Color.BLUE;
        Color triangleColor = Color.GREEN;

        // Draw a rectangle
        g.setColor(rectangleColor);
        g.fillRect(50, 50, 100, 80);

        // Draw a circle
        g.setColor(circleColor);
        g.fillOval(200, 50, 100, 100);

        // Draw a triangle
        g.setColor(triangleColor);
        int[] xPoints = { 350, 400, 450 };
        int[] yPoints = { 150, 50, 150 };
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
