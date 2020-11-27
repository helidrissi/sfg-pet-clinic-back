package guru.springframework.sfgpetclinic.jparepository;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.repositories.PetRepository;
import guru.springframework.sfgpetclinic.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("SpringData")
public class PetSDJpaService implements PetService {
    @Autowired
    private PetRepository petRepository;

    @Override
    public Set<Pet> finAll() {
        Set<Pet> pets= new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        Optional<Pet> pet=petRepository.findById(aLong);

        if(pet.isPresent()){
            return pet.get();
        }


        return null;
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);

    }
}
