package com.nexus.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexus.crm.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
