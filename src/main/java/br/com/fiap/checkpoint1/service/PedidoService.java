package br.com.fiap.checkpoint1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.fiap.checkpoint1.model.Pedido;
import br.com.fiap.checkpoint1.repository.PedidoRepository;

import java.time.LocalDate;
import java.util.List;

// Classe responsável pelas regras de negócio da aplicação
@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    // Retorna todos os pedidos cadastrados
    public List<Pedido> listar() {
        return repository.findAll();
    }

    // Busca um pedido pelo ID
    public Pedido buscar(Long id) {
        return repository.findById(id).orElseThrow();
    }

    // Salva um novo pedido com a data atual
    public Pedido salvar(Pedido pedido) {
        pedido.setDataPedido(LocalDate.now());
        return repository.save(pedido);
    }

    // Atualiza um pedido existente
    public Pedido atualizar(Long id, Pedido novo) {
        Pedido pedido = buscar(id);
        pedido.setClienteNome(novo.getClienteNome());
        pedido.setValorTotal(novo.getValorTotal());
        return repository.save(pedido);
    }

    // Remove um pedido pelo ID
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}