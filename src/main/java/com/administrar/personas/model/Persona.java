package com.administrar.personas.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "personas")
@ToString
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;
    
    @Column(unique = true, nullable = false)
    @JsonProperty("identificador")
    private String identificador;
    
    @JsonProperty("nombre")
    private String nombre;
    
    @JsonProperty("apellido")
    private String apellido;
    
    @JsonProperty("edad")
    private int edad;
    
    @JsonProperty("email")
    private String email;
} 