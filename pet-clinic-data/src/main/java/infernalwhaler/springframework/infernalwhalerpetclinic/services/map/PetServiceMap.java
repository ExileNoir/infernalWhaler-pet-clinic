package infernalwhaler.springframework.infernalwhalerpetclinic.services.map;

import infernalwhaler.springframework.infernalwhalerpetclinic.model.Pet;
import infernalwhaler.springframework.infernalwhalerpetclinic.services.CrudService;
import infernalwhaler.springframework.infernalwhalerpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author ExileNoir
 * @project infernalwhaler-pet-clinic
 * @date 22/02/2021
 */

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(final Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(final Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(final Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(final Long id) {
        super.deleteById(id);
    }
}
