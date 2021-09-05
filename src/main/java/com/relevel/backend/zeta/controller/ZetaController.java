package com.relevel.backend.zeta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZetaController {

	@GetMapping("/ping")
	public String ping() {
		return "Ping is Successful";
	}
}

