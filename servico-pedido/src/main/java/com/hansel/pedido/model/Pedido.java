package com.hansel.pedido.model;

import java.math.BigDecimal;

public class Pedido {
    private Long id;
    private Long produtoId;
    private String produtoNome;
    private BigDecimal produtoPreco;
    private int quantidade;
    private BigDecimal total;

    public Pedido() {};

    public Pedido (Long id, Long produtoId, String produtoNome, BigDecimal produtoPreco, int quantidade) {
        this.id = id;
        this.produtoId = produtoId;
        this.produtoNome = produtoNome;
        this.produtoPreco = produtoPreco;
        this.quantidade = quantidade;
        this.total = produtoPreco.multiply(BigDecimal.valueOf(quantidade));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Long produtoId) {
        this.produtoId = produtoId;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public BigDecimal getProdutoPreco() {
        return produtoPreco;
    }

    public void setProdutoPreco(BigDecimal produtoPreco) {
        this.produtoPreco = produtoPreco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
