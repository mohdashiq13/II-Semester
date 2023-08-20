import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CO5P4 extends Frame {
    private Color doorColor = Color.BLUE;

    public CO5P4() {
        setTitle("House Drawing");
        setSize(400, 400);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (doorColor == Color.BLUE) {
                    doorColor = Color.RED;
                } else {
                    doorColor = Color.BLUE;
                }
                repaint();
            }
        });

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Draw the house
        g.setColor(Color.GREEN);
        g.fillRect(0, 250, 400, 150); // Grass
        g.setColor(Color.YELLOW);
        g.fillRect(100, 150, 200, 150); // House body
        g.setColor(Color.RED);
        g.fillRect(150, 200, 40, 40); // Window 1
        g.fillRect(250, 200, 40, 40); // Window 2
        g.setColor(doorColor);
        g.fillRect(180, 250, 80, 100); // Door
        g.setColor(Color.BLACK);
        g.drawLine(200, 100, 100, 150); // Left roof line
        g.drawLine(200, 100, 300, 150); // Right roof line
    }

    public static void main(String[] args) {
        new CO5P4();
    }
}
