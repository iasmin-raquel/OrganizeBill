package br.edu.ufape.organizeBill.dto;

import java.time.LocalDate;
import br.edu.ufape.organizeBill.model.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter @NoArgsConstructor
public  class ReceitaResponse  {
	private long codReceita;
	private String descricao;
	private String tipoReceita;
	private Double valor;
	private LocalDate data;
	private boolean fixo;




	public ReceitaResponse(Receita obj) {
		this.codReceita = obj.getCodReceita();
		this.descricao = obj.getDescricao();
		this.tipoReceita = obj.getTipoReceita();
		this.valor = obj.getValor();
		this.data = obj.getData();
		this.fixo = obj.isFixo();

	}

	


}
