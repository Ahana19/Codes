import java.awt.*;
import java.applet.*;

public class Q2 extends Applet {
    private String rollNo;
    private String name;
    private String branch;
    private String section;

    public void init() {
        rollNo = "113"; // Example roll number
        name = "Ashley"; // Example name
        branch = "Computer Science"; // Example branch
        section = "A"; // Example section
    }

    public void paint(Graphics g) {
        g.drawString("Roll No.: " + rollNo, 10, 20);
        g.drawString("Name: " + name, 10, 40);
        g.drawString("Branch: " + branch, 10, 60);
        g.drawString("Section: " + section, 10, 80);
    }
}
/*  b
<html> 
<applet code=Q2 height=500 width=500> 
</applet> 
</html> 
*/