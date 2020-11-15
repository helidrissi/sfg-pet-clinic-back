package guru.springframework.sfgpetclinic.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/owners")
public class OwnersController {

    public String listOwners(){
        return "this is the list of owners";
    }
}
