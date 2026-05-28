package com.oliveiradev.gestao_tarefas.repository;

import com.oliveiradev.gestao_tarefas.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {
}
