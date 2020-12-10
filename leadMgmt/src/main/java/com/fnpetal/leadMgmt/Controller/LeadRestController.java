package com.fnpetal.leadMgmt.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fnpetal.leadMgmt.Entity.Lead;
import com.fnpetal.leadMgmt.Exception.LeadNotFoundException;
import com.fnpetal.leadMgmt.Repository.LeadDaoService;

@RestController
public class LeadRestController {

	@Autowired
	LeadDaoService leadDaoSrvice;
	
	@GetMapping("/")
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/leads")
   public List<Lead> getAllLeads(){
	   return leadDaoSrvice.getLeads();
	 
   }
	
	@GetMapping("/leads/{id}")
	public Lead getLeadById(@PathVariable int id) throws Exception {
		Lead lead=leadDaoSrvice.getLeadById(id);
		if(lead==null) {
			throw new LeadNotFoundException("ID is not present :"+id);
		}
		return lead;
	}
	
}
