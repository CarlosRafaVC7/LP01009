package pe.edu.upeu.LP2_clase01tarea.serviceImpl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.LP2_clase01tarea.dao.UsuarioDao;
import pe.edu.upeu.LP2_clase01tarea.entity.Usuario;
import pe.edu.upeu.LP2_clase01tarea.service.UsuarioService;
@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioDao dao;
	
	@Override
	public Usuario create(Usuario u) {
		// TODO Auto-generated method stub
		return dao.create(u);
	}

	@Override
	public Usuario update(Usuario u) {
		// TODO Auto-generated method stub
		return dao.update(u);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Usuario> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}