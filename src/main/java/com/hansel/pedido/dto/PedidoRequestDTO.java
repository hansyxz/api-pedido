package com.hansel.pedido.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Schema(
        description = "Descrição geral do DTO, ex: dados para criar um pedido",
        requiredProperties = { "produtoId", "quantidade"})
public class PedidoRequestDTO {

    @NotNull(message = "O id do produto é obrigatório!")
    @Schema(description = "ID único do produto", example = "1")
    private Long produtoId;

    @Min(value = 1, message = "A quantidade deve ser no mínimo 1")
    @Schema(description = "Quantidade do produto no pedido", example = "3")
    private int quantidade;

    public PedidoRequestDTO() {}

    public PedidoRequestDTO(Long produtoId, int quantidade) {
        this.produtoId = produtoId;
        this.quantidade = quantidade;
    }

    public Long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Long produtoId) {
        this.produtoId = produtoId;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
