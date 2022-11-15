
//Anotacion: Para esta iteraciòn solamente se utilizaran los modelos usuarios y pedidos

package com.springboot.bootstrap.modelos;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "stock")
public class Stock {
//genera  la id de forma automatica
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "id_stock")
    private Integer id;

    @NotNull
    @Column(name="pedido")
    private Integer pedidos;

    @Column(name="cantidad")
    private Integer cantidad;
    //una relacion  de mucho  a uno
    @ManyToOne
    //La anotación @JoinColumn se usa para especificar el mapeo
    // de una columna para una referencia
    @JoinColumn(name="id_insumos")
    private Insumo insumos;

}
