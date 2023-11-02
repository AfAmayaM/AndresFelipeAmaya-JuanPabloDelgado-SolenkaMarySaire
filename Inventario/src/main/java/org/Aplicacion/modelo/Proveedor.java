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
public class Proveedor {

    @Column(nullable = false, length = 255)
    private String id_proveedor;
    @Column(nullable = false, length = 255)
    private String nombre;

    @Column(nullable = false, length = 255)
    private String direccion;

    @Column(nullable = false, length = 255)
    private String correo;

    @Column(nullable = false, length = 255)
    private String telefono;

}
