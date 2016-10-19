package ar.edu.grupoesfera.cursospring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MiContralador {

	@RequestMapping ("/miprimerjsp")
	public ModelAndView cargajsp(){
	
		ModelMap modelo = new ModelMap ();
		return new ModelAndView ("mijsp1",modelo);
	}
	
	@RequestMapping("/hola2/{nombre}")
	public ModelAndView helloWorld2(@PathVariable String nombre) {
		String message = "Hola, " + nombre + "!";
		
	    ModelMap model = new ModelMap();
		model.put("message", message);
		return new ModelAndView("mensaje3", model);
		
		////
	}
	
}
