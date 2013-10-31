package ahebert.fileIO;

import java.io.IOException;

public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws IOException
	 */
	public static void main(String[] args){

		Contacts con = new Contacts();
		con.LoadingFile();
		while(con.shouldGo())
		{
			con.Selection();
		}

	}
}