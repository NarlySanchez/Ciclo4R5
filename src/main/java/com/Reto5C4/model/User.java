package com.Reto5C4.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author nbsc1
 * Reto 5 Ciclo 4
 */
@Document(collection = "usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class User implements Serializable {
        /**
         * Atributo que especifica llave primaria Id
         */
        @Id
        private Integer id;
        private String identification;
        private String name;
        private Date birthtDay;
        private String monthBirthtDay;
        private String address;
        private String cellPhone;
        private String email;
        private String password;
        private String zone;
        private String type;
}
