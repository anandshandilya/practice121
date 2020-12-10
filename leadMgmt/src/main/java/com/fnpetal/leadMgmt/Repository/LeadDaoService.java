package com.fnpetal.leadMgmt.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fnpetal.leadMgmt.Entity.Lead;
import com.fnpetal.leadMgmt.Entity.LocationType;
import com.fnpetal.leadMgmt.Entity.Status;

@Component
public class LeadDaoService {

	private static List<Lead> leads=new ArrayList<>();
	
	static {
		
		leads.add(new Lead(1,"Anand","Shandilya","8130567298","an123@g.com",LocationType.COUNTRY,"Dubai",Status.CONTACTED,"CommunicatinByPhone"));
		leads.add(new Lead(2,"Debu","Roy","8130567298","an123@g.com",LocationType.COUNTRY,"Dubai",Status.CONTACTED,"CommunicatinByPhone"));
		leads.add(new Lead(3,"Pihu","Mental","8130567298","an123@g.com",LocationType.COUNTRY,"Dubai",Status.CONTACTED,"CommunicatinByPhone"));
		leads.add(new Lead(4,"Shibu","Podu","8130567298","an123@g.com",LocationType.COUNTRY,"Dubai",Status.CONTACTED,"CommunicatinByPhone"));
		
	}
	
	public List<Lead> getLeads(){
		return leads;
	}
	
	public Lead getLeadById(int id) {
		for(Lead lead:leads) {
			if (lead.getId()==id) {
				return lead;
			}
		}
		return null;
	}
}
