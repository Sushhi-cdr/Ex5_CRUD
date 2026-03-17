package com.example.Ex5.Repositories;

import com.example.Ex5.Models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.support.Repositories;

public interface RepositorioCategoria extends JpaRepository<Categoria, Long> {
}
