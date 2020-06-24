package com.springboot.app.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.kmilo.commons.users.springbootusers.models.entity"})
public class SpringbootServicioUsuariosApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootServicioUsuariosApplication.class, args);
  }

}
