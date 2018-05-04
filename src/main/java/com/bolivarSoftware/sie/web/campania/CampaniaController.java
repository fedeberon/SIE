package com.bolivarSoftware.sie.web.campania;

import com.bolivarSoftware.sie.domain.Campania;
import com.bolivarSoftware.sie.services.interfaces.ICampaniaService;
import com.bolivarSoftware.sie.services.interfaces.IEncuestaService;
import com.google.api.services.drive.model.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("campania")
public class CampaniaController {

    @Autowired
    private IEncuestaService encuestaService;

    @Autowired
    private ICampaniaService campaniaService;

    @RequestMapping("create")
    public String create() {
        return "campania/create";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(@ModelAttribute Campania campania) {
        campaniaService.save(campania);

        return "campania/show";
    }

    @RequestMapping("show")
    public String show() {
        return "campania/show";  // Se llama al definition de tiles-defs-xml
    }

    @ModelAttribute("campania")
    public Campania getCampania(){
        return new Campania();
    }

    @ModelAttribute("encuestas")
    public List<File> getEncuestas() throws IOException, GeneralSecurityException {
        return encuestaService.getEncuestasEnGoogleDrive();
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        sdf.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }
}
