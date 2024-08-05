package com.conditionalstatements;

import java.util.Scanner;

public class CelciusToFahrenheit {
	
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter temperature: ");
        double temperature = scanner.nextDouble();
        
 
        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        
        int choice = scanner.nextInt();
        switch(choice)
        {
        case 1:
        	double celcius_to_fahrenheit = (temperature * (9/5)) + 32;
        	System.out.println("The converted temperature is :" +celcius_to_fahrenheit);
        	break;
        case 2:
        	double fahrenheit_to_celcius = (temperature - 32) * (5/9);
        	System.out.println("The converted temperature is :" +fahrenheit_to_celcius);
        	break;
        case 3:
        	double celcius_to_kelvin = (temperature + 273.15);
        	System.out.println("The converted temperature is :" +celcius_to_kelvin);
        	break;
        case 4:
        	double kelvin_to_celcius = (temperature - 273.15);
        	System.out.println("The converted temperature is :" +kelvin_to_celcius);
        	break;
        case 5:
        	double fahrenheit_to_kelvin = (temperature -32)* (5/9) + 273.15;
        	System.out.println("The converted temperature is :" +fahrenheit_to_kelvin);
        	break;
        case 6:
        	double kelvin_to_fahrenheit = (temperature -273)* (9/5) + 32;
        	System.out.println("The converted temperature is :" +kelvin_to_fahrenheit);
        	break;
        default:System.out.println("Not any of the above metrics");	
        
        	
	}
        scanner.close();
	

}
}
