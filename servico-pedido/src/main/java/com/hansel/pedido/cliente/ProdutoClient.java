package com.hansel.pedido.cliente;

import com.hansel.pedido.dto.ProdutoResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "produto", url = "http://localhost:8080")
public interface ProdutoClient {

    @GetMapping("/produtos/{id}")
    ProdutoResponseDTO buscarProdutoPorId(@PathVariable Long id);
}
