package com.isaias.spring.project.services;


import com.isaias.spring.project.domain.Cliente;
import com.isaias.spring.project.repositories.ClienteRepository;
import com.isaias.spring.project.services.exeptions.ObjectNotFoundExeption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente find(Integer id){
       Optional<Cliente> obj = repo.findById(id);
       return obj.orElseThrow(()->
               new ObjectNotFoundExeption(
               "Objeto não encontrado! id: " + id + ", Tipo: "
                       + Cliente.class.getName()
               )
       );
    }
}
