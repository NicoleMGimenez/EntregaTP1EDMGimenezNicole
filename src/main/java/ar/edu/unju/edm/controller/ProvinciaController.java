package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Provincia;

@Controller
class ProvinciaController {

	//Provincia unaProvincia = new Provincia(); //instanciando la clase provincia, estamos creando una variable una provincia que tiene un objeto asignando a un espacio de memoria
	@Autowired
	  Provincia unaProvincia;
	  
	@GetMapping({"/provincia"})
		public String cargarProvincia(Model model) {
			unaProvincia.setNombreDeProvincia("Salta Argentina");
			model.addAttribute("Nicole", unaProvincia);
			return "provincia";
		}
}
