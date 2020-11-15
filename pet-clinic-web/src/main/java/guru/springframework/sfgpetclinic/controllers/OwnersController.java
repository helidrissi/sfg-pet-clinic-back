package guru.springframework.sfgpetclinic.controllers;


import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/owners")
public class OwnersController {

    @Autowired
    private OwnerService ownerService;

    @GetMapping
    public Set<Owner> listOwners(){

        return ownerService.finAll();
    }
}
