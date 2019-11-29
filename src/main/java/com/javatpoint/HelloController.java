package com.javatpoint;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {

	@RequestMapping("/")
	public String display(){
		return "index";
	}

	@RequestMapping("/hello")
	public String redirect(){
		return "viewpage";
	}
	@RequestMapping("/helloagain")
	public String hellpAgein()
	{
		return "final";
	}

}
