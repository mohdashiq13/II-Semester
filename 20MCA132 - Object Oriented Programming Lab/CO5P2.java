import java.awt.*;
import java.awt.event.*;
public class CO5P2 extends Frame{
	CO5P2(){
		TextField text = new TextField();
		text.setBounds(50,100,200,30);
		add(text);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
			}
		});
		setVisible(true);
		setSize(500, 500);
	}
	public static void main(String []args){  
		new CO5P2();
	}
}