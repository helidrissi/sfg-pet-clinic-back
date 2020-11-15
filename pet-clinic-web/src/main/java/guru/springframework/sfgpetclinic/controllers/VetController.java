package guru.springframework.sfgpetclinic.controllers;


import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RequestMapping("/vets")
@RestController
public class VetController {

    @Autowired
    private VetService vetService;


    @GetMapping
    public Set<Vet> listVets(){
        return vetService.finAll();
    }
}
