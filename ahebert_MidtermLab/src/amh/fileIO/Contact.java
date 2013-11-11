package amh.fileIO;

import java.util.Comparator;

public class Contact implements Comparable <Contact> {
	
	public String name,email,phone,birthDate;
	Contact(String[] conInfo)
	{
		name = conInfo[0];
		phone = conInfo[1];
		birthDate = conInfo[2];
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return name+","+phone +"," + birthDate;
	}

	@Override
	public int compareTo(Contact o2) {
		return name.compareTo(o2.name);
	}

	

}