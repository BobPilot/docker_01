package homework.docker_01.service;

import homework.docker_01.dto.ProductDTO;
import homework.docker_01.dao.Repository;
import homework.docker_01.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{

    @Autowired
    Repository repository;

    @Override
    public Product create(ProductDTO productDTO) {
        return repository.save(new Product(productDTO));
    }

    @Override
    public Product get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Product update(String id, ProductDTO productDTO) {
        Product product = repository.findById(id).orElse(null);
        if(product != null){
            product.setDescription(setData(productDTO.getDescription(), product.getDescription()));
            product.setName(setData(productDTO.getName(), product.getName()));
            if(productDTO.getQuantity() != null){
                product.setQuantity(productDTO.getQuantity());
            }
            repository.save(product);
        }
        return product;
    }

    private String setData(String dto, String original) {
        return dto == null ? original : dto;
    }

    @Override
    public Product delete(String id) {
        Product product = repository.findById(id).orElse(null);
        if(product != null){
            repository.deleteById(id);
        }
        return product;
    }

    @Override
    public Iterable<Product> getAll() {
        return repository.findAll();
    }

}
