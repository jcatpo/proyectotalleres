package org.cibertec.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceService.ITallerService;
import org.cibertec.edu.pe.interfaces.ITaller;
import org.cibertec.edu.pe.modelo.Taller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TallerService implements ITallerService{
	@Autowired
	private ITaller data;
	
	@Override
	public List<Taller> Listado() {
		return (List<Taller>)data.findAll();
	}

	@Override
	public Optional<Taller> Ver(int id) {
		return data.findById(id);
	}

	@Override
	public void Insertar(Taller t) {
		data.save(t);		
	}

	@Override
	public void Editar(Taller t) {
		data.save(t); // En el caso que el registro NO exista lo agrega
					  // En el caso que el registro SI exista lo modifica.
	}

	@Override
	public void Suprimir(int id) {
		data.deleteById(id);		
	}		
}
