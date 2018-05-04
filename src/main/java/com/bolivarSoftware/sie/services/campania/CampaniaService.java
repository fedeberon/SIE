package com.bolivarSoftware.sie.services.campania;

import com.bolivarSoftware.sie.domain.Campania;
import com.bolivarSoftware.sie.persist.interfaces.ICampaniaRepository;
import com.bolivarSoftware.sie.services.interfaces.ICampaniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CampaniaService implements ICampaniaService {

    @Autowired
    private ICampaniaRepository dao;

    @Override
    public Campania save(Campania campania) {
        return dao.save(campania);
    }

}
