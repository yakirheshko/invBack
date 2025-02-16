package com.app.inv.repository;

import com.app.inv.repository.dto.RequestDTO;
import com.app.inv.repository.dto.ResponseDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ResponsesRepository extends JpaRepository<ResponseDTO, UUID> {

}
