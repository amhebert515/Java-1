package ahebert.fileIO;

public class Contact {
	
	public String name,email,phone;
	
	Contact(String[] conInfo)
	{
		name = conInfo[0];
		email = conInfo[1];
		phone = conInfo[2];
		
	}
	
	@Override
	public String toString()
	{
		return name+","+email+","+phone;
	}
}
