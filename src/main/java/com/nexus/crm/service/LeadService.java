package com.nexus.crm.service;

import java.util.List;

import com.nexus.crm.entities.Lead;

public interface LeadService {
	public void saveOneLead(Lead lead);
	
	public Lead getLeadById(Long id);
	
	public void deleteLeadById(Long id);
	
	public List<Lead> getAllLeads();
}
