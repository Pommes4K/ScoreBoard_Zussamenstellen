  

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author
 */
public class ScoreBoard extends JFrame {

    //vier Instanzen von Auszeitbutton erstellen
    private TimeOutButton team1_button1 = new TimeOutButton("team1_1");
    private TimeOutButton team1_button2 = new TimeOutButton("team1_2");
    private TimeOutButton team2_button1 = new TimeOutButton("team2_1");
    private TimeOutButton team2_button2 = new TimeOutButton("team2_2");
    
    private TimeOutButton[] buttons={team1_button1, team2_button1, team1_button2, team2_button2};
    
    private TimeOutLabel team_1=new TimeOutLabel("Team 1", SwingConstants.CENTER);
    private TimeOutLabel team_2=new TimeOutLabel("Team 2", SwingConstants.CENTER);
    
    private TimeOutLabel[] labels={team_1, team_2};
    /**
     * Im Konstruktor wird eine Anzeigetafel im Borderlayout erstellt. Das
     * bedeutet, dass das Board Kopf- und Fussbereich hat und dazwischen drei
     * Hauptbereiche nebeneinander. Jeder dieser Hauptbereiche wird mit einem
     * eigenen Panel und einem eigenen Layout erstellt. Die Teamnamen werden als
     * Parameter übergeben und an mehreren Stellen der Tafel benutzt.
     */
    public ScoreBoard() {
        super.setTitle("Volleyball-Anzeigetafel");

       
        /*NEU ###################################*/
        /* Das innere des Fensters, das JPanel "board" wird durch das
         * BorderLayout in fuenf Bereiche geteilt. 
         * Jeder dieser Bereich kann wieder ein eigenes JPanel mit Elementen
         * darauf enthalten. Das passiert hier mit dem linken Bereich.
         * Die anderen vier werden erstmal mit JButton als Platzhalter
         * gefuellt.
         */
        JPanel board = new JPanel();
        BorderLayout gesamtVerteilung = new BorderLayout();
        board.setLayout(gesamtVerteilung);
        // Die vier JButton sind Platzhalter
        JButton oben = new JButton("oben");
        board.add(oben, BorderLayout.PAGE_START);
        //PUNKTEPANEL -------------------------------------------------
        
        GridLayout myPointLayout = new GridLayout(4, 2);
        JPanel pointPanel = new JPanel(myPointLayout);
        
        JLabel textS = new JLabel("Punkte",JLabel.RIGHT);
        textS.setFont(textS.getFont().deriveFont(22f));
        JLabel textE = new JLabel("Stand",JLabel.LEFT);
        textE.setFont(textS.getFont().deriveFont(22f));
        
        JLabel teamName1 = new JLabel("Team 1",JLabel.CENTER);
        JLabel teamName2 = new JLabel("Team 2",JLabel.CENTER);
        
        JButton right = new JButton("Punktestand 1");
        JButton down = new JButton("Punktestand 2");
        
        pointPanel.add(textS);
        pointPanel.add(textE);
        pointPanel.add(teamName1);
        pointPanel.add(teamName2);
        pointPanel.add(right);
        pointPanel.add(down);
        
        
        
        pointPanel.setBorder(new LineBorder(Color.BLACK, 3));
        board.add(pointPanel, BorderLayout.CENTER);
        
        
        //Punktestand ende --------------------------------------------
        
        JButton rechts = new JButton("rechts");
        board.add(rechts, BorderLayout.LINE_END);
        JButton unten = new JButton("unten");
        board.add(unten, BorderLayout.PAGE_END);    
        
        /*NEU Ende###################################*/
        
        //Auszeitfenster
        GridLayout myLayout = new GridLayout(4, 2);
        JPanel timeOutPanel = new JPanel(myLayout);
        /*NEU*/
        timeOutPanel.setPreferredSize(new Dimension(300, 300));
        
        /*NEU*/
        JLabel textStart = new JLabel("Ausz",JLabel.RIGHT);
        textStart.setFont(textStart.getFont().deriveFont(22f));
        JLabel textEnd = new JLabel("eiten",JLabel.LEFT);
        textEnd.setFont(textStart.getFont().deriveFont(22f));
        
        timeOutPanel.add(textStart);
        timeOutPanel.add(textEnd);
 
        //Für beide Team Label
        //Dem Panel die Komponenten hinzufügen
        timeOutPanel.add(this.labels[0]);
        timeOutPanel.add(this.labels[1]);

        //Alle vier Auszeitknöpfe dem JPanel hinzufügen
        for(int i=0;i<this.buttons.length;i++){
              timeOutPanel.add(this.buttons[i]);
        }
      
        // Zusammensetzen:
        // erst auszeitTafel im linken Teil vom Board platzieren:
        board.add(timeOutPanel, BorderLayout.LINE_START);
        // dann das Board auf den JFrame legen:
        this.add(board);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Position und Groesse festlegen
        this.setLocation(00, 50);
        this.setSize(1000, 600);
        this.setVisible(true);
    }
    
    public TimeOutButton[] getButtons(){
        return this.buttons;  
    }
    
       public TimeOutLabel[] getLabels(){
        return this.labels;  
    }    
 }
