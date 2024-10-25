package com.RhFlow.backend.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "app_use")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "The  text must not be null and must contain at least one non-whitespace character")
    private String nom;
    @NotBlank(message = "The  text must not be null and must contain at least one non-whitespace character")

    private String prenom;
    private String email;
    private String telephone;
    private String poste;
    private String departement;
}
