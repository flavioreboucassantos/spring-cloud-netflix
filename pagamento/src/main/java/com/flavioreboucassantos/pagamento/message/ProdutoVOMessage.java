package com.flavioreboucassantos.pagamento.message;

import java.io.Serializable;

import com.flavioreboucassantos.pagamento.data.vo.ProdutoVO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoVOMessage implements Serializable {
	private static final long serialVersionUID = -1058764177809720488L;

	String message;
	
	private ProdutoVO produtoVO; 

}
