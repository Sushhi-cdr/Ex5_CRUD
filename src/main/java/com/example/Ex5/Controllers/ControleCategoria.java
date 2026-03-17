package com.example.Ex5.Controllers;

import com.example.Ex5.Models.Categoria;
import com.example.Ex5.Repositories.RepositorioCategoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Categorias")
public class ControleCategoria {

    @Autowired
    private RepositorioCategoria repositorio;

    @PostMapping
    public Categoria criar(@RequestBody Categoria categoria) {
        return repositorio.save(categoria);
    }

    @GetMapping
    public List<Categoria> Listar() {
        return repositorio.findAll();
    }

    @GetMapping("/{id}")
    public Categoria buscar(@PathVariable Long id) {
        return repositorio.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repositorio.deleteById(id);
    }
}
