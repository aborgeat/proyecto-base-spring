package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.*;
import ar.edu.grupoesfera.cursospring.servicios.IPersonas;



@Controller
public class ControladorPersonas {
    @Inject
	private IPersonas servicios;

     
	
	@RequestMapping(value="/hi/amigo", method = RequestMethod.GET)
	public ModelAndView helloWorld(@RequestParam(value= "firstname", required = false ) String nombre,
								   @RequestParam(value= "sourcename") String apellido) {
		
		String message = "el nombre ingresado es, " + nombre + " !";
		String message2  = "el apellido es, " + apellido;
	
			ModelMap model = new ModelMap();
		model.put("msg", message);
		model.put("msg2", message2);
		return new ModelAndView("mensaje", model);
	}
	//http://localhost:8080/proyecto-base-spring/hi/amigo?nombre=andres
	//http://localhost:8080/proyecto-base-spring/hi/amigo?firstname=andres&sourcename=borgeat
	//las variables se separan por un &                      
	//el parametro firstname es opcional
	
	@RequestMapping(value="/hola/{nombre}/{apellido}", method = RequestMethod.GET)
	public ModelAndView helloWorld2(@PathVariable String nombre,
									@PathVariable String apellido) {
		String message = "Hola, " + nombre + "!";
		String message2  = "el apellido es, " + apellido;
		ModelMap model = new ModelMap();
		model.put("msg", message);
		model.put("msg2", message2);
		return new ModelAndView("mensaje", model);
	}
	//http://localhost:8080/proyecto-base-spring/hola/andres/borgeat
	//si definimos este path value="/hola/{nombre}/fijo/{apellido}"
	//el path seria http://localhost:8080/proyecto-base-spring/hola/andres/fijo/borgeat
	//todo lo que esta entre llaves son valores variables y lo que esta sin llaves si o si hay que escribirlo
	
	@RequestMapping("/mijsp")
	public ModelAndView cargarjsp() {
		ModelMap model =new  ModelMap ();
		return new ModelAndView("mijsp", model);
	}

	@RequestMapping(value = "/mijsp2")
	public ModelAndView cargarjsp2 () {
//		ModelMap modelo = new ModelMap();
//		TablaPersonas tabla = TablaPersonas.getInstance();
//		modelo.put("tabla", tabla.listarTodas());
		ModelAndView miVista = new ModelAndView();
//		miVista.addAllObjects(modelo);
		miVista.setViewName("mijsp");
		return miVista;
	}	
	
	
	
	// 1) irForm va invocar a Formulario.jsp y va cargar una persona 
	@RequestMapping("/irform")
	public ModelAndView insertPerson() {
		ModelMap model =new  ModelMap ();
		Persona persona = new Persona();
		model.put("persona", persona);
	//	persona.setApellido("lopez");
//		persona.setNombre("julio");
	//	persona.setEdad(33);
		return new ModelAndView("personaform", model);
	}

// 2) Formulario devuelve por post la persona ingresada y llama a /saludos
	
	
//	@RequestMapping(path="/saludo", method = RequestMethod.POST)
//    public ModelAndView addContact(@ModelAttribute("persona") Persona persona) {
//		ModelMap model = new ModelMap(); 
//		model.put("nombre", persona.getNombre());
//		model.put("apellido", persona.getApellido());
//		model.put("mail", persona.getEmail());		
//		return new ModelAndView("confirmacion", model);
//    }
	
	
	
//  Formulario devuelve por post la persona ingresada y llama a /saludos
//  luego para mostrar llama a tablaPersonas.jsp y muestra todas las personas	

	@RequestMapping(path="/saludo", method = RequestMethod.POST)
    public ModelAndView addContact(@ModelAttribute("persona") Persona persona) {
	ModelMap modelo = new ModelMap(); 
	TablaPersonas tabla = TablaPersonas.getInstance();
	tabla.crearPersona(persona);
	modelo.put("tabla", tabla.listarTodas());
	ModelAndView miVista = new ModelAndView ();
	miVista.setViewName("tablaPersonas");
	miVista.addAllObjects(modelo);
	servicios.verificarPersonas();
	return miVista;
  }
/* Otra Forma Po st */		
	
//	@RequestMapping(value = "/saludo", method = RequestMethod.POST)
//	public String addpersona(
//			@ModelAttribute("persona") Persona personaAgregar, ModelMap modelo) {
//		TablaPersonas tabla = TablaPersonas.getInstance();
//		tabla.crearPersona(personaAgregar);
//		modelo.put("tabla", tabla.listarTodas());
//		return "tablaPersonas";
//
//	}	
//	

	
	
	@RequestMapping(value = "/consultarpersonas")
	public ModelAndView verPersonas() {
		ModelMap modelo = new ModelMap();
		TablaPersonas tabla = TablaPersonas.getInstance();
		modelo.put("tabla", tabla.listarTodas());
		ModelAndView miVista = new ModelAndView();
		miVista.addAllObjects(modelo);
		miVista.setViewName("tablaPersonas");
		return miVista;
	}	
	
	
	
	
	@RequestMapping(value = "/modificarpersona")
	public ModelAndView llamarModificarpersona() {
		ModelMap modelo = new ModelMap();
		TablaPersonas tabla = TablaPersonas.getInstance();
		modelo.put("tabla", tabla.listarTodas());
		ModelAndView miVista = new ModelAndView();
		miVista.addAllObjects(modelo);
		miVista.setViewName("modificarpersonaform1");
		return miVista;
	}
	
	
	@RequestMapping("/modificarunapersona")
	public ModelAndView modificarpersona(@RequestParam("apellido") String apellido) {
			
		ModelMap model = new ModelMap();
   		TablaPersonas tabla = TablaPersonas.getInstance();
   		Persona personaBuscar= tabla.buscarPersona(apellido);
		model.put("persona", personaBuscar);
		return new ModelAndView("formulariomodificar1", model);
	}
	
	@RequestMapping(value = "/updatepersona", method = RequestMethod.POST)
	public String updatePersona(
		@ModelAttribute("persona") Persona personaModificar, ModelMap modelo) {
		System.out.println("entro a update " +personaModificar.getApellido());
		TablaPersonas tabla = TablaPersonas.getInstance();		
		tabla.modificarPersona(personaModificar);
		modelo.put("tabla", tabla.listarTodas());
		return "tablapersonas";
	}	
	
//	@RequestMapping("borrarpersona")
//	public ModelAndView borrar (@RequestParam("apellido") String apellido) {
//		TablaPersonas tabla = TablaPersonas.getInstance();
//		tabla.borrarPersona(apellido);
//		return new ModelAndView("mensaje1", model);
//	}
	//http://localhost:8080/pagina/hola/?nombre=andres

	
	
}
