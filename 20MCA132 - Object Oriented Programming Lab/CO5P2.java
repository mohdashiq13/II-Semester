import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CO5P2 extends Frame implements ActionListener {
	private TextField num1Field, num2Field, num3Field;
	private Label resultLabel;

	public CO5P2() {
		setTitle("Maximum of Three Numbers");
		setSize(300, 200);
		setLayout(new FlowLayout());

		Label num1Label = new Label("Enter first number: ");
		num1Field = new TextField(10);

		Label num2Label = new Label("Enter second number: ");
		num2Field = new TextField(10);

		Label num3Label = new Label("Enter third number: ");
		num3Field = new TextField(10);

		Button calculateButton = new Button("Calculate Maximum");
		calculateButton.addActionListener(this);

		resultLabel = new Label("Result will be displayed here.");

		add(num1Label);
		add(num1Field);
		add(num2Label);
		add(num2Field);
		add(num3Label);
		add(num3Field);
		add(calculateButton);
		add(resultLabel);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int num1 = Integer.parseInt(num1Field.getText());
		int num2 = Integer.parseInt(num2Field.getText());
		int num3 = Integer.parseInt(num3Field.getText());

		int max = Math.max(num1, Math.max(num2, num3));
		resultLabel.setText("Maximum of three numbers: " + max);
	}

	public static void main(String[] args) {
		new CO5P2();
	}
}
