package com.RhFlow.backend.services.impls;

import com.RhFlow.backend.models.User;
import com.RhFlow.backend.repositorys.UserRepository;
import com.RhFlow.backend.services.UserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    @Override
    public void add(User user) {
        userRepository.save(user);
    }

    @Override
    public void update(Long id, User userDTO) {
        User user = userRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("User with id " + id + " not found")
        );
        // Copie toutes les propriétés non nulles de userDTO vers user
        user.setNom(userDTO.getNom());

        userRepository.save(user);

    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
