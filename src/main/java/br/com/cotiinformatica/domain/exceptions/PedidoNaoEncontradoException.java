package br.com.cotiinformatica.domain.exceptions;

import java.text.MessageFormat;
import java.util.UUID;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PedidoNaoEncontradoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7315852459674962975L;
	
	private final UUID pedidoId;
	
	@Override
	public String getMessage() {
		return MessageFormat.format("O pedido ''{0}''  não foi encontrado ", pedidoId);
	}

}
