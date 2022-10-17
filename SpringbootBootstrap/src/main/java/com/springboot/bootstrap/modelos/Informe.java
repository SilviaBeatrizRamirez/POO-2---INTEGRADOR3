
//Anotacion: Para esta iteraciòn solamente se utilizaran los modelos usuarios y pedidos

package com.springboot.bootstrap.modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "informes")
public class Informe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_informe", nullable = false)
    private Integer id;

    @Column(name="estado")
    private String estado;

    @Column(name="descripcion")
    private String descripcion;
    @OneToOne
    @JoinColumn(name="id_pedido")
    private Pedido pedidos;
}
