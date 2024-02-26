package org.cibertec.edu.pe.interfaces;

import org.cibertec.edu.pe.modelo.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlumno extends JpaRepository<Alumno, Integer>{

}
