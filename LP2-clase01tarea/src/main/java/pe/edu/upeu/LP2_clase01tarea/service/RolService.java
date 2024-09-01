package pe.edu.upeu.LP2_clase01tarea.service;

import java.util.List;

import java.util.Optional;

import pe.edu.upeu.LP2_clase01tarea.entity.Rol;

public interface RolService {
	Rol create(Rol r);
	Rol update(Rol r);
	void delete(Long id);
	Optional<Rol> read(Long id);
	List<Rol> readAll();
}
