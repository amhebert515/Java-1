package amh.ahebert_format;

import java.util.*;

public class InvoiceItem {
	private Formatter f = new Formatter(System.out);

	static String[] invoiceItems = { "Mustache", "Beard", "Side Burns" };
	static int qtySpace = 10;
	String longestItemString = LongestStringItem(invoiceItems);
	int priceWidth = 10;

	int itemWidth = longestItemString.length();
	int nameWidth = longestItemString.length();

	public void printTitle() {

		f.format("%" + -itemWidth + "s" + " %" + -qtySpace + "s" + " %"
				+ -priceWidth + "s" + "\n", "Description", "Quantity", "Price");
		f.format("%" + -itemWidth + "s" + " %" + qtySpace + "s" + " %"
				+ priceWidth + "s" + "\n", "--------------", "----------",
				"----------");
	}

	public void printItem() {

		f.format("%" + -nameWidth + "s" + " %" + qtySpace + "d" + " %"
				+ priceWidth + "s" + "\n", invoiceItems[0], 567, 4576.36);
		f.format("%" + -nameWidth + "s" + " %" + qtySpace + "d" + " %"
				+ priceWidth + "s" + "\n", invoiceItems[1], 23, 565.43);
		f.format("%" + -nameWidth + "s" + " %" + qtySpace + "d" + " %"
				+ priceWidth + "s" + "\n", invoiceItems[2], 1, 145.80);

	}

	public static String LongestStringItem(String[] arrayOfItems) {
		int maxLength = 0;
		String longestString = null;
		for (String s : arrayOfItems) {
			if (s.length() > maxLength) {
				maxLength = s.length();
				longestString = s;
			}
		}
		return longestString;
	}

}
