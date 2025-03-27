package com.administrar.personas.service;

import com.administrar.personas.model.Persona;

import java.util.Optional;

import java.util.List;

public interface PersonaService {
    
    Persona guardarPersona(Persona persona);
    
    Optional<Persona> buscarPorIdentificador(String identificador);

     List<Persona> getAll();
}