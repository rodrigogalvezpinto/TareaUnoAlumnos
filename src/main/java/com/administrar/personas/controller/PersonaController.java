package com.administrar.personas.controller;

import com.administrar.personas.model.Persona;
import com.administrar.personas.service.PersonaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/personas")
@Tag(name = "Personas API", description = "API para gestionar personas")
@RequiredArgsConstructor
public class PersonaController {

    private final PersonaService personaService;
    
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Crear una nueva persona", description = "Crea una nueva persona en la base de datos")
    public ResponseEntity<Persona> crearPersona(@RequestBody Persona persona) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(personaService.guardarPersona(persona));
    }

    @GetMapping(value = "/{identificador}", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Buscar persona por identificador", description = "Busca una persona por su identificador único")
    public ResponseEntity<Persona> buscarPorIdentificador(@PathVariable String identificador) {
        return personaService.buscarPorIdentificador(identificador)
                .map(persona -> ResponseEntity.ok(persona))
                .orElse(ResponseEntity.notFound().build());
    }


} 