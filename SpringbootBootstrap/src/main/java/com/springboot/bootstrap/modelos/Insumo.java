
package com.springboot.bootstrap.modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
// le acemos saber que es una entidad
@Entity
@Table(name = "insumos")
public class Insumo {
    // genera el ide de tablas de forma automatica
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_informe", nullable = false)
    private Integer id;

    @Column(name="tipo")
    private String tipo;

    @Column(name="nombre")
    private String nombre;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="cantidad")
    private Integer cantidad;

    @Column(name="costo")
    private Double costo;

}
