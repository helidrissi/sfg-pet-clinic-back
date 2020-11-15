package guru.springframework.sfgpetclinic.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/vets")
@RestController
public class VetController {

    @GetMapping
    public String vetIndex(){
        return "this is the vet list";
    }
}
