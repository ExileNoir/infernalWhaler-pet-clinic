package infernalwhaler.springframework.infernalwhalerpetclinic.services;

import java.util.Set;

/**
 * @author ExileNoir
 * @project infernalwhaler-pet-clinic
 * @date 22/02/2021
 */

public interface CrudService<T,ID> {

    Set<T> findAll();

    T findById(final ID id);

    T save(final T object);

    void delete(final T object);

    void deleteById(final ID id);
}
