package org.cibertec.edu.pe.interfaceService;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.modelo.Alumno;

public interface IAlumnoService {
	public List<Alumno> Listado();
	public Optional<Alumno> Ver(int id);
	public void Insertar(Alumno alu);
	public void Editar(Alumno alu);
	public void Suprimir(int id);	

}
