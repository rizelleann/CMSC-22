
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
    private Button button, ok;
    private Dialog d;
    
    
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
        setSize(600, 300);
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
        
        String player = getPlayerChoice();
        String computer = computerRandomChoice();
        
       
        //gameResult(player, computer, winner(player, computer));
       winnerPerRound(player, computer);
//        d.setVisible(false);
        } 
    }
    //gets the label chosen by player
    String getPlayerChoice(){
        Checkbox chk = choices.getSelectedCheckbox();
        String player = chk.getLabel().toString();
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
    void winnerPerRound(String player, String computer) {
       // int compScore = 0;
       // int playScore = 0; 
        //int win = 0;
        //rock -> scissors lizard
        //paper -> rock spock
        //scissors ->  lizard paper
        //lizard -> paper spock
        //spock -> scissors rock
        player = getPlayerChoice();
        computer = computerRandomChoice();

        result.setText("\nPlayer chooses " + player + "\nComputer chooses " + computer);
       
        if((player.equals("Rock") && (computer.equals("Lizard") ||computer.equals("Scissors"))) 
                || (player.equals("Paper") && (computer.equals("Rock") || computer.equals("Spock")))
                || (player.equals("Scissors") && (computer.equals("Lizard") || computer.equals("Paper")))
                || (player.equals("Lizard") && (computer.equals("Paper") || computer.equals("Spock")))
                || (player.equals("Spock") && (computer.equals("Scissors") || computer.equals("Rock")))){
            playScore++;
            result.append("\n..... Player Wins! .....");
        } else if(!player.equals(computer)){
            compScore++;
            result.append("\n..... Computer Wins! .....");
        } else {
            result.append("\n..... TIE! .....");
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

