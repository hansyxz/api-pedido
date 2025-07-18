package com.hansel.pedido.controller;

import com.hansel.pedido.cliente.ProdutoClient;
import com.hansel.pedido.dto.ProdutoResponseDTO;
import com.hansel.pedido.model.Pedido;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final ProdutoClient produtoClient;

    public PedidoController(ProdutoClient produtoClient) {
        this.produtoClient = produtoClient;
    }

    @PostMapping
    public ResponseEntity<Pedido> criar(@RequestParam Long produtoId, @RequestParam int quantidade) {
        ProdutoResponseDTO produto = produtoClient.buscarProdutoPorId(produtoId);

        Pedido pedido =  new Pedido(
                null,
                produto.getId(),
                produto.getNome(),
                produto.getPreco(),
                quantidade
        );
        return ResponseEntity.ok(pedido);
    }
}
