package com.example.springrepo.PorscheBaseAPI.model;

public class Porsche_DTO {
    private Long model_number;
    private String name;
    private int manufacture_year;

    public Porsche_DTO(Long model_number, String name, int manufacture_year) {
        this.model_number = model_number;
        this.name = name;
        this.manufacture_year = manufacture_year;
    }

    @Override
    public String toString() {
        return "Porsche_DTO{" +
                "model_number=" + model_number +
                ", name='" + name + '\'' +
                ", manufacture_year=" + manufacture_year +
                '}';
    }

    public Long getModel_number() {
        return model_number;
    }

    public void setModel_number(Long model_number) {
        this.model_number = model_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getManufacture_year() {
        return manufacture_year;
    }

    public void setManufacture_year(int manufacture_year) {
        this.manufacture_year = manufacture_year;
    }
}
