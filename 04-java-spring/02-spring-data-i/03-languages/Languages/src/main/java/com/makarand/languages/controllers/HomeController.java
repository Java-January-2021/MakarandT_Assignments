package com.makarand.languages.controllers;

import java.util.ArrayList;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.makarand.languages.models.LanguageModel;
import com.makarand.languages.services.LanguageService;



@Controller
// @RequestMapping("/languages")
public class HomeController {
	@Autowired
	private LanguageService lservice;

	@GetMapping("/languages")
	public String index(@ModelAttribute("languagemodel") LanguageModel languagemodel, Model viewModel) {
		viewModel.addAttribute("tablemodel", this.lservice.getAllLanguageModel());
		return "langDash.jsp";
	}
	//Display 
	@GetMapping("/languages/{id}")
	public String display(@ModelAttribute("editModel") LanguageModel languagemodel,@PathVariable("id") Long id,Model viewModel) {
		viewModel.addAttribute("editModel", this.lservice.getSingleLanguageModel(id));
		System.out.println(this.lservice.getSingleLanguageModel(id).getLanguage());
		return "display.jsp";
	}

	@GetMapping("/languages/add")
	public String add(@ModelAttribute("languagemodel") LanguageModel languagemodel) {
		return "add.jsp";
	}

	@PostMapping("/languages/add")
	public String addlanguageModel(@Valid @ModelAttribute("languagemodel") LanguageModel languagemodel,
			BindingResult result, Model viewModel) {
		viewModel.addAttribute("tablemodel", this.lservice.getAllLanguageModel());
		if (result.hasErrors()) {
			return "langDash.jsp";
		}
		else {
		this.lservice.createLanguageModel(languagemodel);
		return "redirect:/languages";
	}
		

	}
	//delete
	@RequestMapping(value="/languages/delete/{id}")
    public String deleteLanguage(@PathVariable("id") Long id) {
        this.lservice.deleteLanguageModel(id);
        return "redirect:/languages";
	}
	//Edit get 
    @RequestMapping("/languages/edit/{id}")
    public String editLanguage(@ModelAttribute("editModel") LanguageModel languagemodel,@PathVariable("id") Long id,Model viewmodel) {
        LanguageModel editModel = lservice.getSingleLanguageModel(id);
        if (editModel != null){
        	viewmodel.addAttribute("editModel", editModel);
            return "edit.jsp";
        }else{
            return "redirect:/languages";
        }
    }
    // After edit post 
    @PostMapping("/languages/edit/{id}")
    public String updatelanguages(@Valid @ModelAttribute("editModel") LanguageModel languagemodel, BindingResult result,@PathVariable("id") Long id ) {
        if (result.hasErrors()) {
        	System.out.println("this is error");
            return "edit.jsp";
        }else{
        	System.out.println(languagemodel);
            this.lservice.updateLanguageModel(languagemodel);
            return "redirect:/languages";
        }
    }

//old way 
	@PostMapping("/oldadd")
	public String oldAddLanguageModel(@RequestParam("name") String name, @RequestParam("creator") String creator,
			@RequestParam("version") String version, RedirectAttributes redirectAttr) {
		ArrayList<String> errors = new ArrayList<String>();
		if (version.equals("")) {
			errors.add("Hey there you forgot to add version");
		}
		if (errors.size() > 0) {
			for (String e : errors) {
				redirectAttr.addFlashAttribute("errors", e);
			}
			return "redirect:/add";
		}
		this.lservice.creaetLanguageModel(name, creator, version);
		return "redirect:/";

	}
}
