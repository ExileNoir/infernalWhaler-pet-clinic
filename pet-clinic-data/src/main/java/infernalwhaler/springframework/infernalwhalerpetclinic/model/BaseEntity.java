package infernalwhaler.springframework.infernalwhalerpetclinic.model;

import java.io.Serializable;

/**
 * @author ExileNoir
 * @project infernalwhaler-pet-clinic
 * @date 18/02/2021
 */

public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
