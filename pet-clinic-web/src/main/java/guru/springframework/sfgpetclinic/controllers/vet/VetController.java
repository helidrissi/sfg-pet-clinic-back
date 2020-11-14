package guru.springframework.sfgpetclinic.controllers.vet;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VetController {

    @GetMapping("/vet")
    public String vetIndex(){
        return "this is the vet index";
    }
}
