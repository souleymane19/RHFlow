package com.RhFlow.backend.repositorys;

import com.RhFlow.backend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
