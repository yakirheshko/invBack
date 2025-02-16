package com.app.inv.repository;

import com.app.inv.repository.dto.BusinessDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BusinessRepository extends JpaRepository<BusinessDTO, UUID> {
    BusinessDTO getByDeviceId(String deviceId);
}