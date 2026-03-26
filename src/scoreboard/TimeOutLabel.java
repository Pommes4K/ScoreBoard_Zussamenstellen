 

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author 
 */
public class TimeOutLabel extends JLabel {

    public TimeOutLabel(String text, int horizontalAlignment) {
        super(text, horizontalAlignment);
        this.setBorder(new LineBorder(Color.BLACK));
        this.setBackground(Color.WHITE);
        this.setFont(this.getFont().deriveFont(20f));
        this.setOpaque(true);
    }

    public void timeOutbeginn() {
        this.setBackground(Color.YELLOW);
    }

    public void timeOutEnd() {
        this.setBackground(Color.WHITE);
    }
}
