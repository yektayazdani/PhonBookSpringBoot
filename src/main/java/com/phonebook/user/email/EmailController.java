package com.phonebook.user.email;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.phonebook.user.contacts.Contacts;

@RestController
public class EmailController {
	@Autowired
	private EmailService emailservice;
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/contacts/{contactid}/emails")
	public List<Email> getAllEmails(@PathVariable Integer contactid)
	{
		return emailservice.getAllEmails(contactid);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/contacts/{contactid}/emails/{id}")
	public Email getEmailbyId(@PathVariable Integer id)
	{
		return emailservice.getEmailbyId(id);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method= RequestMethod.POST, value = "/contacts/{contactid}/emails")
	public void addEmailtoContacts(@PathVariable Integer contactid, @RequestBody Email email) {
		email.setContact(new Contacts(contactid,"","",""));
		emailservice.addEmailforContact(email);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method = RequestMethod.PUT, value = "/contacts/{contactid}/emails/{id}")
	public void updateEmailId(@PathVariable Integer contactid, @RequestBody Email email){
		email.setContact(new Contacts(contactid,"","",""));
		emailservice.addEmailforContact(email);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method = RequestMethod.DELETE, value="/contacts/{contactid}/emails/{id}")
	public void deleteEmailId(@PathVariable Integer id){
		emailservice.deleteEmailId(id);
	}

}
