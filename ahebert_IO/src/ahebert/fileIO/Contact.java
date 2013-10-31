package ahebert.fileIO;

public class Contact {
	
	public String name,phone,bDay;
	
	Contact(String[] conInfo)
	{
		name = conInfo[0];
		phone = conInfo[1];
		bDay = conInfo[2];
		
	}
	
	@Override
	public String toString()
	{
		return name+","+phone+","+bDay;
	}
}
