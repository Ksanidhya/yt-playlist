package com.sanidya.ytapp.PlayTheList.config;

import com.sanidya.ytapp.PlayTheList.Repository.UserRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {
}
