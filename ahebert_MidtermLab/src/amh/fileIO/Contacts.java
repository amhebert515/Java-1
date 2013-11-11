package amh.fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Contacts {

	String userCho;
	String line = "";
	boolean shouldGo = true;

	HashMap<String,Contact> conList = new HashMap<String,Contact>();
	Scanner scan = new Scanner(System.in);

	public void Selection() {

		System.out.println("Welcome to your Contants!");
		System.out.println("What would you like to do?");
		System.out.println("1. Print people sorted by Name");
		System.out.println("2. Print people sorted by Phone Number");
		System.out.println("3. Print people sorted by Birthday");
		System.out.println("4. Get a single person by their Name");
		System.out.println("5. Exit");

		userCho = scan.nextLine();

		if (userCho.equals("1")) {
			sortName();
		} else if (userCho.equals("2")) {
			sortPhone();
		} else if (userCho.equals("3")) {
			sortDOB();
		} else if (userCho.equals("4")) {
			PrintLeName();

		}

		else if (userCho.equals("5")) {
			System.out.println("Good Bye");
			shouldGo = false;
			
		}
	}

	public void sortName(){
		List<Contact> c = new ArrayList<Contact>(conList.values());
		Collections.sort(c);
		for (Contact contact : c) {
			System.out.println(contact.toString());
		}
	}
	
	public void sortDOB(){
		List<Contact> c = new ArrayList<Contact>(conList.values());
		Collections.sort(c, new compareDOB());
		for (Contact contact : c) {
			System.out.println(contact.toString());
		}
	}
	
	public void sortPhone(){
		List<Contact> c = new ArrayList<Contact>(conList.values());
		Collections.sort(c, new comparePhone());
		for (Contact contact : c) {
			System.out.println(contact.toString());
		}
	}
	
	
	public void writeContacts() {

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(
					"contacts.csv"));
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

	public boolean shouldGo() {
		return shouldGo;
	}

	public void LoadingFile() {
	
		try {
			FileReader input = new FileReader("Contacts.csv");
			BufferedReader reader = new BufferedReader(input);

			while (reader.ready()) {
				line = reader.readLine();
				String[] moo= line.split(",");
						conList.put(moo[0],new Contact(moo));

			}

			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void PrintLeName() {
		System.out.println("Enter the person's name");
		String name = scan.nextLine();
		Contact person = conList.get(name);
		if(person == null)
			System.out.println("Not a person");
		else
			System.out.println(person.toString());

	}

	// for (int i = 0; i < list.size(); i++) {
	// String s = list.get(i);
	// System.out.println(line);
	// }

	public void Pick() {
		// list.add(line);
		System.out.println("Which contact would you like to see?");
		System.out.println("Select a number.");
		int conCho = scan.nextInt();
		System.out.println("Name: " + conList.get(conCho).name);
		System.out.println("Phone: " + conList.get(conCho).phone);
		System.out.println("Birthday: "+ conList.get(conCho).birthDate);
	}
}
