package br.com.fiap.checkpoint1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.fiap.checkpoint1.model.Pedido;
import br.com.fiap.checkpoint1.service.PedidoService;

import jakarta.validation.Valid;
import java.util.List;

// Classe responsável por expor os endpoints REST
@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;

    // Retorna a lista de todos os pedidos
    @GetMapping
    public List<Pedido> listar() {
        return service.listar();
    }

    // Retorna um pedido pelo ID
    @GetMapping("/{id}")
    public Pedido buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    // Cria um novo pedido
    @PostMapping
    public Pedido salvar(@RequestBody @Valid Pedido pedido) {
        return service.salvar(pedido);
    }

    // Atualiza um pedido existente
    @PutMapping("/{id}")
    public Pedido atualizar(@PathVariable Long id, @RequestBody @Valid Pedido pedido) {
        return service.atualizar(id, pedido);
    }

    // Remove um pedido pelo ID
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}