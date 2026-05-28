package com.oliveiradev.gestao_tarefas.controller;

import com.oliveiradev.gestao_tarefas.dto.TarefasDto;
import com.oliveiradev.gestao_tarefas.dto.UsuariosDto;
import com.oliveiradev.gestao_tarefas.model.Tarefas;
import com.oliveiradev.gestao_tarefas.model.Usuarios;
import com.oliveiradev.gestao_tarefas.repository.TarefasRepository;
import com.oliveiradev.gestao_tarefas.service.TarefasService;
import com.oliveiradev.gestao_tarefas.service.UsuariosService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v2/tarefas")
public class TarefasController {

    private final TarefasService tarefasService;

    public TarefasController(TarefasService tarefasService) {
        this.tarefasService = tarefasService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Tarefas> listar() {
        return tarefasService.listar();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Tarefas buscarPorId(@PathVariable(value = ("id")) Integer id) {
        return tarefasService.buscarPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Tarefas criar(@RequestBody TarefasDto dto) {
        return tarefasService.criar(dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable(value = ("id")) Integer id) {
        tarefasService.deletar(id);
    }

    @PutMapping("/{id}")
    public Tarefas atualizar(@PathVariable(value = ("id")) Integer id, @RequestBody TarefasDto dto) {
        return tarefasService.atualizar(id, dto);
    }
}
