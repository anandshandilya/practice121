package com.fnpetal.leadMgmt.Entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Value;

public class Lead {

	
	Lead(){}
	
	@NotNull
	private int Id;
	
	@NotNull
	private String FirstName;
	
	@NotNull
	private String LastName;
	
	//unique
	@NotNull
	@Size(min=10,max=10)
	private String Mobile;
	
	//unique
	@NotNull
	private String mail;
	
	@NotNull
	private LocationType locationType ;
	
	@NotNull
	private String LocationString;
	
	@NotNull
	private Status status;
	
	@Value("null")
	private String Communication;

	public Lead(@NotNull int id, @NotNull String firstName, @NotNull String lastName,
			@NotNull @Size(min = 10, max = 10) String mobile, @NotNull String mail, @NotNull LocationType locationType,
			@NotNull String locationString, @NotNull Status status, String communication) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		Mobile = mobile;
		this.mail = mail;
		this.locationType = locationType;
		LocationString = locationString;
		this.status = status;
		Communication = communication;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public LocationType getLocationType() {
		return locationType;
	}

	public void setLocationType(LocationType locationType) {
		this.locationType = locationType;
	}

	public String getLocationString() {
		return LocationString;
	}

	public void setLocationString(String locationString) {
		LocationString = locationString;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getCommunication() {
		return Communication;
	}

	public void setCommunication(String communication) {
		Communication = communication;
	}

	@Override
	public String toString() {
		return "Lead [Id=" + Id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Mobile=" + Mobile
				+ ", mail=" + mail + ", locationType=" + locationType + ", LocationString=" + LocationString
				+ ", status=" + status + ", Communication=" + Communication + "]";
	}
	
	
	
	
	
}
