import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CO5P7 extends Frame implements MouseListener {
    Label text1, text2, text4;
    public CO5P7(){
        text1 = new Label();
        text2 = new Label();
        text4 = new Label();
        text1.setBounds(50,50, 60,20);
        text2.setBounds(50,80, 60,20);
        text4.setBounds(50,110, 60,20);
        add(text1);
        add(text2);
        add(text4);
        addMouseListener(this);
        // Window Closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        // Configuration
        setSize(400,500);
        setLayout(new FlowLayout());
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e) {
        text1.setText("Mouse is Clicked");
    }
    public void mouseEntered(MouseEvent e) {
        text2.setText("Mouse has Entered");
    }
    public void mouseExited(MouseEvent e) {
        text2.setText("Mouse has Excited");
    }
    public void mousePressed(MouseEvent e) {
        text4.setText("Mouse is Pressed");
    }
    public void mouseReleased(MouseEvent e) {
        text4.setText("Mouse is Released");
    }
    public static void main(String[] args) {
        new CO5P7();
    }
}
