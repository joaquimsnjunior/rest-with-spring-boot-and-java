package br.com.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping("/greenting")
	private static final String template = "hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	public Greentig greenting(
			@RequestParam(value = "name", defaultValue = "world") String name) {
		return new Greenting(counter.incrementAndGet(), String.format(template, name));
	}
}
