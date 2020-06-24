package com.springboot.app.usuarios;

import com.kmilo.commons.users.springbootusers.models.entity.Usuario;
import com.kmilo.commons.users.springbootusers.models.entity.Role;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

  @Override
  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
    config.exposeIdsFor(Usuario.class, Role.class);
  }
}
