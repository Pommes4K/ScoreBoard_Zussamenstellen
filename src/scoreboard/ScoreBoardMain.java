/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Arbeit_hk
 */
public class ScoreBoardMain {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws InterruptedException {
        ScoreBoard myScoreBoard=new ScoreBoard();
        ScoreBoardController myController=new ScoreBoardController(myScoreBoard);
    }
   
}
