package com.hansel.pedido.service;

import com.hansel.pedido.cliente.ProdutoClient;
import com.hansel.pedido.dto.PedidoRequestDTO;
import com.hansel.pedido.dto.PedidoResponseDTO;
import com.hansel.pedido.dto.ProdutoResponseDTO;
import com.hansel.pedido.model.Pedido;
import com.hansel.pedido.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    private final ProdutoClient produtoClient;
    private final PedidoRepository pedidoRepository;

    public PedidoService(ProdutoClient produtoClient, PedidoRepository pedidoRepository) {
        this.produtoClient = produtoClient;
        this.pedidoRepository = pedidoRepository;
    }

    public PedidoResponseDTO criarPedido(PedidoRequestDTO resquest) {
        ProdutoResponseDTO produto = produtoClient.buscarProdutoPorId(resquest.getProdutoId());

        Pedido pedido = new Pedido(
                produto.getId(),
                produto.getNome(),
                produto.getPreco(),
                resquest.getQuantidade()
        );

        Pedido salvo = pedidoRepository.save(pedido);

        return converterParaDTO(salvo);
    }

    public Optional<PedidoResponseDTO> buscarPorId(Long id) {
        return pedidoRepository.findById(id)
                .map(this::converterParaDTO);
    }

    public List<PedidoResponseDTO> listarTodos() {
        return pedidoRepository.findAll()
                .stream()
                .map(this::converterParaDTO)
                .toList();
    }

    private PedidoResponseDTO converterParaDTO(Pedido pedido) {
        return new PedidoResponseDTO(
                pedido.getId(),
                pedido.getProdutoId(),
                pedido.getProdutoNome(),
                pedido.getProdutoPreco(),
                pedido.getQuantidade(),
                pedido.getTotal()
        );
    }
}
