package com.project.clinic.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.clinic.entity.User;


@Repository
public interface UserRepository extends MongoRepository<User, String> {

}

