package com.bolivarSoftware.sie.web.encuesta;

import com.bolivarSoftware.sie.services.interfaces.IEncuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.security.GeneralSecurityException;

/**
 * Created by Fede Beron on 02/05/2018.
 */
@Controller
@RequestMapping("encuestas")
public class EncuestaController {

    @Autowired
    private IEncuestaService encuestaService;

    @RequestMapping("list")
    public String main(Model model) throws IOException, GeneralSecurityException {
        model.addAttribute("files", encuestaService.getEncuestasEnGoogleDrive());

        return "encuestas/list";
    }

}
