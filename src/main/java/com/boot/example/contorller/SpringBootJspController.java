package com.boot.example.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.example.mapper.SpringBootJspMapper;

@Controller
@RequestMapping("/example")
public class SpringBootJspController {
	
	@Autowired
	private SpringBootJspMapper mapper;
	
	@RequestMapping("/main")
	public String viewMaing(Model model) {
		String name = "";
		
		name = mapper.selectTest();
				
		model.addAttribute("result", "success");
		model.addAttribute("name", name);
		
		return "example/Main";
	}
	
}
