
//Anotacion: Para esta iteraciòn solamente se utilizaran los modelos usuarios y pedidos

package com.springboot.bootstrap.modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "insumos")
public class Insumos {

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

}
