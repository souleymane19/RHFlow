package com.RhFlow.backend.services.impls;

import com.RhFlow.backend.models.Role;
import com.RhFlow.backend.repositorys.RoleRepository;
import com.RhFlow.backend.services.RoleService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {
    private RoleRepository roleRepository;
    @Override
    public void add(Role role) {
        roleRepository.save(role);
    }

    @Override
    public void update(Long id, Role roleDto) {
        Role role = roleRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("role not found")
        );
        roleRepository.save(role);

    }

    @Override
    public void delete(Role role) {
        roleRepository.delete(role);
    }

    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }
}
