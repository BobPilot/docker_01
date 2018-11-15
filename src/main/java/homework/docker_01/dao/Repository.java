package homework.docker_01.dao;

import homework.docker_01.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<Product, String> {



}