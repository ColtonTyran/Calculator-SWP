package MVCsamp;

//This is the View
//Its only job is to display what the user sees
//It performs no calculations, but instead passes
//information entered by the user to whomever needs
//it. 

import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView extends JFrame{

	private JTextField firstNumber  = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton addButton = new JButton("Calculate");
	private JTextField addSolution = new JTextField(10);

	private JTextField thirdNumber  = new JTextField(10);
	private JLabel subLabel = new JLabel("-");
	private JTextField fourthNumber = new JTextField(10);
	private JButton subButton = new JButton("Calculate");
	private JTextField subSolution = new JTextField(10);

	private JTextField fifthNumber  = new JTextField(10);
	private JLabel multLabel = new JLabel("*");
	private JTextField sixthNumber = new JTextField(10);
	private JButton multButton = new JButton("Calculate");
	private JTextField multSolution = new JTextField(10);

	private JTextField seventhNumber  = new JTextField(10);
	private JLabel divLabel = new JLabel("/");
	private JTextField eighthNumber = new JTextField(10);
	private JButton divButton = new JButton("Calculate");
	private JTextField divSolution = new JTextField(10);
	
	CalculatorView(){
		
		// Sets up the view and adds the components
		
		JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 200);
		
		calcPanel.add(firstNumber);  
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(addButton);
		calcPanel.add(addSolution);

		calcPanel.add(thirdNumber);
		calcPanel.add(subLabel);
		calcPanel.add(fourthNumber);
		calcPanel.add(subButton);
		calcPanel.add(subSolution);

		calcPanel.add(fifthNumber);
		calcPanel.add(multLabel);
		calcPanel.add(sixthNumber);
		calcPanel.add(multButton);
		calcPanel.add(multSolution);

		calcPanel.add(seventhNumber);
		calcPanel.add(divLabel);
		calcPanel.add(eighthNumber);
		calcPanel.add(divButton);
		calcPanel.add(divSolution);
		
		this.add(calcPanel);
		
		// End of setting up the components --------
		
	}
	
	public int getFirstNumber(){
		
		return Integer.parseInt(firstNumber.getText());
		
	}
	
	public int getSecondNumber(){
		
		return Integer.parseInt(secondNumber.getText());
		
	}

	public int getThirdNumber(){
		
		return Integer.parseInt(thirdNumber.getText());
		
	}
	
	public int getFourthNumber(){
		
		return Integer.parseInt(fourthNumber.getText());
		
	}

	public int getFifthNumber(){
		
		return Integer.parseInt(fifthNumber.getText());
		
	}
	
	public int getSixthNumber(){
		
		return Integer.parseInt(sixthNumber.getText());
		
	}

	public int getSeventhNumber(){
		
		return Integer.parseInt(seventhNumber.getText());
		
	}
	
	public int getEighthNumber(){
		
		return Integer.parseInt(eighthNumber.getText());
		
	}
	
	public int getAddSolution(){
		
		return Integer.parseInt(addSolution.getText());
		
	}
	
	public void setAddSolution(int solution){
		
		addSolution.setText(Integer.toString(solution));
		
	}
	
	public int getSubSolution(){
		
		return Integer.parseInt(subSolution.getText());
		
	}
	
	public void setSubSolution(int solution){
		
		subSolution.setText(Integer.toString(solution));
		
	}

	public int getMultSolution(){
		
		return Integer.parseInt(multSolution.getText());
		
	}
	
	public void setMultSolution(int solution){
		
		multSolution.setText(Integer.toString(solution));
		
	}

	public int getDivSolution(){
		
		return Integer.parseInt(divSolution.getText());
		
	}
	
	public void setDivSolution(int solution){
		
		divSolution.setText(Integer.toString(solution));
		
	}
	// If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed
	
	void addCalculateListener(ActionListener listenForCalcButton){
		
		addButton.addActionListener(listenForCalcButton);
		
	}

	void subCalculateListener(ActionListener listenForCalcButton){
		
		subButton.addActionListener(listenForCalcButton);
		
	}

	void multCalculateListener(ActionListener listenForCalcButton){
		
		multButton.addActionListener(listenForCalcButton);
		
	}

	void divCalculateListener(ActionListener listenForCalcButton){
		
		divButton.addActionListener(listenForCalcButton);
		
	}
	
	// Open a popup that contains the error message passed
	
	void displayErrorMessage(String errorMessage){
		
		JOptionPane.showMessageDialog(this, errorMessage);
		
	}
	
}
