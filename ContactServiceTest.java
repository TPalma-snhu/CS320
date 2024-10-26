package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ContactServices.ContactService;

class ContactServiceTest {

    private ContactService contactService;

    @BeforeEach
    void initializeInstance() {
        contactService = new ContactService();
        contactService.addContact("2", "Kevin", "Durant", "5555555555", "555 North Street");
    }

    @Test
    void testAddValidContact() {
        assertTrue(contactService.addContact("1", "Lebron", "James", "1234567890", "555 South Street"));
    }

    @Test
    void testAddDuplicateContact() {
        assertFalse(contactService.addContact("2", "LeBron", "James", "5555555555", "555 North Street"));
    }

    @Test
    void testDeleteContact() {
        assertTrue(contactService.deleteContact("2"));
    }

    @Test
    void testDeleteNonExistentContact() {
        assertFalse(contactService.deleteContact("999"));
    }

    @Test
    void testUpdateFirstNameValid() {
        assertTrue(contactService.updateFirstName("2", "Lebron"));
    }

    @Test
    void testUpdateFirstNameNonExistentContact() {
        assertFalse(contactService.updateFirstName("999", "Lebron"));
    }

    @Test
    void testUpdateAddressValid() {
        assertTrue(contactService.updateAddress("2", "555 South Street"));
    }

    @Test
    void testUpdateAddressNonExistentContact() {
        assertFalse(contactService.updateAddress("999", "555 South Street"));
    }

    @Test
    void testUpdateLastNameValid() {
        assertTrue(contactService.updateLastName("2", "James"));
    }

    @Test
    void testUpdateLastNameNonExistentContact() {
        assertFalse(contactService.updateLastName("999", "James"));
    }

    @Test
    void testUpdatePhoneValid() {
        assertTrue(contactService.updatePhone("2", "9876543210"));
    }

    @Test
    void testUpdatePhoneNonExistentContact() {
        assertFalse(contactService.updatePhone("999", "9876543210"));
    }

}
