package br.com.cotiinformatica.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/v1/pedidos")
@Tag(
		name = "Cotrole de Pedidos",
		description = "Serviços para gerenciamento de solicitações de pedidos."
)

public class PedidosController {
	
	@Operation(
			summary = "Cadastro de solicitações de pedidos.",
			description = "Cria uma nova solicitação de pedido do sistema."
			
	)
	@PostMapping
	public ResponseEntity<?> post(){
		return ResponseEntity.ok().build();
	}
	
	@Operation(
			summary = "Atualização de pedido.",
			description = "Modifica uma nova solicitação de pedido do sistema."
			
	)
	@PutMapping
	public ResponseEntity<?> put(){
		return ResponseEntity.ok().build();
	}
	
	@Operation(
			summary = "Inativação de pedido.",
			description = "Inativa um pedido do sistema."
			
	)
	@DeleteMapping
	public ResponseEntity<?> delete(){
		return ResponseEntity.ok().build();
	}
	
	@Operation(
			summary = "Consulta de pedidos.",
			description = "Retorna uma consulta paginada de pedidos."
			
	)
	@GetMapping
	public ResponseEntity<?> get(){
		return ResponseEntity.ok().build();
	}

}
