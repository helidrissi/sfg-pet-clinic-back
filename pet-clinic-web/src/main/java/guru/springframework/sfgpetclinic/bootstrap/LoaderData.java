package guru.springframework.sfgpetclinic.bootstrap;


import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import guru.springframework.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LoaderData implements CommandLineRunner {

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private  VetService vetService;





    @Override
    public void run(String... args) throws Exception {

        Owner owner1=new Owner();

        owner1.setFirstName("hamza");
        owner1.setLastName("el idrissi");
        ownerService.save(owner1);

        Owner owner2=new Owner();

        owner2.setFirstName("taha");
        owner2.setLastName("bennana");
        ownerService.save(owner2);

        System.out.println("Owners as saved");

        Vet vet1=new Vet();

        vet1.setFirstName("ali");
        vet1.setLastName("alami");
        vetService.save(vet1);

        Vet vet2=new Vet();

        vet2.setFirstName("lina");
        vet2.setLastName("alaoui");
        vetService.save(vet2);

        System.out.println("Vets as saved");

    }
}
