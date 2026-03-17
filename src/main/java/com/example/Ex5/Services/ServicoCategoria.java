package com.example.Ex5.Services;

import com.example.Ex5.Models.Categoria;
import com.example.Ex5.Repositories.RepositorioCategoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoCategoria {

    @Autowired
    private RepositorioCategoria repositorio;

    public Categoria criar(Categoria categoria) {
        return repositorio.save(categoria);
    }

    public List<Categoria> listar(){
        return repositorio.findAll();
    }

    public Categoria buscarPorId(Long id){
        return repositorio.findById(id).orElse(null);
    }

    public void deletar(Long id){
        repositorio.deleteById(id);
    }
}
