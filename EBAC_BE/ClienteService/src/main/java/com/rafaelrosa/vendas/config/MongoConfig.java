
package com.rafaelrosa.vendas.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.rafaelrosa.vendas.repository")
public class MongoConfig {

}
