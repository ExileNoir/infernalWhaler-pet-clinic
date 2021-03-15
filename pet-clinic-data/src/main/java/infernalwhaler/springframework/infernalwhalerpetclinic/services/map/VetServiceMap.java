package infernalwhaler.springframework.infernalwhalerpetclinic.services.map;

import infernalwhaler.springframework.infernalwhalerpetclinic.model.Vet;
import infernalwhaler.springframework.infernalwhalerpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author ExileNoir
 * @project infernalwhaler-pet-clinic
 * @date 22/02/2021
 */

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(final Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(final Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(final Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(final Long id) {
        super.deleteById(id);
    }
}
