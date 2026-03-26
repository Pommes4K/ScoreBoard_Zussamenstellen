 

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author
 */
public class TimeOutButton extends JButton {

    private int countPushes;

    public TimeOutButton(String name) {
        this.setBackground(Color.GREEN);
        this.setName(name);
    }

    public void setAuszeit() {
        //Text auf "A" setzen
        this.setText("A");
        /*optional: Font auf Bold setzen und
	größer*/
        //Neue Schrift anlegen
        Font fettSchrift = new Font(this.getFont().getName(), Font.BOLD, this.getFont().getSize() + 2);
        this.setFont(fettSchrift);
        //Alternative
        this.setFont(this.getFont().deriveFont(Font.BOLD));
    }

    /* Methode für Auszeit verbraucht schreiben
	Text auf "" setzen, Hintergrundfarbe auf rot*/
    public void auszeitVerbrauchen() {
        this.setText("");
        this.setBackground(Color.red);
    }
    
    public void setPushes(){
        this.countPushes++;
    }
    
    public int getPushes(){
        return this.countPushes;
    }

}
