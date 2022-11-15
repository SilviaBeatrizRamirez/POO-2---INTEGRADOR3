package com.springboot.bootstrap.servicios;


import com.springboot.bootstrap.modelos.Pedido;

import java.util.List;

public interface PedidoServicio {
//contiene una lista de los pedidos  realizado por cada cliente
	public List<Pedido> listarTodosLosPedidos();
	//guarda los pedido
	public Pedido guardarPedido(Pedido pedido);
	//estrae o muestra los pedidos  de la base de dato  por el id
	public Pedido obtenerPedidoPorId(Long id);
	// actualiza  el pedido  si esta realizado,en proceso
	public Pedido actualizarPedido(Pedido pedido);
	//elimina  el pedido  de la base de dato
	public void eliminarPedido(Long id);
}
