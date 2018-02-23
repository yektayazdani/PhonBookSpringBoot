package com.phonebook.user.email;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface EmailRepository extends CrudRepository<Email, Integer> {
	public List<Email> findByContactId(Integer id);

}
