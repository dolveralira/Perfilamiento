package com.cibanco.cinet.repository;

import com.cibanco.cinet.models.entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<ProfileEntity, Long> {
}