package com.techendear.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techendear.app.domains.Request;
import com.techendear.app.domains.Response;
import com.techendear.app.services.RequestService;

@RestController
@RequestMapping("/api/v1/request")
public class RequestController {

	@Autowired
	private RequestService requestService;
	
	@PostMapping({"/create","/add","createRequest"})
	public ResponseEntity<Response> saveRequest(@RequestBody Request request){
		if(request.equals(null)) {
			return ResponseEntity.badRequest().body(request.getResponse());
		}
		
		requestService.saveRequest(request);
		return ResponseEntity.status(HttpStatus.OK).body(request.getResponse());
	}
}
