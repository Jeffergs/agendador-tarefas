package com.jefferson.gerenciadortarefas.infraestructure.busness.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTO {
    private String email;
    private String senha;
}
