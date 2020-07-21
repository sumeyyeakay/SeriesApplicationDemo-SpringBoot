package com.sumeyyeakay.repository;

import com.sumeyyeakay.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    @Query(value = "SELECT * FROM role WHERE id= :givenId", nativeQuery = true)
    Optional<Role> findById(@Param("givenId") String givenId);

    @Query(value = "SELECT * FROM role WHERE name= :givenName", nativeQuery = true)
    Role findByName(@Param("givenName") String givenName);
}
