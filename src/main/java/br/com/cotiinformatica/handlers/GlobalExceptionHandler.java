package br.com.cotiinformatica.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.cotiinformatica.domain.exceptions.PedidoNaoEncontradoException;

import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    // Método para tratar a exceção MethodArgumentNotValidException
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        // Criando um mapa para armazenar as mensagens de erro
        Map<String, String> errors = new HashMap<>();
        
        // Iterando sobre todos os erros de campo
        ex.getBindingResult().getAllErrors().forEach(error -> {
            String fieldName = ((FieldError) error).getField();
            String message = error.getDefaultMessage();
            errors.put(fieldName, message);
        });
        
        // Retornando a resposta com status BAD REQUEST e as mensagens de erro
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
    
    // Método para tratar a exceção MethodArgumentNotValidException
    @ExceptionHandler(PedidoNaoEncontradoException.class)
    public ResponseEntity<Object> handlePedidoNaoEncontradoException(PedidoNaoEncontradoException ex) {
        // Criando um mapa para armazenar as mensagens de erro
        Map<String, String> errors = new HashMap<>();
        errors.put("error",ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(errors);
    }
}