package com.babs.senmatinfo.senmatinfo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.babs.senmatinfo.senmatinfo.models.ERole;
import com.babs.senmatinfo.senmatinfo.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
