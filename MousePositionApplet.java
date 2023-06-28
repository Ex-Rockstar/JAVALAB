import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class MousePositionApplet extends Applet implements MouseMotionListener {
    int mouseX, mouseY; // Variables to store the mouse position

    public void init() {
        addMouseMotionListener(this);
    }

    public void paint(Graphics g) {
        g.drawString("Mouse X: " + mouseX, 10, 20); // Display x position
        g.drawString("Mouse Y: " + mouseY, 10, 40); // Display y position
    }

    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX(); // Get x position
        mouseY = e.getY(); // Get y position
        repaint(); // Refresh the applet to display updated positions
    }

    public void mouseDragged(MouseEvent e) {
        // Do nothing for mouse dragging event
    }
}
