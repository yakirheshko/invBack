package com.app.inv.repository.customer;

import com.app.inv.repository.customer.dto.RequestDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CustomerRepository extends JpaRepository<RequestDTO, UUID> {

}
