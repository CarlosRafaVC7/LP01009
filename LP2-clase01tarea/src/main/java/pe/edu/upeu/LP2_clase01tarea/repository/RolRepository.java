package pe.edu.upeu.LP2_clase01tarea.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import pe.edu.upeu.LP2_clase01tarea.entity.Rol;
@Repository
public interface RolRepository extends JpaRepository<Rol, Long>{

}