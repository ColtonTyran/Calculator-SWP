package MVCsamp;


//The Model performs all the calculations needed
//and that is it. It doesn't know the View 
//exists

public class CalculatorModel {

	// Holds the value of the sum of the numbers
	// entered in the view
	
	private int addValue;
	private int subValue;
	private int multValue;
	private int divValue;
	
	public void addTwoNumbers(int firstNumber, int secondNumber){
		
		addValue = firstNumber + secondNumber;
		
	}

	public void subTwoNumbers(int thirdNumber, int fourthNumber){
		
		subValue = thirdNumber - fourthNumber;
		
	}

	public void multTwoNumbers(int fifthNumber, int sixthNumber){
		
		multValue = fifthNumber * sixthNumber;
		
	}

	public void divTwoNumbers(int seventhNumber, int eighthNumber){
		
		divValue = seventhNumber / eighthNumber;
		
	}
	
	public int getAddValue(){
		
		return addValue;
		
	}

	public int getSubValue(){
		
		return subValue;
		
	}

	public int getMultValue(){
		
		return multValue;
		
	}

	public int getDivValue(){
		
		return divValue;
		
	}
	
}
