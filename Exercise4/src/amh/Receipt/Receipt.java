package amh.Receipt;

import java.util.*;

import java.util.*;

public class Receipt {
	private double total = 0;
	private Formatter f = new Formatter(System.out);
	private int nameWidth = 15;
	private int qtyWidth = 5;
	private int priceWidth = 10;
private String replaceAllSting ="%-"+nameWidth+"s %"+qtyWidth+"s %"+priceWidth+"s\n";
	
	public void printTitle() {
		f.format(replaceAllSting, "Item", "Qty", "Price");
		f.format(replaceAllSting, "----", "---", "-----");
	}

	public void print(String name, int qty, double price) {
		f.format(replaceAllSting, name, qty, price);
		total += price;
	}

	public void printTotal() {
		f.format(replaceAllSting, "Tax","", total * 0.06);
		f.format(replaceAllSting, "", "", "-----");
		f.format(replaceAllSting, "Total", "", total * 1.06);
	}

	public static void main(String[] args) {
		Receipt receipt = new Receipt();
		receipt.printTitle();
		receipt.print("Jack’s Magic Beans", 4, 4.25);
		receipt.print("Princess Peas", 3, 5.1);
		receipt.print("Three Bears Porridge", 1, 14.29);
		receipt.printTotal();
	}
}