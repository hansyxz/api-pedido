package com.hansel.pedido.service;

import com.hansel.pedido.cliente.ProdutoClient;
import com.hansel.pedido.dto.PedidoRequestDTO;
import com.hansel.pedido.dto.PedidoResponseDTO;
import com.hansel.pedido.dto.ProdutoResponseDTO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PedidoService {

    private ProdutoClient produtoClient;

    public PedidoService(ProdutoClient produtoClient) {
        this.produtoClient = produtoClient;
    }

    public PedidoResponseDTO criarPedido(PedidoRequestDTO dto) {
        ProdutoResponseDTO produto = produtoClient.buscarProdutoPorId(dto.getProdutoId());

        BigDecimal total = produto.getPreco().multiply(BigDecimal.valueOf(dto.getQuantidade()));

        return new PedidoResponseDTO(
                null,
                produto.getId(),
                produto.getNome(),
                produto.getPreco(),
                dto.getQuantidade(),
                total
        );
    }
}
