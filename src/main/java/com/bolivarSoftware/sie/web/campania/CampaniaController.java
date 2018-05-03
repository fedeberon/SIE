package com.bolivarSoftware.sie.web.campania;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Damian Gallego on 3/5/2018.
 */

@Controller
@RequestMapping("campania")
public class CampaniaController {

    @RequestMapping("create")
    public String create() {
        return "campania/create";
    }

    @RequestMapping("save")
    public String save() {
        return "campania/show";
    }

    @RequestMapping("show")
    public String show() {
        return "campania/show";  // Se llama al definition de tiles-defs-xml
    }



}
