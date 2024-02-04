package br.edu.ufape.organizeBill.exception;

import br.edu.ufape.organizeBill.exception.types.NotFoundException;

@SuppressWarnings("serial")
public class IdNotFoundException extends NotFoundException {

	public IdNotFoundException(Long Id, String Classe) {
		super("001", ("Id " +Id + " da Classe " +Classe + " não encontrado"));
	}
	
	public IdNotFoundException(String Id, String Classe) {
		super("001", ("Id " +Id + " da Classe " +Classe + " não encontrado"));
	}

}