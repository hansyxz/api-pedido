package com.hansel.pedido.exception;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Map;

@Schema(description = "Resposta para erros de validação")
public class ErroValidacaoResponseDTO {

    @Schema(description = "Código HTTP do erro", example = "400")
    private int status;

    @Schema(description = "Mapeamento de campos e mensagens de erro")
    private Map<String, String> erros;

    public ErroValidacaoResponseDTO(int status, Map<String, String> erros) {
        this.status = status;
        this.erros = erros;
    }

    public int getStatus() {
        return status;
    }

    public Map<String, String> getErros() {
        return erros;
    }
}
