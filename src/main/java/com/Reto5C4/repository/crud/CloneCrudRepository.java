package com.Reto5C4.repository.crud;

import com.Reto5C4.model.Clone;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 *
 * @author nbsc1
 * Reto 5 Ciclo 4
 */
public interface CloneCrudRepository extends MongoRepository<Clone, Integer> {

    /**
     * Listar Clones que tengan un precio menor o igual al ingresado
     *
     * @param price
     * @return
     */
    List<Clone> findCloneByPriceIsLessThanEqual(Double price);

    /**
     * Listar Clones por un String enviado, si se encuentra en su descripción
     *
     * @param description
     * @return
     */
    List<Clone> findCloneByDescriptionRegex(String description);

}
