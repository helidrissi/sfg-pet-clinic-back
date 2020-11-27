package guru.springframework.sfgpetclinic.jparepository;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.repositories.OwnerRepository;
import guru.springframework.sfgpetclinic.repositories.PetRepository;
import guru.springframework.sfgpetclinic.repositories.VetRepository;
import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Profile("SpringData")
public class OwnerSDJpaService implements OwnerService {

    private OwnerRepository ownerRepository;
    private PetRepository petRepository;
    private VetRepository vetRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository, VetRepository vetRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.vetRepository = vetRepository;
    }

    @Override
    public Owner findByLastName(String lastname) {
        return ownerRepository.findByLastName(lastname);
    }

   @Override
    public Set<Owner> finAll() {

        Set<Owner> owners= new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }




    @Override
    public Owner findById(Long aLong) {
        Optional<Owner> owner=ownerRepository.findById(aLong);
        if(owner.isPresent()){
            return owner.get();
        }else{
            return null;
        }
    }

    @Override
    public Owner save(Owner object) {

        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("#############################");


        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
       ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
           ownerRepository.deleteById(aLong);
    }
}
