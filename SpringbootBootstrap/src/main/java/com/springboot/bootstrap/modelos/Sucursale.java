
//Anotacion: Para esta iteraciòn solamente se utilizaran los modelos usuarios y pedidos

package com.springboot.bootstrap.modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
// contrutor sin argumento
@NoArgsConstructor
@Entity
@Table(name = "sucursales")
public class Sucursale {
//id generado de forma automatica
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_grafica", nullable = false)
    private Integer id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="razon_social")
    private Integer razon_social;

    @Column(name="calle")
    private String calle;

    @Column(name="altura")
    private String altura;

    @ManyToOne
    //La anotación @JoinColumn se usa para especificar el mapeo
    //    de una columna para una referencia
    @JoinColumn(name="id_usuario")
    private Usuario Usuario;


}

