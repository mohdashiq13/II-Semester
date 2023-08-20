import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CO5P3 extends Frame implements ActionListener {
    private TextField[] marksFields;
    private Button calculateButton;
    private Label resultLabel;

    public CO5P3() {
        setTitle("Percentage Calculator");
        setSize(300, 250);
        setLayout(new FlowLayout());

        marksFields = new TextField[5];
        for (int i = 0; i < marksFields.length; i++) {
            Label label = new Label("Enter marks for Subject " + (i + 1) + ": ");
            marksFields[i] = new TextField(10);
            add(label);
            add(marksFields[i]);
        }

        calculateButton = new Button("Calculate Percentage");
        calculateButton.addActionListener(this);

        resultLabel = new Label("Result will be displayed here.");

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        add(calculateButton);
        add(resultLabel);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        try {
            int totalMarks = 0;
            for (TextField marksField : marksFields) {
                int marks = Integer.parseInt(marksField.getText());
                totalMarks += marks;
            }

            double percentage = (double) totalMarks / (marksFields.length * 100) * 100;
            resultLabel.setText("Percentage: " + percentage + "%");

            if (percentage > 50) {
                resultLabel.setText(resultLabel.getText() + " :)"); // Happy face
            } else {
                resultLabel.setText(resultLabel.getText() + " :("); // Sad face
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input. Please enter valid marks.");
        }
    }

    public static void main(String[] args) {
        new CO5P3();
    }
}
