package ContactServices;
import java.util.ArrayList;
import java.util.List;

public class ContactService {
	
	private List<Contact> contacts;
	
	public ContactService() {
        contacts = new ArrayList<>();
    }
	
	private Contact findContactById(String contactId) {
        for (Contact contact : contacts) {
            if (contact.getContactId().equals(contactId)) {
                return contact;
            }
        }
        return null; 
    }
	
	 public boolean addContact(String contactId, String firstName, String lastName, String phone, String address) {
	        if (findContactById(contactId) != null 
	        		) {
	        	return false;          
	            
	        }
	        Contact contact = new Contact(contactId, firstName, lastName, phone, address);
	        contacts.add(contact);
	        return true;
	    }
	 
	 public boolean deleteContact (String contactId) {
		 if (findContactById(contactId) != null) {
			 contacts.remove(findContactById(contactId));
			 return true;
		 }
		 
		  return false;
	 }
	
	public boolean updateFirstName (String contactId, String firstName) {
	
		if (findContactById(contactId) != null) {
			Contact temp = findContactById(contactId);
			temp.setFirstName(firstName);
			return true;
		}
		return false;
	}
	
	public boolean updateLastName (String contactId, String lastName) {
		 
	
		if (findContactById(contactId) != null) {
			Contact temp = findContactById(contactId);
			temp.setLastName(lastName);
			return true;
		}
		return false;
	}
	
	public boolean updatePhone (String contactId, String number) {
		 
	
		if (findContactById(contactId) != null) {
			Contact temp = findContactById(contactId);
			temp.setNumber(number);
			return true;
		}
		return false;
	}
	
	public boolean updateAddress (String contactId, String address) { 
	
		if (findContactById(contactId) != null) {
			Contact temp = findContactById(contactId);
			temp.setAddress(address);
			return true;
		}
		return false;
	}
	
	/*public void printList () {
		for (Contact x : contacts) {
			System.out.println(x.getFirstName() + " " + x.getLastName());
		}
	}*/

}
