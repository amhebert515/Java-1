package amh.Receipt;

import java.util.*;

import java.util.*;

public class Receipt {
	private double total = 0;
	private Formatter f = new Formatter(System.out);
	private int firstWidth = 15;
	private int secondWidth = 5;
	private int thirdWidth = 10;
	private double forthWidth = 15.15;
	private double fithWidth = 10.2;
	
	public void printTitle() {
		f.format("%"+-firstWidth+"s"+ "%" +secondWidth+ "s" + "%" +thirdWidth +"s\n", "Item", "Qty", "Price");
		f.format("%"+-firstWidth+ "s" + "%" + secondWidth + "s" + "%" + thirdWidth + "s\n", "----", "---", "-----");
	}
	public void print(String name, int qty, double price) {
		f.format("%" +-forthWidth + "s" + "%" + secondWidth + "d" +  "%" + fithWidth + "f\n", name, qty, price);
		total += price;
	}
	public void printTotal() {
		f.format("%"+-firstWidth+ "s" +  "%" + secondWidth + "s" + "%" +fithWidth  + "f\n", "Tax", "", total * 0.06);
		f.format("%"+-firstWidth + "s" + "%" + secondWidth + "s" + "%" + thirdWidth + "s\n", "", "", "-----");
		f.format("%"+-firstWidth+"s" + "%"+ secondWidth +"s" +"%"+fithWidth +"f\n", "Total", "", total * 1.06);
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