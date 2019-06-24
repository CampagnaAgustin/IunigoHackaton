package net.codeJava.IunigoHackaton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.codeJava.model.*;

@Controller
public class IunigoController {

	public String stringDate(LocalDate date) {
		int dia = date.getDayOfMonth();
		int mes = date.getMonthValue();
		int ano = date.getYear();
		return dia + "/" + mes + "/" + ano;
	}
	
	public LocalDate stringToDate(String date) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate local = LocalDate.parse(date, formatter );
		return local;
	}

	@GetMapping("/test")
	public String test() {
		return "test";
	}
	
	@PostMapping("/datoTest")
	public String datosTest (@RequestParam String nombre){
		String nombre1 = nombre;
		Usuario.prueba1.setNombre(nombre1);
		return "redirect:/calendario";
	}
	
	@GetMapping("/")
	public String inicioNull() {
		return "redirect:/home";
	}

	@GetMapping("/home")
	public String home(Model template) {
		String nombre1 = Usuario.prueba1.getNombre();
		template.addAttribute("nombre", nombre1);
		return "home";
	}
	
	@GetMapping("/perfil")
	public String perfil(Model template){
		String nombre1 = Usuario.prueba1.getNombre();
		template.addAttribute("nombre", nombre1);
		return "perfil";
	}

	@GetMapping("/logros")
	public String logros(Model template) {
		Logro logro1prueba1 = Usuario.prueba1.getLogro1();
		String nombreLogro1 = logro1prueba1.getNombre();
		String imagenLogro1 = logro1prueba1.getImagen();
		String beneficioLogro1 = logro1prueba1.getBeneficio();
		Logro logro2prueba1 = Usuario.prueba1.getLogro2();
		String nombreLogro2 = logro2prueba1.getNombre();
		String imagenLogro2 = logro2prueba1.getImagen();
		String beneficioLogro2 = logro2prueba1.getBeneficio();
		boolean earnedLogro2 = logro2prueba1.isEarned();
		Logro logro3prueba1 = Usuario.prueba1.getLogro3();
		String nombreLogro3 = logro3prueba1.getNombre();
		String imagenLogro3 = logro3prueba1.getImagen();
		String beneficioLogro3 = logro3prueba1.getBeneficio();
		boolean earnedLogro3 = logro3prueba1.isEarned();
		Logro logro4prueba1 = Usuario.prueba1.getLogro4();
		String nombreLogro4 = logro4prueba1.getNombre();
		String imagenLogro4 = logro4prueba1.getImagen();
		String beneficioLogro4 = logro4prueba1.getBeneficio();
		boolean earnedLogro4 = logro4prueba1.isEarned();
		template.addAttribute("nombreL1P1", nombreLogro1);
		template.addAttribute("imagenL1P1", imagenLogro1);
		template.addAttribute("beneficioL1P1", beneficioLogro1);
		template.addAttribute("earnedL1P1", earnedLogro2);
		template.addAttribute("nombreL2P1", nombreLogro2);
		template.addAttribute("imagenL2P1", imagenLogro2);
		template.addAttribute("beneficioL2P1", beneficioLogro2);
		template.addAttribute("earnedL2P1", earnedLogro3);
		template.addAttribute("nombreL3P1", nombreLogro3);
		template.addAttribute("imagenL3P1", imagenLogro3);
		template.addAttribute("beneficioL3P1", beneficioLogro3);
		template.addAttribute("earnedL3P1", earnedLogro3);
		template.addAttribute("nombreL4P1", nombreLogro4);
		template.addAttribute("imagenL4P1", imagenLogro4);
		template.addAttribute("beneficioL4P1", beneficioLogro4);
		template.addAttribute("earnedL4P1", earnedLogro4);
		return "logros";
	}

	@GetMapping("/viajes")
	public String viajes(Model template) {
		return "viajes";
	}

	@GetMapping("/calendario")
	public String calendario(Model template) {
		String nombre = Usuario.prueba1.getNombre();
		String datoVTV = Usuario.prueba1.getVencimientoVTV();
		String datoPatente = Usuario.prueba1.getVencimientoPatente();
		String datoSeguro = Usuario.prueba1.getVencimientoSeguro();
		String datoRegistro = Usuario.prueba1.getVencimientoRegistro();
		template.addAttribute("nombreCalendario", nombre);
		template.addAttribute("vtv", datoVTV);
		template.addAttribute("seguro", datoSeguro);
		template.addAttribute("patente", datoPatente);
		template.addAttribute("registro", datoRegistro);
		return "calendario";
	}
	
	@GetMapping("/modificarCalendario")
	public String modificarCalendario(Model template) {
		return "form";
	}
	
	@PostMapping("/datosCalendario")
	public String datosCalendario (@RequestParam String datoRegistro, @RequestParam String datoVTV, @RequestParam String datoPatente, @RequestParam String datoSeguro){
		Usuario.prueba1.setVencimientoRegistro(datoRegistro);
		Usuario.prueba1.setVencimientoVTV(datoVTV);
		Usuario.prueba1.setVencimientoPatente(datoPatente);
		Usuario.prueba1.setVencimientoSeguro(datoSeguro);
		return "redirect:/calendario";
	}
	
	

	@GetMapping("/iunitips")
	public String iuniTips(Model template) {
		return "iuniTips";
	}

	@GetMapping("/miPerfil2")
	public String miPerfil2(Model template) {
		String nombre2 = Usuario.prueba2.getNombre();
		template.addAttribute("nombre", nombre2);
		return "perfil2";
	}

	@GetMapping("/logros2")
	public String logros2(Model template) {
		Logro logro1prueba2 = Usuario.prueba2.getLogro1();
		String nombreLogro1 = logro1prueba2.getNombre();
		String imagenLogro1 = logro1prueba2.getImagen();
		String beneficioLogro1 = logro1prueba2.getBeneficio();
		Logro logro2prueba2 = Usuario.prueba2.getLogro2();
		String nombreLogro2 = logro2prueba2.getNombre();
		String imagenLogro2 = logro2prueba2.getImagen();
		String beneficioLogro2 = logro2prueba2.getBeneficio();
		boolean earnedLogro2 = logro2prueba2.isEarned();
		Logro logro3prueba2 = Usuario.prueba2.getLogro3();
		String nombreLogro3 = logro3prueba2.getNombre();
		String imagenLogro3 = logro3prueba2.getImagen();
		String beneficioLogro3 = logro3prueba2.getBeneficio();
		boolean earnedLogro3 = logro3prueba2.isEarned();
		Logro logro4prueba2 = Usuario.prueba2.getLogro4();
		String nombreLogro4 = logro4prueba2.getNombre();
		String imagenLogro4 = logro4prueba2.getImagen();
		String beneficioLogro4 = logro4prueba2.getBeneficio();
		boolean earnedLogro4 = logro4prueba2.isEarned();
		template.addAttribute("nombreL1", nombreLogro1);
		template.addAttribute("imagenL1", imagenLogro1);
		template.addAttribute("beneficioL1", beneficioLogro1);
		template.addAttribute("earnedL1", earnedLogro2);
		template.addAttribute("nombreL2", nombreLogro2);
		template.addAttribute("imagenL2", imagenLogro2);
		template.addAttribute("beneficioL2", beneficioLogro2);
		template.addAttribute("earnedL2", earnedLogro3);
		template.addAttribute("nombreL3", nombreLogro3);
		template.addAttribute("imagenL3", imagenLogro3);
		template.addAttribute("beneficioL3", beneficioLogro3);
		template.addAttribute("earnedL3", earnedLogro3);
		template.addAttribute("nombreL4", nombreLogro4);
		template.addAttribute("imagenL4", imagenLogro4);
		template.addAttribute("beneficioL4", beneficioLogro4);
		template.addAttribute("earnedL4", earnedLogro4);
		return "logros2";
	}

	@GetMapping("/viaje2")
	public String viaje2(Model template) {
		return "viaje2";
	}

	@GetMapping("/calendario2")
	public String calendario2(Model template) {
		String nombre = Usuario.prueba2.getNombre();
		String datoVTV = Usuario.prueba2.getVencimientoVTV();
		String datoPatente = Usuario.prueba2.getVencimientoPatente();
		String datoSeguro = Usuario.prueba2.getVencimientoSeguro();
		String datoRegistro = Usuario.prueba2.getVencimientoRegistro();
		template.addAttribute("nombreCalendario2", nombre);
		template.addAttribute("vtv2", datoVTV);
		template.addAttribute("seguro2", datoSeguro);
		template.addAttribute("patente2", datoPatente);
		template.addAttribute("registro2", datoRegistro);
		return "calendario2";
	}

	@GetMapping("/uniTips2")
	public String uniTips2(Model template) {
		return "uniTips2";
	}

}
