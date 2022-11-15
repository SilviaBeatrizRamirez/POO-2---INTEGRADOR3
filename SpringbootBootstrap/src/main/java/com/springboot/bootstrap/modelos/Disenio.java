package com.springboot.bootstrap.modelos;


import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
//generará un constructor sin parámetros
@NoArgsConstructor
//indicamos que es una entidad

@Entity
//especificamo el nombre que tendra la tabla en la base de dato
@Table(name = "DISENIO")
public class Disenio {
    // genera  el valor de id en la tabla de base de dato de manera automatica

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // not null indica que el campo no puede quedar vacio
    //el @column  permite que se realice la scolumnas de las tablas de datos
    @Column(name = "id_disenio", nullable = false)
    private Integer id;
    @Column(name="estado")
    private String estado;
    @Column(name="tipo_disenio")
    private String tipo_disenio;
    // define una relacion  de muchos a uno  con la tabla pedidos
    @ManyToOne
    //La anotación @JoinColumn se usa para especificar el
    // mapeo de una columna para una referencia
    @JoinColumn(name="id-pedido")
    private Pedido pedidos;


}
