package com.springboot.bootstrap.repositorio;


import com.springboot.bootstrap.modelos.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//colocas @Override cuando vas a sobrescribir un método de una
//// clase al hacer herencia
@Repository
public interface PedidoRepositorio extends JpaRepository<Pedido, Long>{

}
