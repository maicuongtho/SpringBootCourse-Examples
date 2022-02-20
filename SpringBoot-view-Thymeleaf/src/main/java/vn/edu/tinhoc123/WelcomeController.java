package vn.edu.tinhoc123;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	@GetMapping("/")
    public String main(Model model) {
        model.addAttribute("message", "Xin chào TiiL");
        return "welcome"; //view
    }
}
