package br.edu.ufape.organizeBill.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

import br.edu.ufape.organizeBill.model.ObjetivoFinanceiro;
import br.edu.ufape.organizeBill.facade.Facade;
import br.edu.ufape.organizeBill.dto.*;


@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
@RequestMapping("/api/v1/")
public class ObjetivoFinanceiroController {
	@Autowired
	private Facade facade;
	
	@GetMapping("objetivoFinanceiro")
	public List<ObjetivoFinanceiroResponse> getAllObjetivoFinanceiro() {
		return facade.getAllObjetivoFinanceiro()
			.stream()
			.map(ObjetivoFinanceiroResponse::new)
			.toList();
	}
	
	@PostMapping("objetivoFinanceiro")
	public ObjetivoFinanceiroResponse createObjetivoFinanceiro(@Valid @RequestBody ObjetivoFinanceiroRequest newObj) {
		return new ObjetivoFinanceiroResponse(facade.saveObjetivoFinanceiro(newObj.toObjetivoFinanceiro()));
	}
	
	@GetMapping("objetivoFinanceiro/{id}")
	public ObjetivoFinanceiroResponse getObjetivoFinanceiroById(@PathVariable Long id) {
		try {
			return new ObjetivoFinanceiroResponse(facade.findObjetivoFinanceiroById(id));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ObjetivoFinanceiro " + id + " not found.");
		}
	}
	
	@PostMapping("objetivoFinanceiro/{id}")
	public ObjetivoFinanceiroResponse updateObjetivoFinanceiro(@PathVariable Long id, @Valid @RequestBody ObjetivoFinanceiroRequest obj) {
		try {
			ObjetivoFinanceiro o = obj.toObjetivoFinanceiro();
			o.setId(id);
			return new ObjetivoFinanceiroResponse(facade.updateObjetivoFinanceiro(o));
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ObjetivoFinanceiro " + id + " not found.");
		}
		
	}
	
	@DeleteMapping("objetivoFinanceiro/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		try {
			facade.deleteObjetivoFinanceiro(id);
			return "";
		} catch (RuntimeException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ObjetivoFinanceiro " + id + " not found.");
		}
		
	}
	

}
