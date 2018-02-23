package com.phonebook.user.contacts;

import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contacts, Integer> {

}
