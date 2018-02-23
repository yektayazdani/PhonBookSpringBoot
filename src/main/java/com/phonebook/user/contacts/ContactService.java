package com.phonebook.user.contacts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ContactService {
	
	@Autowired
	private ContactRepository contactRepo;
	
	public List<Contacts> getAllContacts(){
		List<Contacts> contacts = new ArrayList<>();
		contactRepo.findAll().forEach(contacts::add);
		return contacts;
	}
	
	public Contacts getContactbyId(Integer id){
		return contactRepo.findOne(id);		
	}
	
	public void addContact(Contacts contact){
		contactRepo.save(contact);
	}
	
	public void updateContactbyId(Integer id, Contacts contact){
		contactRepo.save(contact);
	}
	
	public void deleteContactbyId(Integer id) {
		contactRepo.delete(id);
	}
}
