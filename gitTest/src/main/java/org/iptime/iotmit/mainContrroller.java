package org.iptime.iotmit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import domian.TestDTO;

@Controller
public class mainContrroller {
	
	@GetMapping("/strcount")
	public void count() {
		
}
	@PostMapping("/strcount")
	public String count(TestDTO dto,Model model) {	
			model.addAttribute("dto",dto.getCount().length());
		return "test/strcount";
		
	}
}
