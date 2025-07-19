package com.hansel.pedido.exception;

import java.util.Map;

public class ErroValidacaoResponseDTO {

    private int status;
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
