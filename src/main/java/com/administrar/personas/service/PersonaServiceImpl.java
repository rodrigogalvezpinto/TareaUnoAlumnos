package com.administrar.personas.service;

import com.administrar.personas.model.Persona;
import com.administrar.personas.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository personaRepository;
    
    @Autowired
    public PersonaServiceImpl(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }
    
    @Override
    public Persona guardarPersona(Persona persona) {
        return personaRepository.save(persona);
    }
    
    @Override
    public Optional<Persona> buscarPorIdentificador(String identificador) {
        return personaRepository.findByIdentificador(identificador);
    }

    @Override
    public List<Persona> getAll() {
        return personaRepository.findAll();
    }
} 