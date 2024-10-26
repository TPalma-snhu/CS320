package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ContactServices.Contact;

class ContactTest {

    @Test
    void testContactClass() {
        Contact contact = new Contact("1", "Kevin", "Durant", "5555555555", "555 North Street");
        
        assertEquals("1", contact.getContactId());
        assertEquals("Kevin", contact.getFirstName());
        assertEquals("Durant", contact.getLastName());
        assertEquals("5555555555", contact.getPhone());
        assertEquals("555 North Street", contact.getAddress());
    }

    @Test
    void testContactIdContainsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "Kevin", "Durant", "5555555555", "555 North Street");
        });
    }
    
    @Test
    void testContactIdTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678910", "Kevin", "Durant", "5555555555", "555 North Street");
        });
    }

    @Test
    void testFirstNameContainsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", null, "Durant", "5555555555", "555 North Street");
        });
    }

    @Test
    void testFirstNameTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "12345678910", "Durant", "5555555555", "555 North Street");
        });
    }

    @Test
    void testLastNameContainsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "Kevin", null, "5555555555", "555 North Street");
        });
    }

    @Test
    void testLastNameTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "Kevin", "12345678910", "5555555555", "555 North Street");
        });
    }

    @Test
    void testPhoneContainsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "Kevin", "Durant", null, "555 North Street");
        });
    }

    @Test
    void testPhoneTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "Kevin", "Durant", "12345678910", "555 North Street");
        });
    }

    @Test
    void testPhoneTooShort() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "Kevin", "Durant", "123456789", "555 North Street");
        });
    }

    @Test
    void testAddressContainsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "Kevin", "Durant", "5555555555", null);
        });
    }

    @Test
    void testAddressTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "Kevin", "Durant", "5555555555", "1234567890123456789012345678901");
        });
    }

    // Setters broken down into individual tests

    @Test
    void testSetFirstNameValid() {
        Contact contact = new Contact("1", "Kevin", "Durant", "5555555555", "555 North Street");
        contact.setFirstName("John");
        assertEquals("John", contact.getFirstName());
    }

    @Test
    void testSetFirstNameContainsNull() {
        Contact contact = new Contact("1", "Kevin", "Durant", "5555555555", "555 North Street");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            contact.setFirstName(null);
        });
    }

    @Test
    void testSetFirstNameTooLong() {
        Contact contact = new Contact("1", "Kevin", "Durant", "5555555555", "555 North Street");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            contact.setFirstName("12345678910");
        });
    }

    @Test
    void testSetLastNameValid() {
        Contact contact = new Contact("1", "Kevin", "Durant", "5555555555", "555 North Street");
        contact.setLastName("Smith");
        assertEquals("Smith", contact.getLastName());
    }

    @Test
    void testSetLastNameContainsNull() {
        Contact contact = new Contact("1", "Kevin", "Durant", "5555555555", "555 North Street");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            contact.setLastName(null);
        });
    }

    @Test
    void testSetLastNameTooLong() {
        Contact contact = new Contact("1", "Kevin", "Durant", "5555555555", "555 North Street");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            contact.setLastName("12345678910");
        });
    }

    @Test
    void testSetPhoneValid() {
        Contact contact = new Contact("1", "Kevin", "Durant", "5555555555", "555 North Street");
        contact.setNumber("9876543210");
        assertEquals("9876543210", contact.getPhone());
    }

    @Test
    void testSetPhoneContainsNull() {
        Contact contact = new Contact("1", "Kevin", "Durant", "5555555555", "555 North Street");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            contact.setNumber(null);
        });
    }

    @Test
    void testSetPhoneTooLong() {
        Contact contact = new Contact("1", "Kevin", "Durant", "5555555555", "555 North Street");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            contact.setNumber("12345678910");
        });
    }

    @Test
    void testSetPhoneTooShort() {
        Contact contact = new Contact("1", "Kevin", "Durant", "5555555555", "555 North Street");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            contact.setNumber("12345");
        });
    }

    @Test
    void testSetAddressValid() {
        Contact contact = new Contact("1", "Kevin", "Durant", "5555555555", "555 North Street");
        contact.setAddress("123 New Street");
        assertEquals("123 New Street", contact.getAddress());
    }

    @Test
    void testSetAddressContainsNull() {
        Contact contact = new Contact("1", "Kevin", "Durant", "5555555555", "555 North Street");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            contact.setAddress(null);
        });
    }

    @Test
    void testSetAddressTooLong() {
        Contact contact = new Contact("1", "Kevin", "Durant", "5555555555", "555 North Street");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            contact.setAddress("1234567890123456789012345678901");
        });
    }
    
}
