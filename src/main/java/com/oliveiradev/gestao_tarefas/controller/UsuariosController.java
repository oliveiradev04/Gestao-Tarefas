package com.oliveiradev.gestao_tarefas.controller;

import com.oliveiradev.gestao_tarefas.dto.UsuariosDto;
import com.oliveiradev.gestao_tarefas.model.Usuarios;
import com.oliveiradev.gestao_tarefas.repository.UsuariosRepository;
import com.oliveiradev.gestao_tarefas.service.TarefasService;
import com.oliveiradev.gestao_tarefas.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/usuarios")
public class UsuariosController {

    private final UsuariosService usuariosService;

    public UsuariosController(UsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Usuarios> listar() {
        return usuariosService.listar();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Usuarios buscarPorId(@PathVariable(value = "id") Integer id) {
        return usuariosService.buscarPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuarios criar(@RequestBody UsuariosDto dto) {
        return usuariosService.criar(dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable(value = "id") Integer id) {
        usuariosService.deletar(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Usuarios atualizar(@PathVariable(value = "id") Integer id, @RequestBody UsuariosDto dto) {
        return usuariosService.atualizar(id, dto);
    }
}
