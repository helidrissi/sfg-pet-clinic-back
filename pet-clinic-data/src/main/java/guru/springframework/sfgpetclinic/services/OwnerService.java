package guru.springframework.sfgpetclinic.services;




import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudSerive<Owner,Long> {


    Owner findByLastName(String lastname);

}
