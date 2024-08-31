import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q3 extends Applet implements ActionListener {
    private TextField textField;
    private Button checkButton;
    private Label resultLabel;

    public void init() {
        textField = new TextField(10);
        checkButton = new Button("Check");
        resultLabel = new Label("Enter a number and click Check");

        checkButton.addActionListener(this);

        add(textField);
        add(checkButton);
        add(resultLabel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == checkButton) {
            String input = textField.getText().trim();
            if (input.isEmpty()) {
                resultLabel.setText("Value is blank");
            } else {
                try {
                    int number = Integer.parseInt(input);
                    if (number % 2 == 0) {
                        resultLabel.setText(number + " is even");
                    } else {
                        resultLabel.setText(number + " is odd");
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input");
                }
            }
        }
    }
}

/*  b
<html> 
<applet code=Q3 height=500 width=500> 
</applet> 
</html> 
*/