package com.hansel.pedido.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

@Schema(description = "DTO de resposta com os dados do produto obtido do serviço de produtos")
public class ProdutoResponseDTO {

    @Schema(description = "ID do produto", example = "1")
    private Long id;

    @Schema(description = "Nome do produto", example = "Camiseta Estampada")
    private String nome;

    @Schema(description = "Descrição do produto", example = "Camiseta de algodão")
    private String descricao;

    @Schema(description = "Categoria do produto", example = "Roupas")
    private String categoria;

    @Schema(description = "Preço do produto", example = "59.90")
    private BigDecimal preco;

    @Schema(description = "URL da imagem do produto", example = "https://produto-image.jpg")
    private String imagem;

    public ProdutoResponseDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
