package com.phonebook.user.contacts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactsController {
	@Autowired
	private ContactService contactservice;
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/contacts")
	public List<Contacts> getAllContacts()
	{
		return contactservice.getAllContacts();
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/contacts/{id}")
	public Contacts getContactByID(@PathVariable Integer id)
	{
		return contactservice.getContactbyId(id);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method = RequestMethod.POST, value = "/contacts")
	public void addNewContact(@RequestBody Contacts contact)
	{
		contactservice.addContact(contact);		
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method = RequestMethod.PUT, value = "/contacts/{id}")
	public void updateContact(@PathVariable Integer id,@RequestBody Contacts contact) {
		contactservice.updateContactbyId(id, contact);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method = RequestMethod.DELETE, value = "/contacts/{id}")
	public void deleteContact(@PathVariable Integer id)
	{
		contactservice.deleteContactbyId(id);
	}

}
