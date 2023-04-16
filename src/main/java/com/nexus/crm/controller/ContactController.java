package com.nexus.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nexus.crm.entities.Billing;
import com.nexus.crm.entities.Contact;
import com.nexus.crm.service.BillingService;
import com.nexus.crm.service.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/listContacts")
	public String listContacts(Model model) {
		List<Contact> contacts = contactService.getContact();
		model.addAttribute("contacts",contacts);
		return"list_contacts";
	}
	
	@RequestMapping("/createBill")
	public String createBill(@RequestParam("id") long id,Model model) {
		Contact contact=contactService.getContactById(id);
		model.addAttribute("contact", contact);
		return"generate_bill";
	}
	
	@RequestMapping("/saveBill")
	public String saveBill(Billing bill) {
		billingService.generateBill(bill);
		return"list_bills";
	}
}
