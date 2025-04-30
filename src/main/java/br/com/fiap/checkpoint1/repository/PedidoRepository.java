package br.com.fiap.checkpoint1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fiap.checkpoint1.model.Pedido;

// Interface que permite operações de banco de dados com a entidade Pedido
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}