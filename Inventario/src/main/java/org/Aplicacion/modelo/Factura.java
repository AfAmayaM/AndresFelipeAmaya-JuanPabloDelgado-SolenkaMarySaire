package org.example.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Factura {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, length = 50)
    @EqualsAndHashCode.Include
    private int codigo;
    @Column(nullable = false)
    private Date fecha;

    @Column(nullable = false,length = 10)
    private double valor_total;

    @Column(nullable = false,length = 255)
    private String direccion;

    @Column(nullable = false, length = 255)
    private String correo;
    @Column(length = 20)
    private String telefono;

    @Column(length = 20)
    private String contrasenia;
}
