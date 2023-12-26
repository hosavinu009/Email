package com.Email.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity

@Table(name="Emails")
public class ExcelEn {
	
	@Id
	@Column(name= "UserId")
   private int userid;
   private String location;
   private String ticket;
   
   
public int getUserID() {
	return userid;
}
public void setUserID(int userID) {
	this.userid = userID;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getTicket() {
	return ticket;
}
public void setTicket(String ticket) {
	this.ticket = ticket;
}



}


