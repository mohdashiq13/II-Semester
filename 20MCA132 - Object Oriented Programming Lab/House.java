import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

public class House extends Frame{
	private Color doorColor = Color.red;
	public House(){
		addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				doorColor = Color.blue;
				repaint(); 
			}
		});
		
		setSize(400,400);
		//setLayout(null);
		setVisible(true);
		
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
			}
		});
	}
	
	public void paint(Graphics g){
     	g.setColor(Color.magenta);
		g.fillRect(100,150,200,200);
		g.setColor(doorColor);
		g.fillRect(175,280,50,70);
	}
	
	public static void main(String []args){
		House h = new House();
	}	
}