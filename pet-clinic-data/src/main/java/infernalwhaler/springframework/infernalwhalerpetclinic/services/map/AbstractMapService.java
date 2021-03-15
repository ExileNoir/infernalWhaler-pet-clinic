package infernalwhaler.springframework.infernalwhalerpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author ExileNoir
 * @project infernalwhaler-pet-clinic
 * @date 22/02/2021
 */

public abstract class AbstractMapService<T, ID> {

    protected final Map<ID, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(final ID id) {
        return map.get(id);
    }

    T save(final ID id, final T object) {
        return map.put(id, object);
    }

    void deleteById(final ID id) {
        map.remove(id);
    }

    void delete(final T object) {
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));
    }

}
