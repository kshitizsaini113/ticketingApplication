package com.kshitizsaini113.tickets.registration.repository;

import com.kshitizsaini113.tickets.registration.bean.Registration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegistrationRepository extends MongoRepository<Registration, String> {


    Optional<Registration> findByTicketCode(String ticketCode);

    void deleteByTicketCode(String ticketCode);
}
