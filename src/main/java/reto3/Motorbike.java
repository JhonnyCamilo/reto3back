/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Clase Motorbike.java
 * Permite crear la tabla Motorbike, crear los atributos, crear las relaciones de
 * esta tabla con las tablas categorias, message y reservations
 * y los metodos para recuperar los valores de los atributos y asignar valores
 * @author Helman
 */
@Entity
@Table(name = "Motorbike")
class Motorbike implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String brand;
    private Integer year;
    private String description;
    
    @ManyToOne
    @JoinColumn(name = "categoryId")
    @JsonIgnoreProperties("Motorbike")
    private Categoria category;

     @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "motorbike")
    @JsonIgnoreProperties({"Motorbike", "client"})
    private List<Mensaje> messages;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "motorbike")
    @JsonIgnoreProperties({"Motorbike", "client"})
    private List<Reservaciones> reservations;

    
    /**
     * retorna el valor del atríbuto id
     * @return 
     */
    public Integer getId() {
        return id;
    }
    /**
     * Asigna el valor del atríbuto id
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Retorna el valor del atríbuto name
     * @return 
     */
    public String getName() {
        return name;
    }
    /**
     * Asigna el valor del atríbuto name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retorna el valor del atríbuto marca
     * @return 
     */
    public String getBrand() {
        return brand;
    }
    /**
     * Asigna el valor del atríbuto marca
     */
     
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Retorna el valor del atríbuto year
     * @return 
     */
    public Integer getYear() {
        return year;
    }
    /**
     * Asigna el valor del atríbuto year
     * @param year 
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * Retorna el valor del atríbuto description 
     */
     
    public String getDescription() {
        return description;
    }

    /**
     * Asigna el valor del atríbuto Description
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Retorna el valor del atríbuto Category
     * @return 
     */
    public Categoria getCategory() {
        return category;
    }

    /**
     * Asigna el valor al atríbuto category
     * @param category 
     */
    public void setCategory(Categoria category) {
        this.category = category;
    }
    /**
     * Retorna el valor de la lista Mensaje
     * @return 
     */
    public List<Mensaje> getMessages() {
        return messages;
    }
    /**
     * Asigna el valor del atríbuto lista Mensaje
     * @param messages 
     */
    public void setMessages(List<Mensaje> messages) {
        this.messages = messages;
    }

    /**
     * Retorna el valor de la lista reservation
     * @return 
     */
    public List<Reservaciones> getReservations() {
        return reservations;
    }
    /**
     * Asigna el valor del atríbuto lista reservation
     * @param reservations 
     */
    public void setReservations(List<Reservaciones> reservations) {
        this.reservations = reservations;
    }

    
    
}
