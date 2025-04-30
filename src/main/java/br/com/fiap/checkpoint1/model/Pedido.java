package br.com.fiap.checkpoint1.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

// Classe que representa a entidade Pedido no banco de dados
@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Identificador único do pedido
    private Long id;

    @NotBlank(message = "O nome do cliente é obrigatório.")
    // Nome do cliente (campo obrigatório)
    private String clienteNome;

    // Data do pedido (preenchida automaticamente com a data atual)
    private LocalDate dataPedido = LocalDate.now();

    @PositiveOrZero(message = "O valor total não pode ser negativo.")
    // Valor total do pedido (não pode ser negativo)
    private double valorTotal;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getClienteNome() { return clienteNome; }
    public void setClienteNome(String clienteNome) { this.clienteNome = clienteNome; }

    public LocalDate getDataPedido() { return dataPedido; }
    public void setDataPedido(LocalDate dataPedido) { this.dataPedido = dataPedido; }

    public double getValorTotal() { return valorTotal; }
    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }
}