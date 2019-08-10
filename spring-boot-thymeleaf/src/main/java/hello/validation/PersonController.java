package hello.validation;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class PersonController implements WebMvcConfigurer{
	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/person_result").setViewName("person_result");
    }
	
	@GetMapping("/per")
    public String personForm(Model model) {
		model.addAttribute("person", new Person());
        return "person"; // always return name of the html file
    }
		

    @PostMapping("/per")
    public String checkPersonInfo(@Valid Person person, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "person"; // always return name of the html file
        }

        return "redirect:/person_result";
    }
}
