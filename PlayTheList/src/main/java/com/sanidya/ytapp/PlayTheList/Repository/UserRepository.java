package com.sanidya.ytapp.PlayTheList.Repository;

import com.sanidya.ytapp.PlayTheList.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {

   Optional<User> findByUserId(Long id);
}
