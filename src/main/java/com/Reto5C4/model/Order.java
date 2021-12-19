package com.Reto5C4.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author nbsc1
 * Reto 5 Ciclo 4
 */
@Document(collection = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order implements Serializable {

        public static String PENDING = "Pendiente";  //Es constante porque tiene el atributo static y debe ser publica
        public static String APROVED = "Aprobada";
        public static String REJECTED = "Rechazada";

        @Id
        private Integer id;
        private String registerDay;
        private String status;
        private User salesMan;
        private Map<Integer, Clone> products;
        private Map<String, Integer> quantities;

}
