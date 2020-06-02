package com.techendear.app.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.techendear.app.domains.Request;

public interface RequestRepository extends CrudRepository<Request, UUID> {

}
