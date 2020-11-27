package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.Visit;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile({"default","map"})
public class VisitServiceMap extends AbstractMapService<Visit,Long> implements VisitService {
    @Override
    public Set<Visit> finAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit save(Visit visit) {
        if(visit.getPets()==null || visit.getPets().getId()==null || visit.getPets().getOwners()==null || visit.getPets().getOwners().getId()==null){
            throw new RuntimeException("Insertion Invalid");
        }
        return super.save(visit);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}
