package com.hansel.pedido.dto;

import java.math.BigDecimal;

public class PedidoResponseDTO {
    private Long id;
    private String produtoNome;
    private BigDecimal produtoPreco;
    private int quantidade;
    private BigDecimal total;

    public PedidoResponseDTO() {
    }

    public PedidoResponseDTO(Long id, String produtoNome, BigDecimal produtoPreco, int quantidade, BigDecimal total) {
        this.id = id;
        this.produtoNome = produtoNome;
        this.produtoPreco = produtoPreco;
        this.quantidade = quantidade;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public BigDecimal getProdutoPreco() {
        return produtoPreco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public BigDecimal getTotal() {
        return total;
    }
}
