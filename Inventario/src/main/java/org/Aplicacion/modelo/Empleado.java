package org.example.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Empleado {

    @Column(nullable = false, length = 255)
    private String id_empleado;
    @Column(nullable = false, length = 255)
    private String nombre;

    @Column(nullable = false,length = 255)
    private String apellido;

    @Column(nullable = false,length = 255)
    private String direccion;

    @Column(nullable = false, length = 255)
    private String correo;
    @Column(length = 20)
    private String telefono;

    @Column(length = 20)
    private String contrasenia;
}