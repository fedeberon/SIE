package com.bolivarSoftware.sie.services.interfaces;

import com.bolivarSoftware.sie.domain.Campania;
import com.bolivarSoftware.sie.domain.Encuesta;
import com.google.api.services.drive.model.File;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;


public interface IEncuestaService {
    List<File> getEncuestasEnGoogleDrive() throws IOException, GeneralSecurityException;


}
