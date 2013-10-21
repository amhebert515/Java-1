package ahebert_dates;

import java.util.Scanner;

public class Main {

	
		 public static void main(String[] args) {   
		  boolean isRunning = true; 
		  while(isRunning){
		  Scanner scan = new Scanner(System.in); 
		  Calculator cal = new  Calculator();    
		  System.out.println("Pick 1 for age Calculator. Pick 2 for anniversary calculator. Pick 3 for age difference calculator. Pick 0 to exit");
				  int userDecision = scan.nextInt();
		  
		  
		   switch(userDecision){ 
		   case 1:  
		    cal.AgeCalculator();
		    break; 
		   case 2: 
		    cal.AnniversaryCalculator();
		    break; 
		   case 3: 
		    cal.AgeDifferenceCalculator(); 
		    break; 
		   case 0: 
		    isRunning = false;
		   } 
		  }
		 }

		}


