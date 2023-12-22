package com.example.springrepo.PorscheBaseAPI.service;

import com.example.springrepo.PorscheBaseAPI.model.Porsche_DTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
@Component
public class Porsche_service_impl implements Porsche_service{
    private static List<Porsche_DTO> porsche_list = new ArrayList<>();
    private static Long index = 1L;
    static{
        porsche_list.add(new Porsche_DTO(index++,"911",1999));
        porsche_list.add(new Porsche_DTO(index++,"911 GT3",1999));

    }
    @Override
    public List<Porsche_DTO> load_cars() {
        return porsche_list;
    }

    @Override
    public Porsche_DTO find_car(long model_number) {
        return porsche_list.stream().filter(car->car.getModel_number().equals(model_number)).findFirst().get();
    }

    @Override
    public void create_car(Porsche_DTO porsche) {
        porsche.setModel_number(index++);
        porsche_list.add(porsche);
    }

    @Override
    public void update_car(long model_number, Porsche_DTO porsche) {
        porsche_list.stream().filter(car->car.getModel_number().equals(model_number)).findFirst().ifPresent
                (car->{porsche_list.set(porsche_list.indexOf(car),porsche);});
    }

    @Override
    public void delete_car(long model_number) {
        porsche_list.removeIf(car->car.getModel_number().equals(model_number));
    }
}
