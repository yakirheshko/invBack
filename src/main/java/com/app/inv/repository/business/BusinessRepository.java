package com.app.inv.repository.business;

import com.app.inv.repository.business.dto.BusinessDTO;
import com.app.inv.repository.customer.dto.RequestDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BusinessRepository extends JpaRepository<BusinessDTO, UUID> {

}
