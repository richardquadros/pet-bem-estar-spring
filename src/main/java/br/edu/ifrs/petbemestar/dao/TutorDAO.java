package br.edu.ifrs.petbemestar.dao;
import java.util.List;

import br.edu.ifrs.petbemestar.dominio.*;
public interface TutorDAO {

	public List<Tutor> listarTodos();
	Tutor buscarPorId(Long id);
	public void salvar(Tutor tutor);
	public void atualizar(Tutor tutor);
	public void remover(Long id);
}