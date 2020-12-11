package com.tactfactory.microservice.frontend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainController {

	@Autowired
	private CurrencyConvertionServiceProxy ccsp;

	@GetMapping("/currencyform")
	public ModelAndView index() {
		return new ModelAndView("currencyform");
	}

	@PostMapping("/currencyform")
	public ModelAndView formPosted(FormDto dto, Model model) {
		dto = ccsp.convertCurrencyFeign(dto.getFrom(), dto.getTo(), dto.getAmount());
		model.addAttribute("result", dto.getTotalCalculatedAmount());
		return new ModelAndView("currencyform");
	}
}
