package org.cibertec.edu.pe.interfaces;

import org.cibertec.edu.pe.modelo.Taller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITaller extends JpaRepository<Taller, Integer>{

}
