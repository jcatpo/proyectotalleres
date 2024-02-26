package org.cibertec.edu.pe.interfaceService;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.modelo.Taller;

public interface ITallerService {
	public List<Taller> Listado();
	public Optional<Taller> Ver(int id);
	public void Insertar(Taller t);
	public void Editar(Taller t);
	public void Suprimir(int id);	

}
