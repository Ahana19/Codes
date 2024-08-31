import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q5 extends Applet implements ActionListener {
    private Button redButton;
    private Button blueButton;

    public void init() {
        redButton = new Button("RED");
        blueButton = new Button("BLUE");

        redButton.addActionListener(this);
        blueButton.addActionListener(this);

        add(redButton);
        add(blueButton);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            showStatus("You have pressed RED");
        } else if (e.getSource() == blueButton) {
            showStatus("You have pressed BLUE");
        }
    }
}

/*  b
<html> 
<applet code=Q5 height=500 width=500> 
</applet> 
</html> 
*/