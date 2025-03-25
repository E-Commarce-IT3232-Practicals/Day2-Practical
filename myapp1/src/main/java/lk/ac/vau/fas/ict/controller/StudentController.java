package lk.ac.vau.fas.ict.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StudentController {
	@GetMapping("/getName")
	public String getName() {
		return "Name: ASD";
	}
	
	@GetMapping("/getReg")
	public String getReg() {
		return "2020ict11";
	}
	
	@GetMapping("/getAge")
	public String getAge() {
		return "25";
	}
}
