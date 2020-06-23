package com.springboot.app.usuarios.models.dao;

import com.springboot.app.usuarios.models.entity.Usuario;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "usuarios")
public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long> {

  Usuario findByUsername(String username);

}
