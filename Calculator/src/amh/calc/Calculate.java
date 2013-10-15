package amh.calc;

import java.util.Scanner;

public class Calculate {
	int firstNum, secondNum, answer;
	Scanner scan = new Scanner(System.in);
	Scanner theScan = new Scanner(System.in);
	CalcFunctions func;
	boolean askQuestion = true;

	public void askUser() {
		while (askQuestion) {
			System.out.println("What is your first number?");
			firstNum = scan.nextInt();

			System.out.println("What is your second number?");
			secondNum = scan.nextInt();

			System.out
					.println("What function would you like to do? ADD,SUBTRACT,DIVIDE,MULTIPLY. If you would like to quit type DONE");
			String userPick = theScan.nextLine();
			if (userPick.equalsIgnoreCase("ADD")) {

				answer = CalcFunctions.ADD.solveProblem(firstNum, secondNum);
				
			}

			else if (userPick.equalsIgnoreCase("SUBTRACT")) {

				answer = CalcFunctions.SUBTRACT.solveProblem(firstNum,
						secondNum);
				
			}

			else if (userPick.equalsIgnoreCase("DIVIDE")) {

				answer = CalcFunctions.DIVIDE.solveProblem(firstNum, secondNum);
				
			}

			else if (userPick.equalsIgnoreCase("MULTIPLY")) {

				answer = CalcFunctions.MULTIPLY.solveProblem(firstNum,
						secondNum);
				
			}

			else if (userPick.equalsIgnoreCase("DONE"))
			{
				askQuestion=false;
			}
			System.out.println(answer);

		}

	}

}
