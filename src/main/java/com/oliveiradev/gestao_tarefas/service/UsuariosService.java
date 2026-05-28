package com.oliveiradev.gestao_tarefas.service;

import com.oliveiradev.gestao_tarefas.dto.UsuariosDto;
import com.oliveiradev.gestao_tarefas.model.Usuarios;
import com.oliveiradev.gestao_tarefas.repository.UsuariosRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuariosService {

    private final UsuariosRepository usuariosRepository;

    public UsuariosService(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }

    public List<Usuarios> listar() {
        return usuariosRepository.findAll();
    }

    public Usuarios buscarPorId(Integer id) {
        Optional <Usuarios> usuarios = usuariosRepository.findById(id);

        if (usuarios.isEmpty()) {
            throw new RuntimeException("Cliente não encontrado");
        }
        return usuarios.get();
    }

    public Usuarios criar(UsuariosDto dto) {
        var usuarios = new Usuarios();
        BeanUtils.copyProperties(dto, usuarios);
        return usuariosRepository.save(usuarios);
    }

    public void deletar(Integer id) {
        Optional <Usuarios> usuarios = usuariosRepository.findById(id);

        if (usuarios.isEmpty()) {
            throw new RuntimeException("Cliente não encontrado.");
        }
        usuariosRepository.delete(usuarios.get());
    }

    public Usuarios atualizar(Integer id, UsuariosDto dto) {
        Optional <Usuarios> usuarios = usuariosRepository.findById(id);

        if (usuarios.isEmpty()) {
            throw new RuntimeException("Cliente não encontrado.");
        }

        var usuariosModel = usuarios.get();
        BeanUtils.copyProperties(dto, usuariosModel);
        return usuariosRepository.save(usuariosModel);
    }
}
