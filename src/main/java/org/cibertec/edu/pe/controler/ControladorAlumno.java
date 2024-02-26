package org.cibertec.edu.pe.controler;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceService.IAlumnoService;
import org.cibertec.edu.pe.modelo.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ControladorAlumno {
	@Autowired
	private IAlumnoService servicio;
	
	@GetMapping("/estudiante")
	public String Listar(Model modelo) {
		List<Alumno> alumnos = servicio.Listado();
		modelo.addAttribute("alumnos", alumnos);
		return "alumnos";		
	}
	
	//Accion Agregar
	@GetMapping("/nuevo")
	public String agregar(Model modelo) {
		modelo.addAttribute("alumno", new Alumno());
		return "alumnos";		
	}
	
	//Acción guardar(save)
	@PostMapping("/save")
	public String save(@Validated Alumno alumno, Model modelo) {
		servicio.Insertar(alumno);
		return "redirect:/estudiante/lista";
	}
	
	//Accion Editar
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id,Model modelo) {
		Optional<Alumno> alumnos = servicio.Ver(id);
		modelo.addAttribute("alumno", alumnos);
		return "alumnos";		
	}
	
	//Accion Eliminar
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable int id, Model modelo) {
		servicio.Suprimir(id);
		return "redirect:/estudiante";
	}
}
