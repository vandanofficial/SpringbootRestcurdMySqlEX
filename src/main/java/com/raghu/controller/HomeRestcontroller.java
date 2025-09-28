package com.raghu.controller;

import java.time.LocalDate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestcontroller {
	
	@GetMapping("/get/{name}")
	public String getMessage(@PathVariable String name)
	{
		return "Good Morning! "+name + "  Today Date is " +LocalDate.now();
	}
}
