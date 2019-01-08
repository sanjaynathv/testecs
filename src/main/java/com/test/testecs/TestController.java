package com.test.testecs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/hello")
	@ResponseBody
	public String echo(@RequestParam(name="name", required=false, defaultValue="Java Fan") String name){
		return name;
	}

}
