package com.Email.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Entity
@Data
@Table(name="Emails")
@NoArgsConstructor
@AllArgsConstructor
public class EmailDetails {
	
	@Id
	@Column(name= "UserId")
	@GeneratedValue
	private int UserID;
	
    private String location;
    
    @Column(name= "ticket")
    private String TicketNumber;

}

