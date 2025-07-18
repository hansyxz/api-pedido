package com.hansel.pedido.dto;

import java.math.BigDecimal;

public class PedidoResponseDTO {
    private final Long id;
    private final Long produtoId;
    private final String produtoNome;
    private final BigDecimal produtoPreco;
    private final int quantidade;
    private final BigDecimal total;

    public PedidoResponseDTO(Long id, Long produtoId, String produtoNome, BigDecimal produtoPreco, int quantidade, BigDecimal total) {
        this.id = id;
        this.produtoId = produtoId;
        this.produtoNome = produtoNome;
        this.produtoPreco = produtoPreco;
        this.quantidade = quantidade;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public Long getProdutoId() {
        return produtoId;
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
