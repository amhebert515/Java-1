package amh.fileIO;

import java.util.Comparator;

public class comparePhone implements Comparator <Contact>
{

	@Override
	public int compare(Contact phone1, Contact phone2) {
		// TODO Auto-generated method stub
		if(phone1==null||phone2==null||phone1.getClass() !=phone2.getClass())
		{
			return -1;
		}
	
		
		return phone1.phone.compareTo(phone2.phone);
	}
	
}