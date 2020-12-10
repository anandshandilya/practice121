package com.fnpetal.leadMgmt.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.fnpetal.leadMgmt.Entity.Lead;
import com.fnpetal.leadMgmt.Exception.EmptyResponse;
import com.fnpetal.leadMgmt.Exception.ExceptionResponse;
import com.fnpetal.leadMgmt.Exception.ExceptionResponseNotFound;
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
	
	@ExceptionHandler(LeadNotFoundException.class)
	public final ResponseEntity<Object> handleUserNotFoundExceptions(Exception ex,WebRequest request){
		EmptyResponse errorResponse=new EmptyResponse();
		return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
	}
	/*@ExceptionHandler(LeadNotFoundException.class)
	public final ResponseEntity<Object> handleUserNotFoundExceptions(Exception ex,WebRequest request){
		ExceptionResponse errorResponse=new ExceptionResponse();
		return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
	}*/
	
}
