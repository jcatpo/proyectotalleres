package org.cibertec.edu.pe.controler;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceService.IAlumnoService;
import org.cibertec.edu.pe.interfaceService.ITallerService;
import org.cibertec.edu.pe.modelo.Alumno;
import org.cibertec.edu.pe.modelo.Taller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/talleres")  // Ruta base para este controlador
public class ControladorTaller {
    
    @Autowired
    private ITallerService servicio;
    
    @GetMapping("/lista")  // Ruta completa: /talleres/lista
    public String listar(Model modelo) {
        List<Taller> talleres = servicio.Listado();
        modelo.addAttribute("talleres", talleres);
        return "talleres";
    }
    
    // Acción Agregar
    @GetMapping("/nuevo")  // Ruta completa: /talleres/nuevo
    public String agregar(Model modelo) {
        modelo.addAttribute("taller", new Taller());
        return "talleres";
    }
    
    // Acción guardar(save)
    @PostMapping("/save")  // Ruta completa: /talleres/save
    public String save(@Validated Taller taller, Model modelo) {
        servicio.Insertar(taller);
        return "redirect:/talleres/lista";  // Redirige a la lista después de guardar
    }
    
    // Accion Editar
    @GetMapping("/editar/{id}")  // Ruta completa: /talleres/editar/{id}
    public String editar(@PathVariable int id, Model modelo) {
        Optional<Taller> taller = servicio.Ver(id);
        modelo.addAttribute("taller", taller.orElse(new Taller()));
        return "talleres";
    }
    
    // Accion Eliminar
    @GetMapping("/eliminar/{id}")  // Ruta completa: /talleres/eliminar/{id}
    public String eliminar(@PathVariable int id, Model modelo) {
        servicio.Suprimir(id);
        return "redirect:/talleres/lista";  // Redirige a la lista después de eliminar
    }
}