
/**
 * Beschreiben Sie hier die Klasse ScoreBoardController.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScoreBoardController implements ActionListener
{
    private ScoreBoard myBoard;
    private boolean team1Active=false;
    private boolean team2Active=false;

    /**
     * Konstruktor für Objekte der Klasse ScoreBoardController
     */
    public ScoreBoardController(ScoreBoard myBoard)
    {
        this.myBoard=myBoard;
        for(int i=0;i<this.myBoard.getButtons().length;i++){
            this.myBoard.getButtons()[i].addActionListener(this);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().getClass().getName().contains("TimeOutButton")) {
            TimeOutButton pushedButton = (TimeOutButton) e.getSource();
            if (pushedButton.getPushes()==0) {
                System.out.println(pushedButton.getName());
                if (pushedButton.getName().contains("team1")) {
                    if(!this.team1Active){
                        this.myBoard.getLabels()[0].timeOutbeginn();
                        this.team1Active=true;
                        pushedButton.setAuszeit();
                        pushedButton.setPushes();
                    }
                } else {
                    if(!this.team2Active){
                        this.myBoard.getLabels()[1].timeOutbeginn();
                        this.team2Active=true;
                        pushedButton.setAuszeit();
                        pushedButton.setPushes();
                    }
                }

            } else if (pushedButton.getPushes()==1) {
                System.out.println(pushedButton.getName());

                if (pushedButton.getName().contains("team1")) {
                    this.myBoard.getLabels()[0].timeOutEnd();
                    this.team1Active=false;
                    pushedButton.auszeitVerbrauchen();
                    pushedButton.setPushes();
                } else {
                    this.myBoard.getLabels()[1].timeOutEnd();
                    this.team2Active=false;
                    pushedButton.auszeitVerbrauchen();
                    pushedButton.setPushes();
                }

            }
        }

    }
}
