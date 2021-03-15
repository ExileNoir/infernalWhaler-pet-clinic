package infernalwhaler.springframework.infernalwhalerpetclinic.services;

import infernalwhaler.springframework.infernalwhalerpetclinic.model.Owner;

/**
 * @author ExileNoir
 * @project infernalwhaler-pet-clinic
 * @date 18/02/2021
 */

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(final String lastName);

}


