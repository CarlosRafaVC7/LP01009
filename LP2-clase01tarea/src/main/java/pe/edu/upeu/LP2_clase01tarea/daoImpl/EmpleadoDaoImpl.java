package pe.edu.upeu.LP2_clase01tarea.daoImpl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.LP2_clase01tarea.dao.EmpleadoDao;
import pe.edu.upeu.LP2_clase01tarea.entity.Empleado;
import pe.edu.upeu.LP2_clase01tarea.repository.EmpleadoRepository;


@Component
public class EmpleadoDaoImpl implements EmpleadoDao {

	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Override
	public Empleado create(Empleado e) {
		// TODO Auto-generated method stub
		return empleadoRepository.save(e);
	}

	@Override
	public Empleado update(Empleado e) {
		// TODO Auto-generated method stub
		return empleadoRepository.save(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		empleadoRepository.deleteById(id);
	}

	@Override
	public Optional<Empleado> read(Long id) {
		// TODO Auto-generated method stub
		return empleadoRepository.findById(id);
	}

	@Override
	public List<Empleado> readAll() {
		// TODO Auto-generated method stub
		return empleadoRepository.findAll();
	}

}
