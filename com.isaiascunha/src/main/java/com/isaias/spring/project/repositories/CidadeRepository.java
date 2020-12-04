package com.isaias.spring.project.repositories;

import com.isaias.spring.project.domain.Cidade;
import com.isaias.spring.project.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
