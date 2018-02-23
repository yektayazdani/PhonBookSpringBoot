package com.phonebook.user.email;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmailService {
	
	@Autowired
	private EmailRepository emailRepository;
	
	public List<Email> getAllEmails(Integer id){
		List<Email> contacts = new ArrayList<>();
		emailRepository.findByContactId(id).forEach(contacts::add);
		return contacts;
	}
	
	public Email getEmailbyId(Integer id) {
		return emailRepository.findOne(id);
	}
	
	public void addEmailforContact(Email email) {
		emailRepository.save(email);
	}
	
	public void updateEmailId(Email email) {
		emailRepository.save(email);
	}
	
	public void deleteEmailId(Integer id)
	{
		emailRepository.delete(id);
	}
}
