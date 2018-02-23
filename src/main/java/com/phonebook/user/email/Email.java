package com.phonebook.user.email;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.phonebook.user.contacts.Contacts;


@Entity
@Table(name="emails")
public class Email {
	
	@Column(name="emailid")
	private String emailid;
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID", updatable=false)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="contactid", nullable=false)
	private Contacts contact;
	
	public Email()
	{}
	public Email(Integer id, Integer contactid, String emailid)
	{
		super();
		this.id = id;
		this.emailid = emailid;
	}
	
	public void setID(Integer id)
	{
		this.id = id;
	}
	
	public Integer getID()
	{
		return id;
	}

	public void setEmailId(String emailid)
	{
		this.emailid = emailid;
	}
	public String getEmailId()
	{
		return this.emailid;
	}
	
	public void setContact(Contacts contact)
	{
		this.contact = contact;
	}
	
	public Contacts getContact() {
		return this.contact;
	}
}
