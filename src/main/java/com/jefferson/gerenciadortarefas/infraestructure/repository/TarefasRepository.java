package com.jefferson.gerenciadortarefas.infraestructure.repository;

import com.jefferson.gerenciadortarefas.infraestructure.entity.TarefasEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefasRepository extends MongoRepository <TarefasEntity,String> {

}
