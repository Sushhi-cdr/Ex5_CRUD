package com.example.Ex5.Repositories;

import com.example.Ex5.Models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCategoria extends JpaRepository<Categoria, Long> {
}
