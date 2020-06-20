package io.groud.spring.restdocs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liwei
 */
@RestController
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "Hello, World";
	}
}
