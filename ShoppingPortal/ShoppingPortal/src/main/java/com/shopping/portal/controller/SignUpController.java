package com.shopping.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.shopping.portal.entity.User;
import com.shopping.portal.service.SignUpServiceI;

@Controller
//@RequestMapping("/home")
public class SignUpController {

	@Autowired
	private SignUpServiceI signUpService;

	@GetMapping("/login")
	public String home(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}

	@GetMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("user", new User());
		return "signup";
	}

	@PostMapping("/signin")
	public String signin() {
		// model.addAttribute("user", new User());
		return "home";
	}

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	// @RequestMapping(method = RequestMethod.POST, name = "/register")

	@PostMapping("/register")
	public String register(@ModelAttribute(name = "user") User user, Model model,
			RedirectAttributes redirectAttributes) {
		signUpService.saveUser(user);
		// redirectAttributes.addFlashAttribute("user-registered", "User successfully
		// signed up");
		model.addAttribute("user", user);
		return "login";

	}

}
