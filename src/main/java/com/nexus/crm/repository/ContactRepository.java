package com.nexus.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexus.crm.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
