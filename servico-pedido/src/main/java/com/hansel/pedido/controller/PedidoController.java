package com.hansel.pedido.controller;

import com.hansel.pedido.dto.PedidoRequestDTO;
import com.hansel.pedido.dto.PedidoResponseDTO;
import com.hansel.pedido.service.PedidoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public ResponseEntity<PedidoResponseDTO> criar(@Valid @RequestBody PedidoRequestDTO pedidoRequestDTO) {
        PedidoResponseDTO pedidoCriado = pedidoService.criarPedido(pedidoRequestDTO);

        return ResponseEntity.ok(pedidoCriado);
    }
}
