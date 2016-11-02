
package calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.math.*;
import javax.swing.border.EmptyBorder;
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
/**
 *
 * @author RizelleAnn
 * I added a clear ( C ) button because i cannot resize the zero button 
 * because I did not use the WYSIWYG 
 */
public final class Calculator extends JPanel {
    private JTextField result;
    private JButton zero;
    private JButton clear;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton plusB;
    private JButton minusB;
    private JButton multB;
    private JButton divB;
    private JButton eqB;
    private JButton posNeg;
    private JButton percent;
    private JButton AC;
    private JButton point;
    private BigDecimal num2;
    private BigDecimal num1;
    private String input;
    private char operation;
    private BigDecimal finalRes;
    private char op;
    private boolean oneK;
    
//constructor
    public Calculator(){
        initComponents();
    }
    
//components that compose the calculator
    @SuppressWarnings("Convert2Lambda")
    public void initComponents(){
       //initializing the components and setting the text of each
        Font font = new Font("Arial", Font.PLAIN, 36);
        Font font1 = new Font("Arial", Font.PLAIN, 20);
        JPanel panel = new JPanel(new BorderLayout(5,0));
        panel.setBorder(new EmptyBorder(0,0,0,0));
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        JPanel buttons = new JPanel(new GridLayout(5,4));
        
// the textfield where the input number and the result is being displayed
        result = new JTextField("0");
        result.setFont(font);
        result.setColumns(14);
       // result.setRows(2);
        result.setHorizontalAlignment(JTextField.RIGHT);
        result.setPreferredSize(new Dimension(400,90));
        result.setEditable(false);
//adds the textfield to the panel
        panel.add(result, BorderLayout.NORTH);
        
//clears all the digits currently displayed and displays 0
        AC = new JButton("AC");
        AC.setFont(font1);
        AC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                finalRes = new BigDecimal(0);
                result.setText("0");   
            }
        });
        
//gets the positive por negative value of a number
        posNeg = new JButton("+/-");
        posNeg.setFont(font1);
        posNeg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BigDecimal num = new BigDecimal(result.getText());
                num = num.multiply(new BigDecimal(-1));
                result.setText(String.valueOf(num));
            }
        });
      
        percent = new JButton("%");
        percent.setFont(font1);
        percent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOperation('%');
            }
        });
         
        divB = new JButton("/");
        divB.setFont(font1);
        divB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 setOperation('/');
                
            }
        });
         
        seven = new JButton("7");
        seven.setFont(font1);
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                takeIn("7");
            }
        });
        
         
        eight = new JButton("8");
        eight.setFont(font1);
         eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                takeIn("8");
            }
        });
         
         
        nine = new JButton("9");
        nine.setFont(font1);
         nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                takeIn("9");
            }
        });
         
        multB = new JButton("*");
        multB.setFont(font1);
         multB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOperation('*');
            }
        });
         
        four = new JButton("4");
        four.setFont(font1);
         four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                takeIn("4");
            }
        });
         
        five = new JButton("5");
        five.setFont(font1);
         five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                takeIn("5");
            }
        });
         
        six = new JButton("6");
        six.setFont(font1);
         six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               takeIn("6");
            }
        });
         
        minusB = new JButton("-");
        minusB.setFont(font1);
         minusB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 setOperation('-');
            }
        });
         
        one = new JButton("1");
        one.setFont(font1);
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(oneK)
                    takeIn("1");
                else
                    takeIn("1");
            }
        });
        
        two = new JButton("2");
        two.setFont(font1);
         two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                takeIn("2");
            }
        });
         
        three = new JButton("3");
        three.setFont(font1);
         three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                takeIn("3");
            }
        }); 
         
        plusB = new JButton("+");
        plusB.setFont(font1);
        plusB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOperation('+');
            }
        });
        
        zero = new JButton("0");
        zero.setFont(font1);
         zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                takeIn("0");
            }
        });
         
//clears one digit at a time
        clear = new JButton("C");
        clear.setFont(font1);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String display;
                if(result.getText().length() > 0){
                    StringBuilder str = new StringBuilder(result.getText());
                    str.deleteCharAt(result.getText().length() - 1);
                    display = str.toString();
                    result.setText(display);
                }
            }
        });
        
        point = new JButton("."); 
        point.setFont(font1);
        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = point.getText();
                takeIn(input);
            }
        });
        
        eqB = new JButton("=");
        eqB.setFont(font1);
        eqB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = new BigDecimal(result.getText());
                BigDecimal percent = num2.multiply(num2.divide(new BigDecimal(100)));
                switch(op){
                    case '+'://addition
                        finalRes = num1.add(num2);
                        break;
                    case '-'://subtraction
                        finalRes = num1.subtract(num2);
                        break;
                    case '*'://multiplication
                        finalRes = num1.multiply(num2);
                        break;
                    case '/'://division
                        try{
                            int compare = num1.compareTo(num2);
                            if(compare == -1){
                               finalRes =  num1.divide(num2,2, RoundingMode.HALF_UP);
                            } else {
                                    if(num1.remainder(num2).equals(BigDecimal.ZERO))
                                        finalRes = num1.divide(num2);
                                    else
                                        finalRes =  num1.divide(num2,2, RoundingMode.HALF_UP);
                            } 
                        } catch(ArithmeticException ex){
                            finalRes = null;
                        }
                        
                        break;
                    case '%': //gets the n percent of m
                        finalRes = num1.multiply(num2).divide(new BigDecimal(100));
                }
                if(String.valueOf(finalRes).length() > 14 || finalRes == null){
                    result.setText("   Error   ");
                } else {
                    result.setText(String.valueOf(finalRes));
                }
            }
        });
       
//adds all the buttons to the panel
        buttons.add(AC);
        buttons.add(clear);
        buttons.add(posNeg);
        buttons.add(percent);
        buttons.add(seven);
        buttons.add(eight);
        buttons.add(nine);
        buttons.add(divB);
        buttons.add(four);
        buttons.add(five);
        buttons.add(six);
        buttons.add(multB);
        buttons.add(one);
        buttons.add(two);
        buttons.add(three);
        buttons.add(minusB);
        buttons.add(zero);
        buttons.add(point);
        buttons.add(eqB);
        buttons.add(plusB);
// adds the panel of buttons to the panel
        panel.add(buttons, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        panel.setVisible(true);
        frame.setBounds(100, 50, 300, 400);
        frame.setResizable(true);
        addWindowListener(new WindowAdapter() {
             @Override
             public void windowClosing(WindowEvent we) {
                 System.exit(0);
             }
         });
        
    }
    public void takeIn(String input){
        String takeIn;
        if(result.getText().length() < 14){
            if(!result.getText().equals("0")){
            takeIn = result.getText() + input;    
        } else {
            if(input.equals(".")){ //exception for "."
                takeIn = result.getText() + input;
            } else {
                takeIn = input;
            }
        }
            result.setText(takeIn);
        } 
    }
    private void setOperation(char operation){
        num1 = new BigDecimal(result.getText());
        result.setText("");
        op = operation;
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Calculator();
        }); 
    }
    
}
