package org.cibertec.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceService.IAlumnoService;
import org.cibertec.edu.pe.interfaces.IAlumno;
import org.cibertec.edu.pe.modelo.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService implements IAlumnoService{
	@Autowired
	private IAlumno data;
	
	@Override
	public List<Alumno> Listado() {
		return (List<Alumno>)data.findAll();
	}

	@Override
	public Optional<Alumno> Ver(int id) {
		return data.findById(id);
	}

	@Override
	public void Insertar(Alumno alu) {
		data.save(alu);		
	}

	@Override
	public void Editar(Alumno alu) {
		data.save(alu); // En el caso que el registro NO exista lo agrega
					  // En el caso que el registro SI exista lo modifica.
	}

	@Override
	public void Suprimir(int id) {
		data.deleteById(id);		
	}	
}
