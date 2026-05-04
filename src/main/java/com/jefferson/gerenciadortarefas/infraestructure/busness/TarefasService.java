package com.jefferson.gerenciadortarefas.infraestructure.busness;

import com.jefferson.gerenciadortarefas.infraestructure.busness.dto.TarefasDTO;
import com.jefferson.gerenciadortarefas.infraestructure.busness.mapper.TarefasConverter;
import com.jefferson.gerenciadortarefas.infraestructure.entity.TarefasEntity;
import com.jefferson.gerenciadortarefas.infraestructure.enums.StatusNotificacaoEnum;
import com.jefferson.gerenciadortarefas.infraestructure.repository.TarefasRepository;
import com.jefferson.gerenciadortarefas.infraestructure.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TarefasService {

    private final TarefasRepository tarefasRepository;
    private final TarefasConverter tarefaConverter;
    private final JwtUtil jwtUtil;

    public TarefasDTO gravarTarefa(String token, TarefasDTO dto) {
        String email = jwtUtil.extrairEmailToken(token.substring(7));
        dto.setDataCriacao(LocalDateTime.now());
        dto.setStatusNotificacaoEnum(StatusNotificacaoEnum.PENDENTE);
        dto.setEmailUsuario(email);
        TarefasEntity entity = tarefaConverter.paraTarefasEntity(dto);

        return tarefaConverter.paraTarefasDTO(
                tarefasRepository.save(entity)
        );
    }
}
