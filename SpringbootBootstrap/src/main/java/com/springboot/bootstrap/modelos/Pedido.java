
package com.springboot.bootstrap.modelos;



import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;

import java.util.List;

//especificamos que es una entidad
@Entity
@Table(name = "pedidos")
public class Pedido {
//genera el id  de la tabla automatico
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;

    @Column(name = "categoria", length = 50)
    @Nullable
    private String categoria;

    @Column(name = "dni", length = 50)
    @Nullable
    private Integer dni;

    @Column(name = "fechapedido", length = 50)
    @Nullable
    private String fechapedido;

    @Column(name = "estado", length = 50)
    @Nullable
    private String estado;

    @Column(name = "observaciones", length = 240)
    @Nullable
    private String observaciones;
//contrutor sin argumento
    public Pedido() {

    }
// contrutor con argumento
    public Pedido(Long id, String categoria, Integer dni, String fechapedido, String estado, String observaciones, List<Insumo> insumos) {
        this.id = id;
        this.categoria = categoria;
        this.dni = dni;
        this.fechapedido = fechapedido;
        this.estado = estado;
        this.observaciones = observaciones;
        this.insumos = insumos;
    }

    public Pedido(String categoria, Integer dni, String fechapedido, String estado, String observaciones, List<Insumo> insumos) {
        this.categoria = categoria;
        this.dni = dni;
        this.fechapedido = fechapedido;
        this.estado = estado;
        this.observaciones = observaciones;
        this.insumos = insumos;
    }
//el get se encarga de mostrar un valor a una propiedad o atributo de un objeto
    public Long getId() {
        return id;
    }
    // ver los set no van ya que no se debe permitir  cambiar
    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public List<Insumo> getInsumos() {
        return insumos;
    }

    public void setInsumos(List<Insumo> insumos) {
        this.insumos = insumos;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFechapedido() {
        return fechapedido;
    }

    public void setFechapedido(String fechapedido) {

        this.fechapedido = fechapedido;
    }
    // no  combiare pero recorda  que los get y set no va en las id
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {

        this.estado = estado;
    }

    public String getObservaciones() {

        return observaciones;
    }

    public void setObservaciones(String observaciones) {

        this.observaciones = observaciones;
    }
// colocas @Override cuando vas a sobrescribir un método de una
// clase al hacer herencia
    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", categoria='" + categoria + '\'' +
                ", dni=" + dni +
                ", fechapedido='" + fechapedido + '\'' +
                ", estado='" + estado + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", insumos=" + insumos +
                '}';
    }

    @ManyToMany// es una relacion de mucho  a mucho  con
    // la tabala pedido a la tabla  insumo
    @JoinTable(
            name = "pedido_tiene_insumos",
            //La anotación @JoinColumn se usa para especificar el
            // mapeo de una columna para una referencia
            joinColumns = @JoinColumn(name = "id_pedido"),
            inverseJoinColumns = @JoinColumn(name = "id_insumo"))
    List<Insumo> insumos;
}
