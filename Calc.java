package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calc implements ActionListener {
	  
    JFrame jf;
    JLabel displayLabel;
    JButton buttonSeven;
    JButton buttonEight;
    JButton buttonNine;
    JButton buttonAdd;
    JButton buttonFour;
    JButton buttonFive;
    JButton buttonSix;
    JButton buttonOne;
    JButton buttonTwo;
    JButton buttonThree;
    JButton buttonSubtract;
    JButton buttonClear;
    JButton buttonMultiply;
    JButton buttonDivision;
    JButton buttonEqual;
    JButton buttonDot;
    JButton buttonZero;
    
    boolean addOp = false;
    boolean subOp = false;
    boolean mulOp = false;
    boolean divOp = false;
    boolean isOperatorClicked = false;
    String oldValue;
    String newValue;
    float result;
    
    
	public Calc() {
		jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(300,200);
		displayLabel = new JLabel();
		displayLabel.setBackground(Color.LIGHT_GRAY);
		displayLabel.setOpaque(true);
		displayLabel.setFont(new Font("serif", Font.PLAIN,30));
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.BLACK);
		jf.add(displayLabel);
		
		buttonSeven = new JButton("7");
		buttonSeven.setBounds(60, 120, 80, 80);
		buttonSeven.setFont(new Font("Arial" , Font.PLAIN, 40));
		jf.add(buttonSeven);
		buttonSeven.addActionListener(this);
		buttonSeven.setFocusable(false);
		
		buttonEight = new JButton("8");
		buttonEight.setBounds(160, 120, 80, 80);
		buttonEight.setFont(new Font("Arial" , Font.PLAIN, 40));
		jf.add(buttonEight);
		buttonEight.addActionListener(this);
		buttonEight.setFocusable(false);
		
		buttonNine = new JButton("9");
		buttonNine.setBounds(260, 120, 80, 80);
		buttonNine.setFont(new Font("Arial" , Font.PLAIN, 40));
		jf.add(buttonNine);
		buttonNine.addActionListener(this);
		buttonNine.setFocusable(false);
		
		buttonAdd = new JButton("+");
		buttonAdd.setBounds(360, 120, 80, 80);
		buttonAdd.setFont(new Font("Arial" , Font.PLAIN, 40));
		jf.add(buttonAdd);
		buttonAdd.addActionListener(this);
		buttonAdd.setFocusable(false);
		
		buttonClear = new JButton("C");
		buttonClear.setBounds(460, 120, 80, 180);
		buttonClear.setFont(new Font("Arial" , Font.PLAIN, 40));
		jf.add(buttonClear);
		buttonClear.addActionListener(this);
		buttonClear.setFocusable(false);
		
		buttonFour = new JButton("4");
		buttonFour.setBounds(60, 220, 80, 80);
		buttonFour.setFont(new Font("Arial" , Font.PLAIN, 40));
		jf.add(buttonFour);
		buttonFour.addActionListener(this);
		buttonFour.setFocusable(false);
		
		buttonFive = new JButton("5");
		buttonFive.setBounds(160, 220, 80, 80);
		buttonFive.setFont(new Font("Arial" , Font.PLAIN, 40));
		jf.add(buttonFive);
		buttonFive.addActionListener(this);
		buttonFive.setFocusable(false);
		
		buttonSix = new JButton("6");
		buttonSix.setBounds(260, 220, 80, 80);
		buttonSix.setFont(new Font("Arial" , Font.PLAIN, 40));
		jf.add(buttonSix);
		buttonSix.addActionListener(this);
		buttonSix.setFocusable(false);
		
		buttonSubtract = new JButton("-");
		buttonSubtract.setBounds(360, 220, 80, 80);
		buttonSubtract.setFont(new Font("Arial" , Font.PLAIN, 40));
		jf.add(buttonSubtract);
		buttonSubtract.addActionListener(this);
		buttonSubtract.setFocusable(false);
		
		buttonOne = new JButton("1");
		buttonOne.setBounds(60, 320, 80, 80);
		buttonOne.setFont(new Font("Arial" , Font.PLAIN, 40));
		jf.add(buttonOne);
		buttonOne.addActionListener(this);
		buttonOne.setFocusable(false);
		
		buttonTwo = new JButton("2");
		buttonTwo.setBounds(160, 320, 80, 80);
		buttonTwo.setFont(new Font("Arial" , Font.PLAIN, 40));
		jf.add(buttonTwo);
		buttonTwo.addActionListener(this);
		buttonTwo.setFocusable(false);
		
		buttonThree = new JButton("3");
		buttonThree.setBounds(260, 320, 80, 80);
		buttonThree.setFont(new Font("Arial" , Font.PLAIN, 40));
		jf.add(buttonThree);
		buttonThree.addActionListener(this);
		buttonThree.setFocusable(false);
		
		buttonMultiply = new JButton("*");
		buttonMultiply.setBounds(360, 320, 80, 80);
		buttonMultiply.setFont(new Font("Arial" , Font.PLAIN, 40));
		jf.add(buttonMultiply);
		buttonMultiply.addActionListener(this);
		buttonMultiply.setFocusable(false);
		
		buttonEqual = new JButton("=");
		buttonEqual.setBounds(460, 320, 80, 180);
		buttonEqual.setFont(new Font("Arial" , Font.PLAIN, 40));
		jf.add(buttonEqual);
		buttonEqual.addActionListener(this);
		buttonEqual.setFocusable(false);
		
		buttonZero = new JButton("0");
		buttonZero.setBounds(60, 420, 180, 80);
		buttonZero.setFont(new Font("Arial" , Font.PLAIN, 40));
		jf.add(buttonZero);
		buttonZero.addActionListener(this);
		buttonZero.setFocusable(false);
		
		buttonDot = new JButton(".");
		buttonDot.setBounds(260, 420, 80, 80);
		buttonDot.setFont(new Font("Arial" , Font.PLAIN, 40));
		jf.add(buttonDot);
		buttonDot.addActionListener(this);
		buttonDot.setFocusable(false);
		
		buttonDivision = new JButton("/");
		buttonDivision.setBounds(360, 420, 80, 80);
		buttonDivision.setFont(new Font("Arial" , Font.PLAIN, 40));
		jf.add(buttonDivision);
		buttonDivision.addActionListener(this);
		buttonDivision.setFocusable(false);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Calc c = new Calc();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==buttonSeven ) {
			if (isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
		}
		else if (e.getSource()==buttonEight) {
			if (isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
		}
		else if (e.getSource()==buttonNine) {
			if (isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;
			}
			else {
			displayLabel.setText(displayLabel.getText()+"9");
			}
		}
		else if (e.getSource()==buttonFour) {
			if (isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
		}
		else if (e.getSource()==buttonFive) {
			if (isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
		}
		else if (e.getSource()==buttonSix) {
			if (isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
		}
		else if (e.getSource()==buttonOne) {
			if (isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
		}
		else if (e.getSource()==buttonTwo) {
			if (isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
		}
		else if (e.getSource()==buttonThree) {
			if (isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
		}
		else if (e.getSource()==buttonZero) {
			if (isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
		}
		else if (e.getSource()==buttonDot) {
			if (!displayLabel.getText().contains(".")){
				displayLabel.setText(displayLabel.getText()+".");
			}
		}
		else if (e.getSource()==buttonAdd) {
			
			isOperatorClicked = true;
			oldValue = displayLabel.getText();
			addOp = true;
			displayLabel.setText("");
		}
		else if (e.getSource()==buttonSubtract) {
			isOperatorClicked = true;
			oldValue = displayLabel.getText();
			subOp=true;
			displayLabel.setText("");
		}
		else if (e.getSource()==buttonMultiply) {
			isOperatorClicked = true;
			oldValue = displayLabel.getText();
			mulOp=true;
			displayLabel.setText("");
		}
		else if (e.getSource()==buttonDivision) {
			isOperatorClicked = true;
			oldValue = displayLabel.getText();
			divOp=true;
			displayLabel.setText("");
		}
		else if (e.getSource()==buttonClear) {
			clearAll();
			displayLabel.setText(" ");
		}
		else if (e.getSource()==buttonEqual) {
			if(oldValue!="") {
				if(addOp) {
					newValue=displayLabel.getText();
					if(newValue != "") {
						float newValueF = java.lang.Float.parseFloat(newValue);
						float oldValueF = java.lang.Float.parseFloat(oldValue);
						float result = oldValueF+newValueF;
						displayLabel.setText(result+"");
						addOp=false;
					}
					else {
						addOp=false;
					}
				
				}
				else if(subOp) {
					newValue=displayLabel.getText();
					if(newValue != "") {
					    float newValueF = java.lang.Float.parseFloat(newValue);
					    float oldValueF = java.lang.Float.parseFloat(oldValue);
					    float result = oldValueF-newValueF;
					    displayLabel.setText(result+"");
					    subOp=false;
					}
					else {
						subOp=false;
					}
				}
				else if(mulOp) {
					newValue=displayLabel.getText();
					if(newValue != "") {
					    float newValueF = java.lang.Float.parseFloat(newValue);
					    float oldValueF = java.lang.Float.parseFloat(oldValue);
					    float result = oldValueF*newValueF;
					    displayLabel.setText(result+"");
					    mulOp=false;
					}
					else {
						mulOp=false;
					}
				}
				else if(divOp) {
					newValue=displayLabel.getText();
					if(newValue != "") {
						float newValueF = java.lang.Float.parseFloat(newValue);
						float oldValueF = java.lang.Float.parseFloat(oldValue);
						float result = oldValueF/newValueF;
						displayLabel.setText(result+"");
						divOp=false;
					}
					else {
						mulOp=false;
					}
				}
				else {
					clearAll();
				}
					
			}
			else {
				displayLabel.setText("");
			}
			
		}
	}
	void clearAll() {
		oldValue=null;
		newValue = null;
	}
}
	