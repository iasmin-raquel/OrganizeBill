package br.edu.ufape.organizeBill.exception.types;

import br.edu.ufape.organizeBill.exception.types.global.ExceptionCustomized;

@SuppressWarnings("serial")
public class BusinessException extends ExceptionCustomized{
    public BusinessException(String code, String message) {
        super(code, message);
    }
}
