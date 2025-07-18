package br.com.cotiinformatica.infrastructure.outbox;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class OutboxMessage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String aggregateType; //Ex: Pedido
	private String aggregateId;   //Ex: "123"
	private String type;		  //Ex: "PedidoCriado"
	private String payLoad;       //Ex: Dados do evento
	
	private boolean published = false;
	private LocalDateTime createdAt = LocalDateTime.now();
	private LocalDateTime transmittedAt;
	
	
}
