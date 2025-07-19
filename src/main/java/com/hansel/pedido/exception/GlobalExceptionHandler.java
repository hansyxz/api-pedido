package com.hansel.pedido.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErroValidacaoResponseDTO> handleMethodArgumentNotValid(MethodArgumentNotValidException exception) {
        Map<String, String> erros = new HashMap<>();

        exception.getBindingResult().getFieldErrors()
                .forEach(field -> {
                    String campo = field.getField();
                    String mensagem = field.getDefaultMessage();
                    erros.put(campo, mensagem);
                });
        ErroValidacaoResponseDTO response = new ErroValidacaoResponseDTO(HttpStatus.BAD_REQUEST.value(), erros);

        return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }
}
