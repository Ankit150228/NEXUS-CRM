package com.nexus.crm.service;

import java.util.List;

import com.nexus.crm.entities.Contact;

public interface ContactService {
	public void saveContact(Contact contact);

	public List<Contact> getContact();

	public Contact getContactById(long id);
}
