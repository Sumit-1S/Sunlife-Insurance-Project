package com.example.springsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AppController {
	
	@GetMapping("/welcome")
	public String sayWelcome() {
		return "welcome";
	}
	@GetMapping("/home")
	public String sayHome() {
		return "home";
	}
	@GetMapping("/ad")
	public String ad() {
		return "accessdenied";
	}
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
	@GetMapping("/common")
	public String common() {
		return "common";
	}
	@GetMapping("/employee")
	public String employee() {
		return "employee";
	}
	@GetMapping("/manager")
	public String manager() {
		return "manager";
	}
	@GetMapping("/sv")
	public String sv() {
		return "sv";
	}
	@GetMapping("/sa")
	public String sa() {
		return "sa";
	}
	@GetMapping("/mainapp")
	public String mainapp() {
		return "mainapp";
	}
}
