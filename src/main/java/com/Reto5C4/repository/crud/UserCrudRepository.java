package com.Reto5C4.repository.crud;

import com.Reto5C4.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author nbsc1
 * Reto 5 Ciclo 4
 */
public interface UserCrudRepository extends MongoRepository<User, Integer> {

    /**
     * Metodo para listar usuarios por Identificacion
     * @param identification
     * @return
     */
    @Query("{'identification': ?0}")
    Optional<User> findByIdentificacion(final String identification);

    /**
     * Método para listar usuarios cuyo mes de cumpleaños sea el ingresado
     *
     * @param month
     * @return
     */
    List<User> findByMonthBirthtDay(String month);

}
