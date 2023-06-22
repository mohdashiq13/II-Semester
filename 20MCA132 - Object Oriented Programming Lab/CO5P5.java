import java.awt.*;
import java.awt.event.*;

public class CO5P5 extends Frame implements ActionListener{
	String numbers[] = {"1","2","3","-",
						"4","5","6","+",
						"7","8","9","*",
						"0","C","=","/"};
	TextField text;
	String act;
	int num1, num2, result;
	CO5P5(){
		Button btn[] = new Button[16];
		Panel panel = new Panel();
		panel.setLayout(new GridLayout(4,4));
		text = new TextField();
		text.setFont(new Font("Arial Black", Font.BOLD, 20));
		
		for(int i=0; i<16; i++){
			btn[i] = new Button(numbers[i]);
			btn[i].addActionListener(this);
			panel.add(btn[i]);
		}
		
		add(text,"North");
		add(panel);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
			}
		});
		
		setTitle("Calculator");
		setSize(400, 500);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		String s = e.getActionCommand();
		
		if(s == "+" || s == "-" || s == "*" || s == "/"){
			act = s;
			num1 = Integer.parseInt(text.getText());
			text.setText("");
		}else if(s == "C"){
			text.setText("");
			num1 = 0;
			num2 = 0;
			result = 0;
		}else if(s == "="){
			num2 = Integer.parseInt(text.getText());
			switch(act){
				case "+": result = num1+num2;
						  break;
				case "-": result = num1-num2;
						  break;
				case "*": result = num1*num2;
						  break;
				case "/": result = num1/num2;
						  break;
			}
			text.setText(String.valueOf(result));
		}else{
			text.setText(text.getText() + s);
		}
	}
	
	public static void main(String []args){
		CO5P5 p = new CO5P5();
	}
} 