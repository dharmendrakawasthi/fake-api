package com.techendear.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techendear.app.domains.Request;
import com.techendear.app.repositories.RequestRepository;

@Service
public class RequestServiceImpl implements RequestService {

	@Autowired
	private RequestRepository requestRepository;

	@Override
	public Request saveRequest(Request request) {
		return requestRepository.save(request);
	}

}
