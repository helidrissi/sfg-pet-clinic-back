package guru.springframework.sfgpetclinic.controllers.vet;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/index")
    public String Index(){
        return  "This is the pet clinic Index page";
    }
}
