/*
 * Zachary Miller
 * Assignment 2.1
 * Exponent.java
 * This program accepts user input through a GUI and then squares and cubes the input and displays both results.
 * Bellevue.edu
 */
import javax.swing.*;
import java.math.*;
public class Exponent {
	public double calculateSquare(double doubleInput)
	{
		double squareValue = Math.pow(doubleInput, 2);
		return squareValue;
	}
	public void displaySquare(double doubleInput, double squareValue)
	{
		JOptionPane.showMessageDialog(null, doubleInput+" squared is "+squareValue);
	}
	public double calculateCube(double doubeInput)
	{
		double cubeValue = Math.pow(doubeInput, 3);
		return cubeValue;
	}
	public void displayCube(double doubleInput, double cubeValue)
	{
		JOptionPane.showMessageDialog(null, doubleInput+" cubed is "+cubeValue);
	}
	
	public static void main(String[] args) {
		boolean inputStatus = false;
		String rawInput;
		double doubleInput=0,squareValue,cubedValue;
		while(inputStatus==false)
		{
			rawInput = JOptionPane.showInputDialog(null, "Please enter a number: ");
			try {	
				doubleInput = Double.parseDouble(rawInput);
				inputStatus=true;
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "I'm sorry but the number you entered seemed to be incorrect. Please try again.");
				inputStatus=false;
				
			}
		}
		Exponent exponent = new Exponent();
		
		squareValue= exponent.calculateSquare(doubleInput);
		exponent.displaySquare(doubleInput, squareValue);
		cubedValue = exponent.calculateCube(doubleInput);
		exponent.displayCube(doubleInput,cubedValue);
		
	}
	

}
