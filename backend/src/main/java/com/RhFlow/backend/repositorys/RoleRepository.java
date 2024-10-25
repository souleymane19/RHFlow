package com.RhFlow.backend.repositorys;

import com.RhFlow.backend.models.Role;
import com.RhFlow.backend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
