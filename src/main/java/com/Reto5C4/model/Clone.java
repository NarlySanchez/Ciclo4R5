package com.Reto5C4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

/**
 *
 * @author nbsc1
 * Reto 5 Ciclo 4
 */
@Document(collection = "clone")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Clone{

        /**
         * Atributo que especifica la llave primaria Id
         */
        @Id
        private Integer id;
        private String brand;
        private String procesor;
        private String os;
        private String description;
        private String memory;
        private String hardDrive;
        private boolean availability = true;
        private double price;
        private int quantity;
        private String photography;
}
