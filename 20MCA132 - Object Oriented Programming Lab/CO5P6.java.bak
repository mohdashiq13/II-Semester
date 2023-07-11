import java.awt.event.*;
import java.awt.*;
import java.awt.Graphics;

public class CO5P6 extends Frame implements ItemListener{
	Choice ch;
	//Label la;
	int item;
	CO5P6(){
		//la = new Label();
		//la.setBounds(10,10,40,50);
		//la.setSize(100,100);
		ch = new Choice();
		ch.add("Select");
		ch.add("Rectangle");
		ch.add("Circle");
		ch.add("Square");
		ch.add("Triangle");
		ch.addItemListener(this);
		add(ch);
		//add(la,"North");
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
			}
		});
		setSize(400,400);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent e){
		item = ch.getSelectedIndex();
	}
	public void paint(Graphics g){
		int d1[] = {20,30,40};
		int d2[] = {100,20,100};
		if(item == 0){
			
		}
		else if(item == 1){
			g.setColor(Color.red);
			g.fillRect(70,100,30,50);
		}else if(item == 2){
			g.setColor(Color.red);
			g.fillArc(70,100,50,50,0,360);
		}else if(item == 3){
			g.setColor(Color.red);
			g.fillRect(70,100,30,30);
		}else{
			g.setColor(Color.red);
			g.drawPolygon(d1,d2,3);
		}
	}
	public static void main(String []args){
		new CO5P6();
	}
}