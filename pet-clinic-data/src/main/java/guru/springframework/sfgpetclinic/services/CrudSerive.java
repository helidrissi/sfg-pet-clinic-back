package guru.springframework.sfgpetclinic.services;

import java.util.Set;

public interface CrudSerive<T,ID> {

    Set<T> finAll();
    T findById(ID id);
    T save(T object);
    void delete(T object);
    void deleteById(ID id);
}
