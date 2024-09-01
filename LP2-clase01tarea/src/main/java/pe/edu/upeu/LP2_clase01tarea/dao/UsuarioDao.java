package pe.edu.upeu.LP2_clase01tarea.dao;

import java.util.List;

import java.util.Optional;

import pe.edu.upeu.LP2_clase01tarea.entity.Usuario;


public interface UsuarioDao {
	Usuario create(Usuario u);
	Usuario update(Usuario u);
	void delete(Long id);
	Optional<Usuario> read(Long id);
	List<Usuario> readAll();
}

