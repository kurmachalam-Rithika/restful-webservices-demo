package com.rithika.rest.webservices.restfulwebservices.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	private MessageSource  messageSource;
	public HelloWorldController(MessageSource  messageSource) {
		this.messageSource = messageSource;
	}
//	@RequestMapping(method = RequestMethod.GET, path ="/helloWorld")
//	public String helloWorld() {
//		return "Hello World";

	@GetMapping(path = "/helloWorld")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping(path = "/hello-world-Bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");

	}

	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));

	}
	

	@GetMapping(path = "/hello-world-internationalized")
	public String helloWorldInternationalized( ) {
		Locale locale = LocaleContextHolder.getLocale();
		messageSource.getMessage("good.morning.message", null , "Default Message", locale);
		return "Hello World V2";

	}
}
