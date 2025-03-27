package com.administrar.personas.repository;

import com.administrar.personas.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    
    Optional<Persona> findByIdentificador(String identificador);
} 