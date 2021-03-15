package infernalwhaler.springframework.infernalwhalerpetclinic.controllers;

import infernalwhaler.springframework.infernalwhalerpetclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ExileNoir
 * @project infernalwhaler-pet-clinic
 * @date 23/02/2021
 */

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/index","/index.html"})
    public String listOwners(final Model model){
        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }
}
