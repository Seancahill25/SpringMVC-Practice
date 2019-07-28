package com.sean.springpractice.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WorkController {

	@RequestMapping("/showForm")
	public String displayTheForm() {
		return "work";
	}
}
