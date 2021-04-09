package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Calculadora;

@Controller
public class CalculadoraController {

	@Autowired
	Calculadora unaCalculadora;
	
	@GetMapping({"/calculadora"})
	public String cargaCalculadora (Model model) {
		return "calculadora";
	}
	
	@GetMapping("/ejecutarsuma")
	public ModelAndView getCalculoSuma(@RequestParam (name = "num1") String num1 , @RequestParam (name = "num2") int num2){
		
		unaCalculadora.setNum1(Integer.valueOf(num1));
		unaCalculadora.setNum2(num2);
		
		int resultadoSuma = unaCalculadora.Sumar();
		
		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoSuma", resultadoSuma);
		
		return modelView;
	}

}
