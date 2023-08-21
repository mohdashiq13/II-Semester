import java.awt.*;
import java.awt.event.*;

public class CO5P8 extends Frame implements KeyListener {
    private Label messageLabel;
    public CO5P8() {
        setTitle("Key Event Example");
        setSize(400, 300);
        setLayout(new FlowLayout());

        messageLabel = new Label("Press a key...");
        add(messageLabel);

        addKeyListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        String keyText = KeyEvent.getKeyText(keyCode);
        messageLabel.setText("Key Pressed: " + keyText);
    }
    public void keyReleased(KeyEvent e) {
        messageLabel.setText("Press a key...");
    }
    public void keyTyped(KeyEvent e) {
        // This method is not used in this example
    }
    public static void main(String[] args) {
        new CO5P8();
    }
}
