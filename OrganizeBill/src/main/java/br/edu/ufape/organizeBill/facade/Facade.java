package br.edu.ufape.organizeBill.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.organizeBill.model.*;
import br.edu.ufape.organizeBill.service.*;

@Service
public class Facade {
	//Despesas--------------------------------------------------------------
	@Autowired
	private DespesasService  despesasService;
		
	public Despesas saveDespesas(Despesas newInstance) {
		return despesasService.saveDespesas(newInstance);
	}

	public Despesas updateDespesas(Despesas transientObject) {
		return despesasService.updateDespesas(transientObject);
	}

	public Despesas findDespesasById(long id) {
		return despesasService.findDespesasById(id);
	}

	public List<Despesas> getAllDespesas() {
		return despesasService.getAllDespesas();
	}
	
	public List<Despesas> findByCategoria(long CategoriaId) {
		Categoria categoria = findCategoriaById(CategoriaId);
		return despesasService.findByCategoria(categoria);
	}

	public void deleteDespesas(Despesas persistentObject) {
		despesasService.deleteDespesas(persistentObject);
	}

	public void deleteDespesas(long id) {
		despesasService.deleteDespesas(id);
	}
	

	//Usuario--------------------------------------------------------------
	@Autowired
	private UsuarioService  usuarioService;
		
	public Usuario saveUsuario(Usuario newInstance) {
		return usuarioService.saveUsuario(newInstance);
	}

	public Usuario updateUsuario(Usuario transientObject) {
		return usuarioService.updateUsuario(transientObject);
	}

	public Usuario findUsuarioByCpf(String cpf) {
		return usuarioService.findUsuarioByCpf(cpf);
	}
	
	public double calcularTotalReceitasData(String cpf, String data, String tipo) {
	    return usuarioService.calcularTotalReceitasData(cpf,data, tipo);
	}

	public List<Usuario> getAllUsuario() {
		return usuarioService.getAllUsuario();
	}

	public void deleteUsuario(Usuario persistentObject) {
		usuarioService.deleteUsuario(persistentObject);
	}

	public void deleteUsuario(String cpf) {
		usuarioService.deleteUsuario(cpf);
	}
	

	//Categoria--------------------------------------------------------------
	@Autowired
	private CategoriaService  categoriaService;
		
	public Categoria saveCategoria(Categoria newInstance) {
		return categoriaService.saveCategoria(newInstance);
	}

	public Categoria updateCategoria(Categoria transientObject) {
		return categoriaService.updateCategoria(transientObject);
	}

	public Categoria findCategoriaById(long id) {
		return categoriaService.findCategoriaById(id);
	}

	public List<Categoria> getAllCategoria() {
		return categoriaService.getAllCategoria();
	}

	public void deleteCategoria(Categoria persistentObject) {
		categoriaService.deleteCategoria(persistentObject);
	}

	public void deleteCategoria(long id) {
		categoriaService.deleteCategoria(id);
	}
	

	//Receita--------------------------------------------------------------
	@Autowired
	private ReceitaService  receitaService;
		
	public Receita saveReceita(Receita newInstance) {
		return receitaService.saveReceita(newInstance);
	}

	public Receita updateReceita(Receita transientObject) {
		return receitaService.updateReceita(transientObject);
	}

	public Receita findReceitaById(long id) {
		return receitaService.findReceitaById(id);
	}

	public List<Receita> getAllReceita() {
		return receitaService.getAllReceita();
	}

	public void deleteReceita(Receita persistentObject) {
		receitaService.deleteReceita(persistentObject);
	}

	public void deleteReceita(long id) {
		receitaService.deleteReceita(id);
	}
	

	//ObjetivoFinanceiro--------------------------------------------------------------
	@Autowired
	private ObjetivoFinanceiroService  objetivoFinanceiroService;
		
	public ObjetivoFinanceiro saveObjetivoFinanceiro(ObjetivoFinanceiro newInstance) {
		return objetivoFinanceiroService.saveObjetivoFinanceiro(newInstance);
	}

	public ObjetivoFinanceiro updateObjetivoFinanceiro(ObjetivoFinanceiro transientObject) {
		return objetivoFinanceiroService.updateObjetivoFinanceiro(transientObject);
	}

	public ObjetivoFinanceiro findObjetivoFinanceiroById(long id) {
		return objetivoFinanceiroService.findObjetivoFinanceiroById(id);
	}

	public List<ObjetivoFinanceiro> getAllObjetivoFinanceiro() {
		return objetivoFinanceiroService.getAllObjetivoFinanceiro();
	}

	public void deleteObjetivoFinanceiro(ObjetivoFinanceiro persistentObject) {
		objetivoFinanceiroService.deleteObjetivoFinanceiro(persistentObject);
	}

	public void deleteObjetivoFinanceiro(long id) {
		objetivoFinanceiroService.deleteObjetivoFinanceiro(id);
	}
	

}