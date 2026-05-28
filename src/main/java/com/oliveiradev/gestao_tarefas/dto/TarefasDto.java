package com.oliveiradev.gestao_tarefas.dto;

import com.oliveiradev.gestao_tarefas.model.Usuarios;

public record TarefasDto(String titulo, String descricao, String status, Usuarios usuario) {
}
