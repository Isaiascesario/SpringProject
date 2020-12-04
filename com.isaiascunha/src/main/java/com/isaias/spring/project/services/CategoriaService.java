package com.isaias.spring.project.services;


import com.isaias.spring.project.domain.Categoria;
import com.isaias.spring.project.repositories.CategoriaRepository;
import com.isaias.spring.project.services.exeptions.ObjectNotFoundExeption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id){
       Optional<Categoria> obj = repo.findById(id);
       return obj.orElseThrow(()->
               new ObjectNotFoundExeption(
               "Objeto não encontrado! id: " + id + ", Tipo: "
                       + Categoria.class.getName()
               )
       );
    }
}
