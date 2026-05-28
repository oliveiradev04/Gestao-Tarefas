package com.oliveiradev.gestao_tarefas.service;

import com.oliveiradev.gestao_tarefas.dto.TarefasDto;
import com.oliveiradev.gestao_tarefas.dto.UsuariosDto;
import com.oliveiradev.gestao_tarefas.model.Tarefas;
import com.oliveiradev.gestao_tarefas.repository.TarefasRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TarefasService {

    private final TarefasRepository tarefaRepository;

    public TarefasService(TarefasRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public List<Tarefas> listar() {
        return tarefaRepository.findAll();
    }

    public Tarefas buscarPorId(Integer id) {
        Optional <Tarefas> tarefas = tarefaRepository.findById(id);

        if (tarefas.isEmpty()) {
            throw new RuntimeException("Tarefa não encontrada.");
        }
        return tarefas.get();
    }

    public Tarefas criar(TarefasDto dto) {
        var tarefas = new Tarefas();
        BeanUtils.copyProperties(dto, tarefas);
        return tarefaRepository.save(tarefas);
    }

    public void deletar(Integer id) {
        Optional <Tarefas> tarefas = tarefaRepository.findById(id);

        if (tarefas.isEmpty()) {
            throw new RuntimeException("Tarefa não encontrada.");
        }

        tarefaRepository.delete(tarefas.get());
    }

    public Tarefas atualizar (Integer id, TarefasDto dto) {
        Optional <Tarefas> tarefas = tarefaRepository.findById(id);

        if (tarefas.isEmpty()) {
            throw new RuntimeException("Tarefa não encontrada.");
        }

        var tarefasModel = tarefas.get();
        BeanUtils.copyProperties(dto, tarefasModel);
        return tarefaRepository.save(tarefasModel);
    }
}
