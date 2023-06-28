import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PaintBrushApplet extends Applet implements MouseMotionListener {
    private int prevX, prevY; // Previous coordinates
    private boolean isDrawing; // Flag to track if the mouse is being dragged

    private int mouseX, mouseY; // Current mouse coordinates

    public void init() {
        addMouseMotionListener(this);
    }

    public void paint(Graphics g) {
        // Set the brush color to black
        g.setColor(Color.BLACK);

        // Draw a line from the previous coordinates to the current coordinates
        if (isDrawing) {
            g.drawLine(prevX, prevY, mouseX, mouseY);
        }
    }

    public void mouseMoved(MouseEvent e) {
        // Do nothing for mouse movement event
    }

    public void mouseDragged(MouseEvent e) {
        // Get the current coordinates of the mouse
        mouseX = e.getX();
        mouseY = e.getY();

        // Set the flag to indicate that the mouse is being dragged
        isDrawing = true;

        // Update the previous coordinates with the current coordinates
        prevX = mouseX;
        prevY = mouseY;

        // Repaint the applet to update the drawing
        repaint();
    }
}
