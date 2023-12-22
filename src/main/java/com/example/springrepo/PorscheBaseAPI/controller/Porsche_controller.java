package com.example.springrepo.PorscheBaseAPI.controller;

import com.example.springrepo.PorscheBaseAPI.model.Porsche_DTO;
import com.example.springrepo.PorscheBaseAPI.service.Porsche_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Porsche_controller {
    @Autowired
    private Porsche_service porsche_service;
    @GetMapping("/load")
    public List<Porsche_DTO> load_cars(){return porsche_service.load_cars();
    }
    @GetMapping("/find/{model_number}")
    public Porsche_DTO find_car(@PathVariable long model_number){
        return porsche_service.find_car(model_number);
    }
    @PostMapping("/create")
    public void create_car(@RequestBody Porsche_DTO porsche){
        porsche_service.create_car(porsche);
    }
    @PutMapping("/update/{model_number}")
    public void update_car(@PathVariable long model_number,@RequestBody Porsche_DTO porsche){
        porsche_service.update_car(model_number,porsche);
    }@DeleteMapping("/delete/{model_number}")
    public void delete_car(@PathVariable long model_number){
        porsche_service.delete_car(model_number);
    }

}
