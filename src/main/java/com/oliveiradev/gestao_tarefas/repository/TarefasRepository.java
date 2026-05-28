package com.oliveiradev.gestao_tarefas.repository;

import com.oliveiradev.gestao_tarefas.model.Tarefas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefasRepository extends JpaRepository<Tarefas, Integer> {
}
