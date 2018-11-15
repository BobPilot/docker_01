package homework.docker_01.entity;

import homework.docker_01.dto.ProductDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

//import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document("list_product_new")
//@Entity
//@Table(name = "product")
//@EntityListeners(AuditingEntityListener.class)
public class Product {

    @Id
    String id;

    String name;
    Integer quantity;
    String description;


    public Product(ProductDTO productDTO) {
        this.id = productDTO.getId();
        this.name = productDTO.getName();
        this.description = productDTO.getDescription();
        this.quantity = productDTO.getQuantity();
    }
}
