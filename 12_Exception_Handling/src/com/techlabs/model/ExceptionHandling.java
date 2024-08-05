package com.techlabs.model;

public class ExceptionHandling {
	
	public static void main(String[] args) throws ArithmeticException{
		try {
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
	    
		
			double result = number1/number2;
			System.out.println("Devision is : "+result);
		}
		/*
		catch(ArithmeticException exception){
			System.out.println("Wrong Input for number2. It cannot be zero");
			
		}
		*/
		catch(ArrayIndexOutOfBoundsException exception){
			System.out.println("Provide two numbers");
			
		}
		catch(NumberFormatException exception){
			System.out.println("Please input only numbers as the arguments");
			
		}
		
		catch(Exception exception) {
			System.out.println("The exceptions in Exception class can be accessed by the object created \n The exception is : " +exception);
		}
		
		
		finally 
		{
			System.out.println("Inside finally, Closing Activities");
		}
		System.out.println("Main Code");
	
	}

}
