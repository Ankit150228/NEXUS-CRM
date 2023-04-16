package com.nexus.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexus.crm.entities.Billing;
import com.nexus.crm.repository.BillingRepository;

@Service
public class BillingServiceimpl implements BillingService {
	
	@Autowired
	private BillingRepository billingRepo;
	@Override
	public void generateBill(Billing bill) {
		billingRepo.save(bill);
	}

}
