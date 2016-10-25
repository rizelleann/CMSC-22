/*

package gui;

/**
 *
 * @author RizelleAnn
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class RPS extends Frame {
    private Label yourChoice, computerScore, playerScore;
    private CheckboxGroup choices;
    private Checkbox rock, paper, scissors, lizard, spock;
    private TextField scoreC, scoreP;
    private TextArea result;
    private Button button;
    
    int compScore, playScore;
    Random ch = new Random();
    public RPS(){
        setLayout(new FlowLayout());
             
        yourChoice = new Label("Your Choice:");
        add(yourChoice);
        choices = new CheckboxGroup();
        rock = new Checkbox("Rock", choices, true);
        add(rock);
        paper = new Checkbox("Paper", choices, true);
        add(paper);
        scissors = new Checkbox("Scissors", choices, true);
        add(scissors);
        lizard = new Checkbox("Lizard", choices, true);
        add(lizard);
        spock = new Checkbox("Spock", choices, true);
        add(spock);
        
        result = new TextArea("Result");
        result.setEditable(false);
        add(result);
        button = new Button("RockPaperScissorsLizardSpock!");
        button.addActionListener(new MyActionListener());
        add(button);
        
        playerScore  = new Label("Player:");
        add(playerScore);
        scoreP = new TextField("0", 10);
        add(scoreP);
     
        computerScore = new Label("Computer:");
        add(computerScore);
        
        scoreC = new TextField("0", 10);
        add(scoreC);
        
        setTitle("RockPaperScissorsLizardSpock");
        setSize(600, 400);
        setVisible(true);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
          
    }
    
    class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        
        //String player = getPlayerChoice();
        //String computer = computerRandomChoice();
        
       
        gameResult();
        } 
    }
    //gets the label chosen by player
    String getPlayerChoice(){
        Checkbox chk = choices.getSelectedCheckbox();
        String player = chk.getLabel();
        return player;
    }
    
    //randomizes computer choice
    String computerRandomChoice(){
        
        int rand = ch.nextInt(5 - 1) + 1 + 1;
        String comp = "";
        if(rand == 1) {
            comp = "Rock";
        }
        if(rand == 2) {
            comp =  "Paper";
        }
        if(rand == 3) {
            comp =  "Scissors";
        }
        if(rand == 4) {
            comp = "Lizard";
        }
        if(rand == 5) {
            comp = "Spock";
        }    
        return comp;
    }
    
    //determines winner per round
    int winner() {
       // int compScore = 0;
       // int playScore = 0; 
        int win;
        //paper -> rock spock
        //scissors ->  lizard paper
        //lizard -> paper spock
        //spock -> scissors rock
        
        //if tie
        if(getPlayerChoice().equals(computerRandomChoice())) {
            win = -1;
         // user wins
        } else if(getPlayerChoice().equals("Rock") && computerRandomChoice().equals("Lizard") || computerRandomChoice().equals("Scissors")){
                win = 1;
        } else if(getPlayerChoice().equals("Paper") && computerRandomChoice().equals("Rock") || computerRandomChoice().equals("Spock")) {
            win = 1;
        } else if(getPlayerChoice().equals("Scissors") && computerRandomChoice().equals("Lizard") || computerRandomChoice().equals("Paper")) {
            win = 1; 
        } else if(getPlayerChoice().equals("Lizzard") && computerRandomChoice().equals("Paper") || computerRandomChoice().equals("Spock")){
            win = 1;
        } else if(getPlayerChoice().equals("Spock") && computerRandomChoice().equals("Scissors") || computerRandomChoice().equals("Rock")){
             win = 1;
        } else {
            //no tie and user is not the winner
            win = 0;
        }
  
     return win;
    }

    //displays text in the text field for scores and result
    void gameResult(){
        result.setText("\nPlayer chooses " + getPlayerChoice() + "\nComputer chooses " + computerRandomChoice());
        
        
        switch (winner()) {
            case 0:
                result.append("\n.....Computer Wins .....!");
                compScore++;
                break;
            case 1:
                result.append("\n.....Player Wins.....!");
                playScore++;
                break;
            case -1:
                result.append("\n......TIE......!");
                break;
            default:
                break;
        
        }
        
     //sets score obtained by computer
     scoreC.setText(""+compScore);
     //sets score obtained by player
     scoreP.setText(""+playScore);
    }
    public static void main(String[] args) {
        
        new RPS();
    }
}

