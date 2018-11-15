package homework.docker_01.controller;

import homework.docker_01.dto.ProductDTO;
import homework.docker_01.entity.Product;
import homework.docker_01.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product/")
public class Controller {

    @Autowired
    Service service;

    @PostMapping
    public Product create(@RequestBody ProductDTO productDTO){
        return service.create(productDTO);
    }

    @GetMapping("{id}/")
    public Product get(@PathVariable String id){
        return service.get(id);
    }

    @PutMapping("{id}/")
    public Product update(@PathVariable String id,
                   @RequestBody ProductDTO productDTO){
        return service.update(id, productDTO);
    }

    @DeleteMapping("{id}/")
    public Product delete(@PathVariable String id){
        return service.delete(id);
    }

    @GetMapping("all/")
    public Iterable<Product> getAll(){
        return service.getAll();
    }

}
