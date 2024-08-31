import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.RoundRectangle2D;
import java.util.Random;

public class Q6 extends Applet {
    private static final int NUM_SHAPES = 4;
    private static final int MIN_SIZE = 50;
    private static final int MAX_SIZE = 200;

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Get the dimensions of the applet's visible area
        int appletWidth = getWidth();
        int appletHeight = getHeight();

        Random random = new Random();

        for (int i = 0; i < NUM_SHAPES; i++) {
            int x = random.nextInt(appletWidth);
            int y = random.nextInt(appletHeight);
            int width = random.nextInt(MAX_SIZE - MIN_SIZE) + MIN_SIZE;
            int height = random.nextInt(MAX_SIZE - MIN_SIZE) + MIN_SIZE;

            // Generate a random color
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            g.setColor(color);

            // Draw a rectangle
            g.drawRect(x, y, width, height);

            // Draw a rounded rectangle
            RoundRectangle2D roundedRect = new RoundRectangle2D.Float(x, y + height + 10, width, height, 20, 20);
            g.draw(roundedRect);

            // Draw a 3D rectangle
            g.fill3DRect(x, y + (height * 2) + 20, width, height, true);

            // Draw a filled rectangle
            g.fillRect(x, y + (height * 3) + 30, width, height);
        }
    }
}
