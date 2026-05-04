package com.jefferson.gerenciadortarefas.infraestructure.busness.mapper;

import com.jefferson.gerenciadortarefas.infraestructure.busness.dto.TarefasDTO;
import com.jefferson.gerenciadortarefas.infraestructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TarefasConverter {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "dataEvento", target = "dataEvento")
    @Mapping(source = "dataCriacao", target = "dataCriacao")
    TarefasEntity paraTarefasEntity(TarefasDTO dto);
    TarefasDTO paraTarefasDTO(TarefasEntity entity);
    List<TarefasEntity> paraTarefasEntity(List<TarefasDTO> dtos);
    List<TarefasDTO> paraTarefasDTO(List<TarefasEntity> entities);
}
