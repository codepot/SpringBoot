package hello.msg;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MsgController {
	
	@GetMapping("/msg")
	public String greetingForm(Model model) {
		model.addAttribute("greeting", new Greeting());
		return "greeting"; // greeting.html
	}

	@PostMapping("/msg")
	public String greetingSubmit(@ModelAttribute Greeting greeting) {
		return "result"; // result.html
	}

}
