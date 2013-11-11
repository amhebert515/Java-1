package amh.fileIO;

import java.util.Comparator;

public class compareDOB implements Comparator <Contact>
{

	@Override
	public int compare(Contact DOB1, Contact DOB2) {
		if(DOB1==null||DOB2==null||DOB1.getClass() !=DOB2.getClass())
		{
			return -1;
		}
	
		
		return DOB1.birthDate.compareTo(DOB2.birthDate);
	}
	
}