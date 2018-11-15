package homework.docker_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
//
//import javax.persistence.EntityListeners;

//@EnableJpaAuditing
@SpringBootApplication
public class Docker01Application {

    public static void main(String[] args) {
        SpringApplication.run(Docker01Application.class, args);
    }
}
