package com.example.demo;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.repository.MongoRepository;

@Qualifier("users")
@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
