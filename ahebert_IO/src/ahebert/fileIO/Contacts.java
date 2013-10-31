package ahebert.fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {

	String userCho;
	String line = "";
	boolean shouldGo = true;

	ArrayList<Contact> conList = new ArrayList<Contact>();
	Scanner scan = new Scanner(System.in);

	public void Selection() {

		System.out.println("Welcome to your Contants!");
		System.out.println("What would you like to do?");
		System.out.println("1. See all contacts");
		System.out.println("2. See a special contact");
		System.out.println("3. Enter a new contact");
		System.out.println("4. Exit");
		System.out.println("______________________");

		userCho = scan.nextLine();

		if (userCho.equals("1")) {
			PrintLeName();

		} else if (userCho.equals("2")) {
			Pick();
			

		} else if (userCho.equals("3")) {
			createContact();

		} else if (userCho.equals("4")) {
			System.out.println("Good Bye");
			shouldGo = false;
			writeContacts();
		}
	}

	public void writeContacts() {

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(
					"Contacts.csv"));
			for (int i = 0; i < conList.size(); i++) {
				writer.write(conList.get(i).toString() + '\n');

			}

			writer.close();
		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void createContact() {
		System.out.println("Enter a name");
		String conName = scan.nextLine();
		System.out.println("Enter an email");
		String conEmail = scan.nextLine();
		System.out.println("Enter a phone number");
		String conPhone = scan.nextLine();

		conList.add(new Contact(new String[] { conName, conEmail, conPhone }));

	}

	public boolean shouldGo() {
		return shouldGo;
	}

	public void LoadingFile() {
		FileReader input = null;
		try {
			input = new FileReader("Contacts.csv");
			BufferedReader reader = new BufferedReader(input);

			while (reader.ready()) {
				line = reader.readLine();
				conList.add(new Contact(line.split(",")));

			}

			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void PrintLeName() {
		for (int i = 0; i < conList.size(); i++) {
			System.out.println(i + " " + conList.get(i).name);
		}
		System.out.println("______________________");

	}


	public void Pick() {
		
		System.out.println("Which contact would you like to see?");
		System.out.println("Select a number.");
		int conCho = scan.nextInt();
		System.out.println("Name: " + conList.get(conCho).name);
		System.out.println("Email: " + conList.get(conCho).email);
		System.out.println("Phone: " + conList.get(conCho).phone);
		System.out.println("______________________");
	}
}
