/**
 * 
 */
package dev.paie.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dev.paie.entite.RemunerationEmploye;
import dev.paie.service.EntrepriseService;
import dev.paie.service.GradeService;
import dev.paie.service.ProfilService;
import dev.paie.service.RemunerationEmployeService;

/**
 * @author Alexis Darcy
 *
 */
@Controller
@RequestMapping("/employes")
public class RemunerationEmployeController {

	@Autowired
	private EntrepriseService entrepriseServiceDataJpa;

	@Autowired
	private GradeService gradeServiceDataJpa;

	@Autowired
	private ProfilService profilServiceDataJpa;

	@Autowired
	private RemunerationEmployeService remunerationEmployeServiceJpa;

	@RequestMapping(method = RequestMethod.GET, path = "/creer")
	public ModelAndView creerEmploye() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("employes/creerEmploye");
		mv.addObject("entreprises", entrepriseServiceDataJpa.lister());
		mv.addObject("grades", gradeServiceDataJpa.salaireAnnuel());
		mv.addObject("profils", profilServiceDataJpa.lister());
		mv.addObject("remunerationEmploye", new RemunerationEmploye());
		return mv;
	}


	@RequestMapping(method = RequestMethod.POST, path = "/creer")
	public String ajouterEmploye(@ModelAttribute("remunerationEmploye") RemunerationEmploye remunerationEmploye) {
		remunerationEmployeServiceJpa.sauvegarder(remunerationEmploye);
		return "redirect:/mvc/employes/lister";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/lister")
	public ModelAndView listerEmploye() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("employes/listerEmploye");
		mv.addObject("employes", remunerationEmployeServiceJpa.lister());
		return mv;
	}
}