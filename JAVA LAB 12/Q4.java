import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q4 extends Applet implements ActionListener {
    private TextField input1;
    private TextField input2;
    private TextField result;
    private Button addButton;
    private Button subButton;

    public void init() {
        input1 = new TextField(10);
        input2 = new TextField(10);
        result = new TextField(10);
        addButton = new Button("Add");
        subButton = new Button("Sub");

        addButton.addActionListener(this);
        subButton.addActionListener(this);

        add(new Label("Input 1:"));
        add(input1);
        add(new Label("Input 2:"));
        add(input2);
        add(addButton);
        add(subButton);
        add(new Label("Result:"));
        add(result);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            try {
                int num1 = Integer.parseInt(input1.getText());
                int num2 = Integer.parseInt(input2.getText());
                int sum = num1 + num2;
                result.setText(Integer.toString(sum));
            } catch (NumberFormatException ex) {
                result.setText("Invalid input");
            }
        } else if (e.getSource() == subButton) {
            try {
                int num1 = Integer.parseInt(input1.getText());
                int num2 = Integer.parseInt(input2.getText());
                int diff = num1 - num2;
                result.setText(Integer.toString(diff));
            } catch (NumberFormatException ex) {
                result.setText("Invalid input");
            }
        }
    }
}
 
/*  b
<html> 
<applet code=Q4 height=500 width=500> 
</applet> 
</html> 
*/