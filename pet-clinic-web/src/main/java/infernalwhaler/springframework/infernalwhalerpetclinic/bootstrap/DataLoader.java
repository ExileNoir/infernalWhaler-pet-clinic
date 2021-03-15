package infernalwhaler.springframework.infernalwhalerpetclinic.bootstrap;

import infernalwhaler.springframework.infernalwhalerpetclinic.model.Owner;
import infernalwhaler.springframework.infernalwhalerpetclinic.model.Vet;
import infernalwhaler.springframework.infernalwhalerpetclinic.services.OwnerService;
import infernalwhaler.springframework.infernalwhalerpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import static java.lang.System.out;

/**
 * @author ExileNoir
 * @project infernalwhaler-pet-clinic
 * @date 12/03/2021
 */

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        final Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        final Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        out.println("---- Loaded Owners ----");

        final Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        final Vet vet2 = new Vet();
        vet2.setFirstName("James");
        vet2.setLastName("Dean");

        vetService.save(vet2);

        out.println("---- Loaded Vets ----");
    }
}
