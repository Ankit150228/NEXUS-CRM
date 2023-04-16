package com.nexus.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexus.crm.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing,Long> {

}
