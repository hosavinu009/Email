package com.Email.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Email.Entity.EmailDetails;


@Repository

public interface EmailRepo extends JpaRepository<EmailDetails, Integer> {

}
