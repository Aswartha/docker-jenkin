package com.boot.docker_jenkin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	@GetMapping("/")
	public String getMsg() {
		
		return "Welcome to Jenkins to Docker integration";
	}
}
