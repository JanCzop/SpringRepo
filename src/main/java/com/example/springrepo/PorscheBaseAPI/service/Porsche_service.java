package com.example.springrepo.PorscheBaseAPI.service;

import com.example.springrepo.PorscheBaseAPI.model.Porsche_DTO;

import java.util.List;

public interface Porsche_service {
    List<Porsche_DTO> load_cars();
    Porsche_DTO find_car(long model_number);
    void create_car(Porsche_DTO porsche);
    void update_car(long model_number,Porsche_DTO porsche);
    void delete_car(long model_number);
}
