package com.isaias.spring.project.services;


import com.isaias.spring.project.domain.Pedido;
import com.isaias.spring.project.repositories.PedidoRepository;
import com.isaias.spring.project.services.exeptions.ObjectNotFoundExeption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido find(Integer id){
       Optional<Pedido> obj = repo.findById(id);
       return obj.orElseThrow(()->
               new ObjectNotFoundExeption(
               "Objeto não encontrado! id: " + id + ", Tipo: "
                       + Pedido.class.getName()
               )
       );
    }
}
