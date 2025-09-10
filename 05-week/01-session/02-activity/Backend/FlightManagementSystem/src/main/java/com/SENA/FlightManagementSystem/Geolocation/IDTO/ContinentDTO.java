package com.SENA.FlightManagementSystem.Geolocation.IDTO;

public class ContinentDTO {

    private String id;
    private String code;
    private String name;
    private String description;

    // Constructor vacío
    public ContinentDTO() {}

    // Constructor con todos los campos
    public ContinentDTO(String id, String code, String name, String description) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
    }

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Método toString opcional
    @Override
    public String toString() {
        return "ContinentDTO{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}