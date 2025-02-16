package com.app.inv.repository;

import com.app.inv.repository.dto.RequestDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RequestsRepository extends JpaRepository<RequestDTO, UUID> {
    List<RequestDTO> findByCategory(String deviceId);

    @Query("SELECT r FROM RequestDTO r " +
            "LEFT JOIN ResponseDTO resp ON r.id = resp.requestId AND resp.deviceId = :deviceId " +
            "WHERE resp IS NULL AND r.category = :category")
    List<RequestDTO> findRequestsWithoutResponse(@Param("deviceId") String deviceId, @Param("category") String category);
}
