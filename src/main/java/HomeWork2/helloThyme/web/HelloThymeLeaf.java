package HomeWork2.helloThyme.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloThymeLeaf {

	@GetMapping("hello")

	public String welcomeMsg(@RequestParam(name = "name") String name,
			@RequestParam(name = "age") int age,
			Model model) {

		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "hello";
	}

}
