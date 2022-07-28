package MVCsamp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The Controller coordinates interactions
// between the View and Model

public class CalculatorController {
	
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		// Tell the View that when ever the calculate button
		// is clicked to execute the actionPerformed method
		// in the CalculateListener inner class
		
		this.theView.addCalculateListener(new addListener());
		this.theView.subCalculateListener(new subListener());
		this.theView.multCalculateListener(new multListener());
		this.theView.divCalculateListener(new divListener());
	}
	
	class addListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int firstNumber, secondNumber = 0;
			
			// Surround interactions with the view with
			// a try block in case numbers weren't
			// properly entered
			
			try{
			
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				
				theModel.addTwoNumbers(firstNumber, secondNumber);
				
				theView.setAddSolution(theModel.getAddValue());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
		

	}

	class subListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int thirdNumber, fourthNumber = 0;
			
			try{
			
				thirdNumber = theView.getThirdNumber();
				fourthNumber = theView.getFourthNumber();
				
				theModel.subTwoNumbers(thirdNumber, fourthNumber);
				
				theView.setSubSolution(theModel.getSubValue());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}

	}

	class multListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int fifthNumber, sixthNumber = 0;
	
			try{
			
				fifthNumber = theView.getFifthNumber();
				sixthNumber = theView.getSixthNumber();
				
				theModel.multTwoNumbers(fifthNumber, sixthNumber);
				
				theView.setMultSolution(theModel.getMultValue());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}

	}

	class divListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int seventhNumber, eighthNumber = 0;
			
			try{
			
				seventhNumber = theView.getSeventhNumber();
				eighthNumber = theView.getEighthNumber();
				
				theModel.divTwoNumbers(seventhNumber, eighthNumber);
				
				theView.setDivSolution(theModel.getDivValue());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}

	}

}
