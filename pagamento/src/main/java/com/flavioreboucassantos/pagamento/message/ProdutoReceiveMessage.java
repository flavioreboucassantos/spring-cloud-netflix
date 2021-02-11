package com.flavioreboucassantos.pagamento.message;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.flavioreboucassantos.pagamento.entity.Produto;
import com.flavioreboucassantos.pagamento.repository.ProdutoRepository;

@Component
public class ProdutoReceiveMessage {

	private final ProdutoRepository produtoRepository;

	public ProdutoReceiveMessage(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}

	@RabbitListener(queues = { "${crud.rabbitmq.queue}" })
	public void receiveMessage(@Payload ProdutoVOMessage message) {
		switch (message.getMessage()) {
		case "create":
			produtoRepository.save(Produto.create(message.getProdutoVO()));
			break;
		case "update":
			produtoRepository.save(Produto.create(message.getProdutoVO()));
			break;
		case "delete":
			produtoRepository.delete(Produto.create(message.getProdutoVO()));
			break;
		}
	}

}
