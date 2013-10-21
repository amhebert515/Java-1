package ahebert_dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calculator {  
	 static Scanner scan = new Scanner(System.in);

	 public void AgeCalculator(){  
	  int userYear, userMonth, userDay;
	  System.out.println("Enter the year of your birth:");
	  userYear = scan.nextInt();  
	  System.out.println("Enter the month of your birth:");
	  userMonth = scan.nextInt();  
	  System.out.println("Enter the day of your birth:");
	  userDay = scan.nextInt(); 


	  GregorianCalendar firstDate = new GregorianCalendar(userYear, userMonth, userDay);
	  GregorianCalendar secondDate = new GregorianCalendar();

	  secondDate.add(Calendar.YEAR, -firstDate.get(Calendar.YEAR));
	  secondDate.add(Calendar.MONTH, -firstDate.get(Calendar.MONTH));
	  secondDate.add(Calendar.DAY_OF_MONTH, -firstDate.get(Calendar.DAY_OF_MONTH) + 1);

	  int userYears = secondDate.get(Calendar.YEAR);
	  int userMonths = secondDate.get(Calendar.MONTH);
	  int userDays = secondDate.get(Calendar.DAY_OF_MONTH) - 1;

	  System.out.println("You are : " + userYears+" years" +", " +userMonths +" months"+", "+ userDays  + " days old"); 

	 }    

	 
	 public void AnniversaryCalculator(){
	  int annYear, annDay , annMonth; 

	  System.out.println("Enter the year of your anniversary: ");
	  annYear = scan.nextInt();
	  System.out.println("Enter the month of your anniversary: ");
	  annMonth = scan.nextInt();
	  System.out.println("Enter the day of your anniversary: ");
	  annDay = scan.nextInt();

	  
	  GregorianCalendar firstDate = new GregorianCalendar(annYear, annMonth, annDay);
	  GregorianCalendar secondDate = new GregorianCalendar();


	  secondDate.add(Calendar.YEAR, -firstDate.get(Calendar.YEAR));
	  secondDate.add(Calendar.MONTH, -firstDate.get(Calendar.MONTH));
	  secondDate.add(Calendar.DAY_OF_MONTH, -firstDate.get(Calendar.DAY_OF_MONTH) + 1);
	  secondDate.add(Calendar.HOUR, -firstDate.get(Calendar.HOUR));
	  secondDate.add(Calendar.MINUTE, -firstDate.get(Calendar.MINUTE));
	  secondDate.add(Calendar.SECOND, -firstDate.get(Calendar.SECOND));
	     
	     int annYears = secondDate.get(Calendar.YEAR);
	     int annMonths = secondDate.get(Calendar.MONTH);
	     int annDays = secondDate.get(Calendar.DAY_OF_MONTH) - 1;
	     int annHours = secondDate.get(Calendar.HOUR);
	     int annMinutes = secondDate.get(Calendar.MINUTE);
	     int annSeconds = secondDate.get(Calendar.SECOND);
	     
	     System.out.println("There are "+ annYears + " years and " + annMonths + " months, "+ annDays +" days, "+annHours+ " hours, "+annMinutes+
	       "minutes, and " +annSeconds+ " seconds until this anniversary occurs.");
	 }


	 public void AgeDifferenceCalculator(){  
	  int year, month, day; 
	  int year1, month1, day1;
	  System.out.println("Enter year of the first brith:");
	  year = scan.nextInt();  
	  System.out.println("Enter month of the first birth:");
	  month = scan.nextInt();  
	  System.out.println("Enter day of the first birth:");
	  day = scan.nextInt(); 
	  System.out.println("Enter year of the second birth:");
	  year1 = scan.nextInt(); 
	  System.out.println("Enter month of the second birth:"); 
	  month1 = scan.nextInt(); 
	  System.out.println("Enter day of the second birth:"); 
	  day1 = scan.nextInt();

	  GregorianCalendar date1 = new GregorianCalendar(year, month, day);
	  GregorianCalendar date2 = new GregorianCalendar(year1, month1, day1);

	  date2.add(Calendar.YEAR, -date1.get(Calendar.YEAR));
	  date2.add(Calendar.MONTH, -date1.get(Calendar.MONTH));
	  date2.add(Calendar.DAY_OF_MONTH, -date1.get(Calendar.DAY_OF_MONTH) + 1);

	  int years = date2.get(Calendar.YEAR);
	  int months = date2.get(Calendar.MONTH);
	  int days = date2.get(Calendar.DAY_OF_MONTH) - 1;

	  System.out.println("There are " + years+" years" +", " + months +" months"+", "+ days + " days between " + month+ " " + day+ ", "+ year+" " + "and " + month1+" " + day1 +", "+ year1); 

	 }

	}