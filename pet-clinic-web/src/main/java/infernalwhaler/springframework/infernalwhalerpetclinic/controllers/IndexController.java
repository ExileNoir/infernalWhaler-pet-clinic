package infernalwhaler.springframework.infernalwhalerpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ExileNoir
 * @project infernalwhaler-pet-clinic
 * @date 22/02/2021
 */

@Controller
public class IndexController {

    @RequestMapping({"","/","index","index.html"})
    public String index(){

        return "index";
    }
}
