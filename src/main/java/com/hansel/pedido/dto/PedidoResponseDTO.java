package com.hansel.pedido.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

@Schema(description = "DTO de resposta com os dados do pedido")
public class PedidoResponseDTO {

    @Schema(description = "ID do pedido", example = "5")
    private final Long id;

    @Schema(description = "ID do produto associado ao pedido", example = "1")
    private final Long produtoId;

    @Schema(description = "Nome do produto", example = "Camiseta Estampada")
    private final String produtoNome;

    @Schema(description = "Preço do produto", example = "59.90")
    private final BigDecimal produtoPreco;

    @Schema(description = "Quantidade de itens no pedido", example = "2")
    private final int quantidade;

    @Schema(description = "Valor total do pedido", example = "119.80")
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
