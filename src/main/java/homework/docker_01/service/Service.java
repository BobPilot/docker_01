package homework.docker_01.service;

import homework.docker_01.dto.ProductDTO;
import homework.docker_01.entity.Product;

public interface Service {

    Product create(ProductDTO productDTO);
    Product get(String id);
    Product update(String id, ProductDTO productDTO);
    Product delete(String id);
    Iterable<Product> getAll();
}
