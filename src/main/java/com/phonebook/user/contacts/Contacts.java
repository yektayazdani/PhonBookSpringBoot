package com.phonebook.user.contacts;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="contacts")
public class Contacts {
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="phonenumber")
	private String phoneNumber;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID", updatable=false)
	private Integer id;

	
	
	public Contacts()
	{}
	public Contacts(Integer id, String firstName, String lastName, String phoneNumber)
	{
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}
	public Contacts(Integer id)
	{
		super();
		this.id = id;
	}
	
	public void setID(Integer id)
	{
		this.id = id;
	}
	
	public Integer getID()
	{
		return id;
	}
	////
	public void setFirstName(String first)
	{
		this.firstName = first;
	}
	public String getFirstName()
	{
		return firstName;
	}
	///
	public void setLastName(String last)
	{
		this.lastName = last;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	///
	public void setPhoneNumber(String phone)
	{
		this.phoneNumber = phone;
	}
	public String getPhoneNumber()
	{
		return this.phoneNumber;
	}
}
